package com.zhou.ssm.user.controller;

import com.zhou.ssm.component.PagingComponent;
import com.zhou.ssm.user.entity.User;
import com.zhou.ssm.user.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * 用户模块-Restful
 * @project 基于SpringBoot SSM
 * @author zhou
 * @version v1.0.0
 * @date 2019-11-26
 */
@Api(value = "用户接口", tags="UserController")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "【用户管理】-【用户添加】", notes = "用户添加接口", httpMethod = "POST")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "name", value = "【用户名称】", required = true, dataType = "String"),
        @ApiImplicitParam(name = "age", value = "【用户年龄】", required = true, dataType = "Integer"),
        @ApiImplicitParam(name = "gender", value = "【用户性别】", required = true, dataType = "Integer"),
        @ApiImplicitParam(name = "phone", value = "【手机号码】", required = true, dataType = "String"),
        @ApiImplicitParam(name = "birthday", value = "【出生日期】", required = true, dataType = "Date"),
        @ApiImplicitParam(name = "address", value = "【家庭住址】", dataType = "string")
    })
    @PostMapping("user")
    public ResponseEntity<Integer> save(User user)
    {
        return new ResponseEntity<>(userService.insert(user), HttpStatus.OK);
    }

    @ApiOperation(value = "【用户管理】-【用户删除】", notes = "用户删除接口", httpMethod = "DELETE")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "id", value = "【用户主键】", required = true, dataType = "String", paramType = "path")
    })
    @DeleteMapping("user/{id}")
    public ResponseEntity<Integer> delete(@PathVariable String id)
    {
        return new ResponseEntity<>(userService.delete(id), HttpStatus.OK);
    }

    @ApiOperation(value = "【用户管理】-【用户修改】", notes = "用户修改接口", httpMethod = "PUT")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "id", value = "【用户主键】", required = true, dataType = "String"),
        @ApiImplicitParam(name = "name", value = "【用户名称】", required = true, dataType = "String"),
        @ApiImplicitParam(name = "age", value = "【用户年龄】", required = true, dataType = "Integer"),
        @ApiImplicitParam(name = "gender", value = "【用户性别】", required = true, dataType = "Integer"),
        @ApiImplicitParam(name = "phone", value = "【手机号码】", required = true, dataType = "String"),
        @ApiImplicitParam(name = "birthday", value = "【出生日期】", required = true, dataType = "Date"),
        @ApiImplicitParam(name = "address", value = "【家庭住址】", dataType = "string")
    })
    @PutMapping("user")
    public ResponseEntity<Integer> update(User user)
    {
        return new ResponseEntity<>(userService.update(user), HttpStatus.OK);
    }

    @ApiOperation(value = "【用户管理】-【用户查询】", notes = "用户查询接口", httpMethod = "GET")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "offset", value = "【查询页码】", required = true, dataType = "Integer"),
        @ApiImplicitParam(name = "limit", value = "【每页条数】", required = true, dataType = "Integer")
    })
    @GetMapping("user")
    public ResponseEntity<PagingComponent<User>> query(User user, int offset, int limit)
    {
        System.out.println("用户-集合-查询");
        return new ResponseEntity<>(userService.query(user, offset, limit), HttpStatus.OK);
    }

    @ApiOperation(value = "【用户管理】-【用户装载】", notes = "用户装载接口", httpMethod = "GET")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "id", value = "【用户主键】", required = true, dataType = "String", paramType = "path")
    })
    @GetMapping("user/{id}")
    public ResponseEntity<User> load(@PathVariable String id)
    {
        return new ResponseEntity<>(userService.load(id), HttpStatus.OK);
    }

}
