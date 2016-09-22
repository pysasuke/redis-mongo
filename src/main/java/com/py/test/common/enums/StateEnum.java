package com.py.test.common.enums;

/**
 * Created by digua on 2016/9/13.
 * 客户跟进状态枚举类
 */
public enum StateEnum {
    /**
     * 新增
     */
    ADD(1,"10"),
    /**
     * 已转电销
     */
    TURNDPHONESALE(2,"20"),
    /**
     * 未接听
     */
    NOANSWER(3,"30"),
    /**
     * 需跟进
     */
    NEEDFOLLOW(4,"40"),
    /**
     * 无法到店
     */
    CANTTOSTORE(5,"50"),

    /**
     * 转新媒体
     */
    TURNDNEWMEDIA(6,"60"),

    /**
     * 已预约
     */
    APPOINTMENT(7,"70"),

    /**
     * 已转销售
     */
    TURNDSALE(8,"80"),

    /**
     * 到店未成交
     */
    STORENOTDEAL(9,"90"),

    /**
     * 到店付定
     */
    STOREDEALED(10,"100"),

    /**
     * 成交原因
     */
    DEALREASON(11,"110"),

    /**
     * 已转设计
     */
    TURNDDESINGER(12,"120"),

    /**
     * 方案设计中
     */
    DESINGING(13,"130"),

    /**
     * 图纸待审核
     */
    DESINGNEEDAUDIT(14,"140"),

    /**
     * 图纸已审核
     */
    DESINGAUDITED(15,"150"),

    /**
     * 合同已生成
     */
    CONTRACTCREATED(16,"160"),

    /**
     * 无法付首款
     */
    NOPAYFIRSTMONEY(17,"170"),

    /**
     * 待开工
     */
    NEEDTOSTART(18,"180");

    private int value;

    private String code;

    private StateEnum(int iValue,String code)
    {
        this.value = iValue;
        this.code = code;
    }

    public int getValue()
    {
        return this.value;
    }

    public String getCode(){
        return this.code;
    }
}
