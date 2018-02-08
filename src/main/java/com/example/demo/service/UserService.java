package com.example.demo.service;

import com.example.demo.entity.User;

/**
 * Created by liangbs on 2018/2/7.
 */
public interface UserService {

    User selectUserByName(String name);
}
