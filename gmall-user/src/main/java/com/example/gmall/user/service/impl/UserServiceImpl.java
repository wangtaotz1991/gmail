package com.example.gmall.user.service.impl;

import com.example.gmall.user.mapper.UserMapper;
import com.example.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wangtao
 * @create 2020-06-27 15:19
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
}
