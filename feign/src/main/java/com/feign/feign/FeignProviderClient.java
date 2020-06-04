package com.feign.feign;

import com.feign.entity.User;
import com.feign.feign.impl.FeignError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@FeignClient(value = "provider",fallback = FeignError.class)
public interface FeignProviderClient {

    @GetMapping("/user/findAll")
    public Collection<User> findAll();

    @GetMapping("/user/index")
    public String index();
}
