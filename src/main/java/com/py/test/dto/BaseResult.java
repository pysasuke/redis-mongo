package com.py.test.dto;


import com.py.test.common.enums.CommonEnum;

/**
 * Created by digua on 2016/9/7.
 */
public class BaseResult {

    public BaseResult(){
        this.status= CommonEnum.PROTOCOL_RESPONSE_STATUS.SUCCEED.getValue();
        this.msg = CommonEnum.PROTOCOL_RESPONSE_STATUS.SUCCEED.name();
    }
    public BaseResult(String status, String msg){
        this.status= status;
        this.msg = msg;
    }
    public BaseResult(String status, String msg, Object value){
        this.status= status;
        this.msg = msg;
        this.value = value==null?"":value;
    }
    private String status;
    private String msg;
    private Object value;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
