package com.kangdw.provider.impl;

import com.kangdw.UserService;
import org.apache.dubbo.config.annotation.Service;

import java.util.ArrayList;
import java.util.List;

@Service(version = "2.0.0")
public class UserServerImpl2 implements UserService {
    @Override
    public List getUserList() {
        List list = new ArrayList();
        list.add("kangdw-----------2222222");
        list.add("kangdw2-----------222222222");
        return list;
    }
}
