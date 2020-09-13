package com.kangdw.consumer.controller;

import com.kangdw.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DubboController {
    @DubboReference(version = "1.0.0")
    UserService userService;
    @GetMapping("user")
    public List getUser() {
        return userService.getUserList();
    }

    @DubboReference(version = "2.0.0")
    UserService userService1;
    @GetMapping("user2")
    public List getUser2() {
        return userService1.getUserList();
    }
}
