package com.study.common.exception;

import lombok.Getter;

@Getter
public enum ExceptionCodeEnum {

    SYSTEM_ERROR(500,"系统错误")

    ;
    private Integer code;

    private String message;

    ExceptionCodeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
