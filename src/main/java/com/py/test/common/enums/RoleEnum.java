package com.py.test.common.enums;

/**
 * Created by digua on 2016/9/13.
 * 角色枚举类
 */
public enum RoleEnum {
    /**
     * 客户经理
     */
    CUSTOMERMANAGER(1,4),
    /**
     * 客户经理主管
     */
    CUSTOMERMANAGERDIRECTOR(2,5),
    /**
     * 电销员
     */
    TELEPHONESALES(3,5),
    /**
     * /电销主管
     */
    TELEPHONESALESDIRECTOR(4,5),
    /**
     * 总经理助理
     */
    ASSISTANTGENERALMANAGER(5,6),

    /**
     * 管理员
     */
    ADMINISTRATOR(6,7),

    /**
     * 设计师
     */
    DESIGNER(7,4),

    /**
     * 审图员
     */
    DESIGNAPPROVAL(8,6),

    /**
     * 拆单员
     */
    ORDERSPLITER(9,6),

    /**
     * 财务
     */
    FINANCIAL(10,6),

    /**
     * 仓管
     */
    WAREHOUSE(12,6),

    /**
     * PMC
     */
    PMC(13,6),

    /**
     * 集团财务
     */
    GROUPFINANCIAL(14,7),

    /**
     * 集团采购
     */
    GROUPPROCUREMENT(15,7);

    private int value;

    private int right;



    RoleEnum(int iValue,int right)
    {
        this.value = iValue;
        this.right = right;
    }

    public int getValue()
    {
        return this.value;
    }
    public int getRight(){
        return this.right;
    }
    public static int getRoleRight(int ordinal)
    {
        for (RoleEnum e : RoleEnum.values())
        {
            if (ordinal == e.value)
            {
                return e.right;
            }
        }
        return 0;
    }
}
