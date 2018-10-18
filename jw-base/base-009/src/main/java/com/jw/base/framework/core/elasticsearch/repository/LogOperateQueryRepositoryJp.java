package com.jw.base.framework.core.elasticsearch.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.repository.Repository;

import com.jw.base.framework.core.elasticsearch.domain.LogOperateDomainJp;


/**
 * 基础的repository接口
 * spring
 * data自动生成实现类，此处集成自定义的接口是为了在自动生成的实现类中添加自定义的实现（注意：实现类是这个基础的repository接口加上Impl后缀，这样才能被spring自动扫描到）
 * ElasticsearchRepository 继承 PagingAndSortingRepository,
 * PagingAndSortingRepository提供了分页和排序的支持
 */
public interface LogOperateQueryRepositoryJp extends Repository<LogOperateDomainJp, Long> {

	@Query("{\"bool\": {\"must\": [{\"term\": {\"chainUid\": \"?0\"}},{\"term\":{\"unitUid\": \"?1\"}}]}}")
    Page<LogOperateDomainJp> findByChainUidAndUnitUid(String chainuid, String unituid, Pageable pageable);
}
