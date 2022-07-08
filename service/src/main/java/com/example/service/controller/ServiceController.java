package com.example.service.controller;

import com.example.service.feign.ProductFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ServiceController {

    @Autowired
    private RestTemplate restTemplate;

    /**
     * 使用restTemplate来调用接口
     * @return
     */
    @PostMapping("/service")
    public String service(){
        System.out.println("service is arrived");
        return "service" + restTemplate.getForObject("http://product/product", String.class);
    }

    @Autowired
    private ProductFeignService productFeignService;

    @PostMapping("/feign")
    public String feign() {
        return productFeignService.product();
    }

}
