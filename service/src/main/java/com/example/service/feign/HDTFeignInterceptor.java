package com.example.service.feign;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HDTFeignInterceptor implements RequestInterceptor {

    @Override
    public void apply(RequestTemplate template) {
        // 这里可以对template做一些处理
        System.out.println("feign interceptor");
        log.info("feign interceptor");
    }
}
