package com.consumer.controller;

import com.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by wangyong on 2017/8/20.
 */
@RestController
public class UserController {

    @Autowired
    private RestTemplate restTemplate;


    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id) {
        return this.restTemplate.getForObject("http://localhost:8000/user/getUser/" + id, User.class);
    }
}
