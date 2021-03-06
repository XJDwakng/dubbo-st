package com.kangdw.provider.impl;

import com.kangdw.UserService;
import org.apache.dubbo.config.annotation.DubboService;

import java.util.ArrayList;
import java.util.List;

@DubboService(version = "2.0.0",group = "kang2")
public class UserServerImpl2 implements UserService {
    @Override
    public List getUserList() {
        List list = new ArrayList();
        list.add("kangdw-----------2.0 kang2");
        list.add("kangdw2----------2.0 kang2");
        return list;
    }

    @Override
    public String queryUserById(String userId, String userName) {
        return userId + "------2.0 kang2-------" + userName;
    }
}
