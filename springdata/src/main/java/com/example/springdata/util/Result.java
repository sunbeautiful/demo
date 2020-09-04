//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.example.springdata.util;

import java.io.Serializable;

public class Result<T> implements Serializable {
    private static final long serialVersionUID = 165165465465461346L;
    private String status;
    private String message;
    private String stackInfo;
    private T data;
    private static final Result SUCCESS = succeedWith((Object)null, (String)null);
    private static final Result FAILED = failedWith((Object)null, (String)null);
    private static final Result WARNING = warningWith((Object)null, (String)null);

    public static <T> Result<T> succeedWith(T data, String msg) {
        return new Result(ResultStatus.SUCCESS.getStatus(), msg, (String)null, data);
    }

    public static <T> Result failedWith(T data, String msg) {
        return new Result(ResultStatus.ERROR.getStatus(), msg, (String)null, data);
    }

    public static <T> Result failedWith(T data, String msg, String errorMessage) {
        return new Result(ResultStatus.ERROR.getStatus(), msg, errorMessage, data);
    }

    public static <T> Result<T> warningWith(T data, String msg) {
        return new Result(ResultStatus.WARNING.getStatus(), (String)null, msg, data);
    }

    public static Result succeed() {
        return SUCCESS;
    }

    public static <T> Result<T> succeed(T data) {
        return succeedWith(data, (String)null);
    }

    public static <T> Result<T> succeed(T data, String message) {
        return succeedWith(data, message);
    }

    public static <T> Result<T> failed() {
        return FAILED;
    }

    public static <T> Result<T> failed(T data) {
        return failedWith(data, (String)null);
    }

    public static <T> Result<T> failed(T data, String message) {
        return failedWith(data, message);
    }

    public static <T> Result<T> failed(CommonError error) {
        return failedWith("", error.getMessage());
    }

    public static <T> Result<T> failedWithErrorMessage(String message, String errorMessage) {
        return failedWith((Object)null, message, errorMessage);
    }

    public static <T> Result<T> warning() {
        return WARNING;
    }

    public static <T> Result<T> warning(T data) {
        return warningWith(data, (String)null);
    }

    public static <T> Result<T> warning(T data, String msg) {
        return warningWith(data, msg);
    }

    public Result() {
    }

    public Result(String status, String message, String stackInfo, T data) {
        this.status = status;
        this.message = message;
        this.stackInfo = stackInfo;
        this.data = data;
    }

    public String getStatus() {
        return this.status;
    }

    protected void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return this.message;
    }

    protected void setMessage(String message) {
        this.message = message;
    }

    public String getStackInfo() {
        return this.stackInfo;
    }

    protected void setStackInfo(String stackInfo) {
        this.stackInfo = stackInfo;
    }

    public T getData() {
        return this.data;
    }

    protected void setData(T data) {
        this.data = data;
    }
}
