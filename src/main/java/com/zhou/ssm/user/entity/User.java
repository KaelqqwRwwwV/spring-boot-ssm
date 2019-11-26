package com.zhou.ssm.user.entity;

import lombok.Data;

import java.util.Date;

/**
 * 用户模块-用户模型
 * @project 基于SpringBoot SSM
 * @author zhou
 * @version v1.0.0
 * @date 2019-11-26
 */
@Data
public class User {
    private String id;
    private String name;
    private Integer age;
    private Integer gender;
    private String phone;
    private Date birthday;
    private String address;
}
