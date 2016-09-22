package com.py.test.common.enums;


/**
 * Created by digua on 2016/9/7.
 * 通用枚举类
 */

public class CommonEnum
{
    
    /**
     * 通用是否
     */
    public static enum COMMON_IS
    {
        NO("0"), // 否
        YES("1"); // 是
        
        private String value;
        
        private COMMON_IS(String iValue)
        {
            this.value = iValue;
        }
        
        public String getValue()
        {
            return this.value;
        }
    }

    
    /**
     * 用户登录状态
     */
    public static enum ACCOUNT_LOGIN_STATUS
    {
        YES("1"), // 用户已登录
        NO("2"); // 用户未登录
        
        private String value;
        
        private ACCOUNT_LOGIN_STATUS(String iValue)
        {
            this.value = iValue;
        }
        
        public String getValue()
        {
            return this.value;
        }
    }
    

    
    /**
     * 短信验证码渠道类型
     */
    public static enum SMS_VERIFY_CHANNEL_TYPE
    {
        SMS(1), // 短信
        VOICE(2); // 语音
        
        private int value;
        
        private SMS_VERIFY_CHANNEL_TYPE(int iValue)
        {
            this.value = iValue;
        }
        
        public int getValue()
        {
            return this.value;
        }
    }
    
    /**
     * 短信验证码类型
     */
    public static enum SMS_VERIFY_TYPE
    {
        REGISTER(1), // 用于注册
        RESET(2), // 用于找回密码
        SPEEDY_LOGIN(3), // 快速登录
        BINDING_MOBILE(4); // 绑定手机号

        private int value;
        
        private SMS_VERIFY_TYPE(int iValue)
        {
            this.value = iValue;
        }
        
        public int getValue()
        {
            return this.value;
        }
    }
    

    
    /**
     * 协议返回状态
     */
    public static enum PROTOCOL_RESPONSE_STATUS
    {
        FAILED("0","失败"), // 失败
        SUCCEED("1","成功"), // 成功
        INVALID("2","无效密钥"), // 无效密钥
        UNLOGIN("10","未登录");//用户未登录
        
        private String value;
        private String desc;
        
        private PROTOCOL_RESPONSE_STATUS(String iValue,String idesc)
        {
            this.value = iValue;
            this.desc = idesc;
        }
        
        public String getValue()
        {
            return this.value;
        }

        public String getDesc() {
            return this.desc;
    }
    }
    
    /**
     * 业务返回状态
     */
    public static enum BUSINESS_RESPONSE_STATUS
    {
        FAILED("0"), // 失败
        SUCCEED("1"); // 成功

        private String value;
        
        private BUSINESS_RESPONSE_STATUS(String iValue)
        {
            this.value = iValue;
        }
        
        public String getValue()
        {
            return this.value;
        }
    }
    

}
