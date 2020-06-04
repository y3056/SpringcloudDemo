package com.feign.feign.impl;

import com.feign.entity.User;
import com.feign.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class FeignError implements FeignProviderClient {

    @Override
    public Collection<User> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器 维护中……";
    }
}
