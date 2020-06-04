package com.clientone.controller;

import com.clientone.entity.User;
import com.clientone.respository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;


@RestController
@RequestMapping("/user")
public class UserHandler {

    @Autowired
    private UserRepository userRepository;

    @Value("${server.port}")
    private String port;


    @GetMapping("/index")
    public String index(){
        return "当前端口"+port;
    }
    @GetMapping("/findAll")
    public Collection<User> findAll(){
        return userRepository.findAll();
    }

    @GetMapping("/findById/{id}")
    public User findById(@PathVariable("id") long id){
        return userRepository.findById(id);
    }

    @PostMapping("/save")
    public void findById(@RequestBody User user){
        userRepository.savrOrUpdate(user);
    }

    @PutMapping("/update")
    public void update(@RequestBody User user){
        userRepository.savrOrUpdate(user);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") long id){
        userRepository.deleteById(id);
    }

}
