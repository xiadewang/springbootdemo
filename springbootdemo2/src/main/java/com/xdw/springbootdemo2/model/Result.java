package com.xdw.springbootdemo2.model;

public class Result<T> {
    private Integer code;   //状态识别码，1代表数据请求成功，其他为错误码
    private String msg;     //消息内容，请求发生错误的时候的内容，正确的时候为"success"
    private T data;     //具体数据

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
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
