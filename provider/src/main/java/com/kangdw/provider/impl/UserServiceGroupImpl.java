package com.kangdw.provider.impl;

import com.kangdw.UserService;
import org.apache.dubbo.config.annotation.DubboService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kangdw [kangdw@yinhai.com]
 * @since 5.1
 */
@DubboService(version = "1.0.0",group = "kang2")
public class UserServiceGroupImpl implements UserService {

    @Override
    public List getUserList() {
        List list = new ArrayList();
        list.add("kangdw-----------1.0 kang2");
        list.add("kangdw2-----------1.0 kang2");
        return list;
    }

    @Override
    public String queryUserById(String userId, String userName) {
        return userId + "-----1.0  kang2--------" + userName;
    }
}
