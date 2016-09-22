package com.py.test.core.aop.log;

/**
 * Created by digua on 2016/9/9.
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)//注解会在class中存在，运行时可通过反射获取
@Target(ElementType.METHOD)//目标是方法
public @interface MWLog {
    public String id() default "-1";
    public enum OpType{ ADD,UPDATE, DEL, SEARCH};
    OpType type() default OpType.SEARCH;
}