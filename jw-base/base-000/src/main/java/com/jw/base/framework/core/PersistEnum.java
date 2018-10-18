/**
 * 
 */
package com.jw.base.framework.core;

import java.util.Map;

/**
 * @author CHENJINGANG email:chen_jingang(a)nec.cn
 * @version 1.0
 * @since 2014-07-01
 *
 */
public interface PersistEnum<E extends Enum<?>> {

    /**
     * 获取被持久化字段的值
     * 
     * @return 被持久化字段的值
     */
    String getPersistedValue();
    
    /**
     * 由被持久化的字段的值获取枚举类型
     * 
     * @param persistedValue
     * @return
     */
    E returnEnum(String persistedValue);
    
    /**
     * 获取枚举的所有枚举项
     * 
     * @return map
     */
    Map<String, E> getAllValueMap();

    /**
     * 获取枚举的所有枚举项
     * 
     * @return E[]
     */
    E[] getAllValue();
    
    /**
     * 获取用于显示的国际化的值
     * 
     * @return 用于显示的国际化的值
     */
    String getDisplayValue();

}
