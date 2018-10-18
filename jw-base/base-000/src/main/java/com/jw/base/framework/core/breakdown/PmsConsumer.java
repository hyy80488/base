package com.jw.base.framework.core.breakdown;

public interface PmsConsumer<T> {
    void accept(T t) throws Exception;
}
