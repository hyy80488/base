package com.jw.base.framework.core.tablecopy;

public interface TableToSave<I1,I2,O> {
	O todo(I1 i1,I2 i2) throws Exception;
}
