package com.study.multipledatasource01.controller;

import com.study.common.entity.BaseResponse;
import com.study.common.util.ResponseUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/health")
    public BaseResponse<String> health() {
        return ResponseUtils.success("success");
    }
}
