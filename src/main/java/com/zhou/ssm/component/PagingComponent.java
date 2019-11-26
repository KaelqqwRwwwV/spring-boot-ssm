package com.zhou.ssm.component;

import lombok.Data;

import java.util.List;

/**
 * 用户模块-分页组件
 * @project 基于SpringBoot SSM
 * @author zhou
 * @version v1.0.0
 * @date 2019-11-26
 */
@Data
public class PagingComponent<T> {
    private long count;
    private List<T> content;
}
