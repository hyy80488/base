package com.jw.base.framework.core.breakdown;

public interface PmsSupplier<T> {
    T get() throws Exception;
}
