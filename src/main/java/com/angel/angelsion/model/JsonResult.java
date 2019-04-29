package com.angel.angelsion.model;

import java.io.Serializable;

/**
 * @author: puyijun
 * @create: 2019-04-28 16:26
 **/

public class JsonResult<T> implements Serializable {

    private static final long serialVersionUID = 6309618476804982336L;


    private boolean status ;          //成功状态
    private String message ;          //信息
    private T data ;                  //数据

    public JsonResult() {

    }

    public JsonResult(boolean status, String message, T data) {

        this.status = status;
        this.message = message;
        this.data = data;
    }

    //有异常时 返回的结果
    public JsonResult(Throwable e){
        this.status = false;
        this.message = e.getMessage();
        this.data = null;

    }
    //得到数据时 返回的结果
    public JsonResult(String message, T  data){
        this.status = true;
        this.message = message;
        this.data = data;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
