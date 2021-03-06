package com.hotel.sofiter.entity.resp.predetermine;

public class BaseRespEntity<T> implements java.io.Serializable{
    private String code = ResponseCode.OK.getCode();
    private String msg = ResponseCode.OK.getDesc();
    private T data;

    public BaseRespEntity(T data){
        this.data = data;
    }
    public BaseRespEntity(String code,String msg){
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
