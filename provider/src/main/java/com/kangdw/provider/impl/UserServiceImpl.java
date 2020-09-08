package com.kangdw.provider.impl;

import com.kangdw.UserService;
import org.apache.dubbo.config.annotation.Service;

import java.util.ArrayList;
import java.util.List;
@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {
    @Override
    public List getUserList() {
        List list = new ArrayList();
        list.add("kangdw-----------26");
        list.add("kangdw2-----------27");

        return list;
    }
}
