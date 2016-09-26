package com.py.test.core;

/**
 * Created by DavidWang on 16/9/14.
 */

/**
 *  建立一个获得和设置上下文环境的类，主要负责改变上下文数据源的名称
 */
public class DataSourceContextHolder {

    // 线程本地环境
    private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();
    // 设置数据源类型
    public static void setDBType(String dbType) {
        contextHolder.set(dbType);
    }
    // 获取数据源类型
    public static String getDBType() {
        return contextHolder.get();
    }
    // 清除数据源类型
    public static void clearDBType() {
        contextHolder.remove();
    }

}
