package com.kangdw;

import java.util.List;

/**
 * @author kangdw [kangdw@yinhai.com]
 * @since 5.1
 */
public interface UserService {
    /**
     * 获取用户列表
     *
     * @return
     */
     List getUserList();

    /**
     * 查询用户根据条件
     *
     * @param userId
     * @param userName
     * @return
     */
     String queryUserById(String userId, String userName);
}
