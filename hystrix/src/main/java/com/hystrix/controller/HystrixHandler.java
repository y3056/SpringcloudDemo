package com.hystrix.controller;

import com.hystrix.entity.User;
import com.hystrix.feign.FeignProciderClinet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;


@RestController
@RequestMapping("/hystrix")
public class HystrixHandler {

    @Autowired
    private FeignProciderClinet feignProciderClinet;

    @GetMapping("/findAll")
    public Collection<User> findAll(){
        return feignProciderClinet.findAll();
    }


    @GetMapping("/index")
    public String index(){
        return feignProciderClinet.index();
    }

}
