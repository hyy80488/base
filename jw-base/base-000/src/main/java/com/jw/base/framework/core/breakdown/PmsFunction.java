package com.jw.base.framework.core.breakdown;

public interface PmsFunction<T, R> {
    R apply(T t) throws Exception;
}
