package com.jacky.online.pojo;

import java.io.Serializable;

public class Result implements Serializable {

    private boolean isSuccess;

    private String msg;

    private Object obj;

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public Result(boolean isSuccess, String msg, Object obj) {
        this.isSuccess = isSuccess;
        this.msg = msg;
        this.obj = obj;
    }
}
