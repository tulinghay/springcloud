package com.example.service.feign;


import com.example.service.config.ProductFeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "product", configuration = {HDTFeignInterceptor.class, ProductFeignConfig.class})
public interface ProductFeignService {
    @RequestMapping("/product")
    public String product();
}
