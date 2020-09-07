package com.kangdw.provider.impl;

import com.kangdw.UserService;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {
    @Override
    public List getUserList() {
        List list = new ArrayList();
        list.add("kangdw-----------26");
        list.add("kangdw2-----------27");

        return list;
    }
}
