package com.study.common.exception;

public class BusinessException extends RuntimeException {

    private Integer code;

    public BusinessException(ExceptionCodeEnum exceptionCodeEnum) {
        this(exceptionCodeEnum.getMessage(), exceptionCodeEnum.getCode());
    }

    public BusinessException(String message, Integer code) {
        super(message);
        this.code = code;
    }
}
