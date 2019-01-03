package com.itheima.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/***
 *
 * @Author:shenkunlin
 * @Description:itheima
 * @date: 2018/11/24 11:18
 *
 ****/
@Controller
@RequestMapping(value = "/user")
public class UserController {

    //@Autowired
    @Reference
    private UserService userService;

    /***
     * 获取用户名字
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/name")
    public String getName(String name){

        //调用将使用远程调用
        return userService.getName(name);
    }


}
