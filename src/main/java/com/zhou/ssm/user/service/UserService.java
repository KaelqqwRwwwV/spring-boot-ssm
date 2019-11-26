package com.zhou.ssm.user.service;

import com.zhou.ssm.component.PagingComponent;
import com.zhou.ssm.user.dao.UserDao;
import com.zhou.ssm.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

/**
 * 用户模块-业务逻辑
 * @project 基于SpringBoot SSM
 * @author zhou
 * @version v1.0.0
 * @date 2019-11-26
 */
@Service
@Transactional(readOnly = true)
public class UserService {

    @Autowired
    private UserDao userDao;

    @Transactional(readOnly = false)
    public int insert(User entity)
    {
        return userDao.insert(entity);
    }

    @Transactional(readOnly = false)
    public int update(User entity)
    {
        return userDao.update(entity);
    }

    @Transactional(readOnly = false)
    public int delete(String id)
    {
        return userDao.delete(id);
    }

    public User load(String id)
    {
        return userDao.load(id);
    }

    public PagingComponent<User> query(User entity, int offset, int limit)
    {
        PagingComponent<User> paging = new PagingComponent<>();

        Map<String, Object> params = new HashMap<>();
        params.put("offset", offset);
        params.put("limit", limit);

        paging.setContent(userDao.query(params));
        paging.setCount(userDao.count(params));

        return paging;
    }

}
