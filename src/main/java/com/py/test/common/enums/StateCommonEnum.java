package com.py.test.common.enums;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by digua on 2016/9/14.
 * 客户跟进状态统一枚举类
 */
public enum StateCommonEnum {
    //新客户
    TYPE_TS_NEW_CUSTOMER(0),
    //需跟进
    TYPE_TS_NEED_FOLLOW_UP(1),
    //已转销nm售
    TYPE_TS_HAVE_SALES(2),
    //回收池
    TYPE_TS_RECYCLING_POOL(3),
    //销售跟进
    TYPE_S_SALES_FOLLOW_UP(4),
    //转设计
    TYPE_S_TURN_DESIGN (5),
    //已成交
    TYPE_S_COMPLETE(6),
    //回收池
    TYPE_S_RECYCLING_POOL(7),
    //客户档案(跟踪)
    TYPE_TRACKING (8);

    private int value;


    private StateCommonEnum(int iValue)
    {
        this.value = iValue;
    }

    public int getValue()
    {
        return this.value;
    }
    public List<Integer> getMenuList(){
        List<Integer> list = new ArrayList<Integer>();
        switch (this.value){
            case 0:
                list.add(1);
                list.add(2);
                list.add(3);
                break;
            case 1:
                list.add(4);
                list.add(9);
                break;
            case 2:
                list.add(7);
                list.add(8);
                list.add(10);
                list.add(11);
                list.add(12);
                list.add(13);
                list.add(14);
                list.add(15);
                list.add(16);
                list.add(17);
                list.add(18);
                break;
            case 3:
                list.add(5);
                list.add(6);
                break;
            case 4:
                list.add(8);
                list.add(10);
                break;
            case 5:
                list.add(12);
                list.add(13);
                list.add(14);
                list.add(15);
                break;
            case 6:
                list.add(16);
                list.add(18);
                break;
            case 7:
                list.add(9);
                list.add(17);
                break;
            case 8:
                list.add(10);
                list.add(12);
                list.add(13);
                list.add(14);
                list.add(15);
                break;

        }
        return list;
    }

}
