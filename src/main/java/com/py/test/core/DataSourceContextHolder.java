package com.py.test.core;

/**
 * Created by DavidWang on 16/9/14.
 */
public class DataSourceContextHolder {

    private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();
    public static void setDBType(String dbType) {
        contextHolder.set(dbType);
    }
    public static String getDBType() {
        return contextHolder.get();
    }
    public static void clearDBType() {
        contextHolder.remove();
    }

}
