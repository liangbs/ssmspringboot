package com.example.demo.service.impl;

import com.example.demo.dao.UserMapper;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by liangbs on 2018/2/7.
 */
@Service
//@MapperScan("com.example.demo.dao")//与dao层的@Mapper二选一即可
public class UserServiceImpl implements UserService {

    //依赖注入
    @Autowired
    UserMapper userMapper;

    @Override
    public User selectUserByName(String name) {
        return userMapper.selectUserByName(name);
    }

}
