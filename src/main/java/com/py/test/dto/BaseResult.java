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
    public BaseResult(String status, String msg, Object data){
        this.status= status;
        this.msg = msg;
        this.data = data==null?"":data;
    }
    private String status; //返回状态  1:成功 ，0:失败
    private String msg; //返回信息
    private Object data;//返回数据

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

    public Object getdata() {
        return data;
    }

    public void setdata(Object data) {
        this.data = data;
    }
}
