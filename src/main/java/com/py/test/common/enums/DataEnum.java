package com.py.test.common.enums;

/**
 * Created by digua on 2016/9/14.
 * 数据权限枚举类
 */
public enum DataEnum {


    //所有组织
    DATAROLE_ALL(7),
    //个人
    DATAROLE_PERSONAL(4),
    //部门
    DATAROLE_DEPARTMENT(5),
    //组织
    DATAROLE_ORGANIZATION(6);

    private int value;

    private DataEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
