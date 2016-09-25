package com.py.test.core;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * Created by DavidWang on 16/9/14.
 */

/**
 * 建立动态数据源类
 */
public class MultipleDataSource extends AbstractRoutingDataSource {

    @Override
    public java.util.logging.Logger getParentLogger() {
        return super.getParentLogger();
    }

    // 在进行DAO操作前，通过上下文环境变量，获得数据源的类型
    @Override
    protected Object determineCurrentLookupKey() {
        return DataSourceContextHolder.getDBType();
    }

}
