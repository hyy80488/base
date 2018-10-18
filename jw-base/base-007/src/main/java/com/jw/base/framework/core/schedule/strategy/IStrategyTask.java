package com.jw.base.framework.core.schedule.strategy;

public interface IStrategyTask {
   public void initialTaskParameter(String taskParameter);
   public void stop() throws Exception;
}
