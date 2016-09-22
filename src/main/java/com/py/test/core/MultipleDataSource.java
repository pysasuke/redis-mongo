package com.py.test.core;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * Created by DavidWang on 16/9/14.
 */
public class MultipleDataSource extends AbstractRoutingDataSource {

    @Override
    public java.util.logging.Logger getParentLogger() {
        return super.getParentLogger();
    }

    @Override
    protected Object determineCurrentLookupKey() {
        return DataSourceContextHolder.getDBType();
    }

}
