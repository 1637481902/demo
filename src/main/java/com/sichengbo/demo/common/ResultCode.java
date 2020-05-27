package com.sichengbo.demo.common;

/**
 * @author sichengbo
 * @version 1.0
 * @date 2020/5/27 15:31
 */
public enum ResultCode implements IErrorCode {

    SUCCESS(0, "操作成功"),
    FAILED(1, "操作失败");

    private long code;

    private String message;

    ResultCode(long code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public long getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
