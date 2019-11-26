package com.zhou.ssm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * XXX 类描述信息
 *
 * @author zhou
 * @version v1.0.0
 * @project
 * @date 2019-11-26 17:43
 * @copyright Copyright (c) 2019, www.javakc.com All Rights Reserved.
 */
@SpringBootApplication
@MapperScan("com.zhou.ssm.*.dao")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
