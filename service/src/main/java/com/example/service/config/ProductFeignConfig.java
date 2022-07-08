package com.example.service.config;

import com.example.service.feign.HDTFeignInterceptor;
import feign.Logger;
import feign.Request;
import org.springframework.cloud.openfeign.encoding.FeignAcceptGzipEncodingInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

/**
 * 全局配置：当使用@Configuration会将配置作用所有的服务提供方
 * 局部配置：如果只想针对某一个服务进行配置，就不要加@Configuration
 */
// @Configuration
public class ProductFeignConfig {
    @Bean
    public Logger.Level feignLoggerLevel(){
        /**
         * NONE：不记录任何值
         * BASIC：仅记录请求方法、URL、响应状态以及执行时间
         * HEADERS：记录BASIC的基础上，记录请求和响应的header
         * FULL：记录请求响应的header、body和元数据
         */
        return Logger.Level.FULL;
    }

    /**
     * 设置服务的访问超时等配置
     * @return
     */
    @Bean
    public Request.Options options() {
        return new Request.Options(3000, TimeUnit.MILLISECONDS,3000,
                TimeUnit.MILLISECONDS, true);
    }
}