package com.kangdw.consumer.controller;

import com.kangdw.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
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

    @DubboReference(version = "1.0.0", group = "kang2")
    UserService userService1;

    @GetMapping("user2")
    public List getUser2() {
        return userService1.getUserList();
    }

    @DubboReference(version = "1.0.0", group = "kang1")
    UserService userService3;

    @GetMapping("user3")
    public List getUser3() {
        return userService3.getUserList();
    }

    @DubboReference(version = "2.0.0", group = "kang2")
    UserService userService4;

    @GetMapping("user4")
    public List getUser4() {
        return userService4.getUserList();
    }

    @GetMapping("getUserById")
    public String getUserById(String userId, String userName) {
        return userService4.queryUserById(userId, userName);
    }
}
