package com.bjpowernode.crm.settings.controller;

import com.bjpowernode.crm.settings.bean.User;
import com.bjpowernode.crm.settings.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ClassName
 * @Description 一句话描述此类或方法的作用
 * @Author PowerNode
 * @Date 2020/11/16 19:03
 * @Version 1.0
 */
@Controller
public class Usercontroller {

    @Autowired
    private UserService userService;

    @RequestMapping("/queryUser")
    @ResponseBody
    public List<User>queryUser(){
        return userService.queryUser();
    }
}
