package com.zhou.ssm.user.controller;

import com.zhou.ssm.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户模块-Restful
 * @project 基于SpringBoot SSM
 * @author zhou
 * @version v1.0.0
 * @date 2019-11-26
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;



}
