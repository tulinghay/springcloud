package com.example.product.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

@RestController
public class ProductController {

    @Value("${server.port}")
    private String port;

    @PostMapping("/product")
    public String product(){
        return "post product:" + port;
    }

    @GetMapping("/product")
    public String getpro(){
        return "get product:" + port;
    }

}
