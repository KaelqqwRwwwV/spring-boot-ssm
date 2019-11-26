package com.zhou.ssm.user.dao;

import com.zhou.ssm.user.entity.User;

import java.util.List;
import java.util.Map;

/**
 * 用户模块-数据层接口
 * @project 基于SpringBoot SSM
 * @author zhou
 * @version v1.0.0
 * @date 2019-11-26
 */
public interface UserDao {
    public int insert(User entity);
    public int update(User entity);
    public int delete(String id);
    public User load(String id);
    public long count(Map<String, Object> params);
    public List<User> query(Map<String, Object> params);
}
