package com.jw.base.framework.core.mongodb;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.ArrayUtils;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.jw.base.framework.core.util.page.Page;
import com.jw.common.framework.m0002.f001.dto.DataTableDto;

public class MongoDaoImpl<T, PK extends Serializable> implements MongoDao<T, PK> {
    @Autowired
    protected MongoOperations mongoOper;
    protected Class<T>        entityClazz;
    /**
     * 字符串分隔的标志符号，现在用:表示，在关联查询的时候用。
     ***/
    private final String      splitMarker = "::";

    public MongoDaoImpl(MongoOperations mongoOper, Class<T> entityClazz) {
        this.mongoOper = mongoOper;
        this.entityClazz = entityClazz;
    }

    @Override
    public PK save(T entity) {
        return null;
    }

    @Override
    public void update(T entity) {
         mongoOper.save(entity);
    }

    @Override
    public void saveOrUpdate(T entity) {
        mongoOper.save(entity);
    }

    @Override
    public void saveOrUpdate(Collection<T> entities) {
        for (T entity : entities) {
            mongoOper.save(entity);
        }
    }

    @Override
    public void delete(T entity) {
        mongoOper.remove(entity);
    }

    @Override
    public void deleteAll(Collection<T> entities) {
        for (T entity : entities) {
            mongoOper.remove(entity);
        }
    }

    @Override
    public void deleteById(PK id) {
        mongoOper.remove(new Query(Criteria.where("_id").is(id)), entityClazz);
    }

    @Override
    public T get(PK id) {
        return mongoOper.findById(id, entityClazz);
    }

    @Override
    public List<T> getAll() {
        return this.mongoOper.findAll(entityClazz);
    }

    @Override
    public List<T> findBy(String propertyName, Object value) {
        HashMap<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put(propertyName, value);
        return this.findBy(paramMap, null);
    }

    @Override
    public List<T> findBy(Map<String, Object> paramMap, List<Order> orderList) {
        Query query = this.buildQuery(paramMap, orderList);
        return mongoOper.find(query, entityClazz);
    }

    @Override
    public T findUniqueBy(String propertyName, Object value) {
        HashMap<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put(propertyName, value);
        Query query = this.buildQuery(paramMap, null);
        return mongoOper.findOne(query, entityClazz);
    }

    @Override
    public T findUniqueBy(Map<String, Object> paramMap, List<Order> orderList) {
        Query query = this.buildQuery(paramMap, orderList);
        return mongoOper.findOne(query, entityClazz);
    }

    @Override
    public DataTableDto pageList(Map<String, Object> paramMap, List<Order> orderList, Page page) {
        Query query = this.buildQuery(paramMap, orderList);
        page.setListSize((int) mongoOper.count(query, entityClazz));// 总记录数
        query.skip(page.getCurrentPage());
        query.limit(page.getPageSize());
        
        DataTableDto table = new DataTableDto();
		table.setData(mongoOper.find(query, entityClazz));
		table.setRecordsTotal(page.getListSize());
		table.setCurrentPage(page.getCurrentPage());
		table.setPageSize(page.getPageSize());
		return table;
    }

    public Class<T> getEntityClazz() {
        return entityClazz;
    }

    public void setEntityClazz(Class<T> entityClazz) {
        this.entityClazz = entityClazz;
    }

    protected void buildQuery(String key, Object value, Query query) {
        // 如果为数字
        if (key.contains("_id")) {
            query.addCriteria(Criteria.where(key).is(new ObjectId(value.toString())));
        } else {
            if (value instanceof Integer || value instanceof Float || value instanceof Double
                || value instanceof Boolean) {
                query.addCriteria(Criteria.where(key).is(value));
            } else {
                // 字符串 模糊查询
                // i为查询大小写不敏感
                query.addCriteria(Criteria.where(key).regex(value.toString(), "i"));
            }
        }
    }

    protected Query buildQuery(Map<String, Object> paramMap, List<Order> orderList) {
        Query query = new Query();
        if (paramMap != null && paramMap.size() > 0) {
            for (String key : paramMap.keySet()) {
                Object value = paramMap.get(key);
                if (key.contains(this.splitMarker)) {// 处理关联查询的情况
                    String[] arr = key.split(this.splitMarker);
                    if (arr.length != 2) {
                        continue;
                    }
                    String p1 = arr[0];
                    String p2 = arr[1];

                    Field[] fs = this.getAllFields(entityClazz);
                    // ReflectUtils.getAllFields(clazz);

                    Class<?> clazz1 = null;
                    for (Field f : fs) {
                        if (f.getName().equals(p1)) {
                            clazz1 = f.getType();
                            break;
                        }
                    }
                    Query query0 = new Query();
                    this.buildQuery(p2, value, query0);
                    query.addCriteria(Criteria.where(p1).in(mongoOper.find(query0, clazz1)));

                } else {
                    this.buildQuery(key, value, query);
                }
            }
        }

        if (orderList != null && orderList.size() > 0) {
            Sort sort = new Sort(orderList);
            query.with(sort);
        }

        return query;
    }

    private Field[] getAllFields(Class<? super T> clazz) {

        Class<?> originClazz = clazz;
        Field[] resultField = clazz.getDeclaredFields();

        for (; clazz != Object.class; clazz = clazz.getSuperclass()) {
            if (clazz == originClazz) {
                continue;
            }
            try {
                Field[] superFields = clazz.getDeclaredFields();
                resultField = (Field[]) ArrayUtils.addAll(resultField, superFields);
            } catch (Exception e) {
                System.out.println("error");
            }
        }

        return resultField;
    }

}