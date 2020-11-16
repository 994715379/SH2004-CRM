package com.bjpowernode.crm.settings.service.impl;

import com.bjpowernode.crm.settings.bean.User;
import com.bjpowernode.crm.settings.mapper.UserMapper;
import com.bjpowernode.crm.settings.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName
 * @Description 一句话描述此类或方法的作用
 * @Author PowerNode
 * @Date 2020/11/16 19:06
 * @Version 1.0
 */
@Service("userService")
public class UserServiceimpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> queryUser() {
        return userMapper.selectAll();
    }
}
