package com.study.common.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BaseResponse<T> {

    private Integer code;

    private String message;

    private T data;

}
