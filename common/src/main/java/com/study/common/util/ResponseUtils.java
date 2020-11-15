package com.study.common.util;

import com.study.common.entity.BaseResponse;

public class ResponseUtils {

    public static <T> BaseResponse success(T t) {
        return BaseResponse.builder()
                .code(200)
                .data(t)
                .message("请求成功")
                .build();
    }

}
