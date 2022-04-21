package com.zhouyu.service;

import com.zhouyu.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @Transactional
    public String test(){
        return "12345";
    }
}
