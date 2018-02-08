package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by liangbs on 2018/2/7.
 */
@RestController//证明是controller层并且返回json
//@ComponentScan(basePackages={"com.example.demo.service"})//与service层的@Service二选一即可
public class UserController {

    //依赖注入
    @Autowired
    UserService userService;

    // http://localhost:8080/test/lisi
    @RequestMapping(value = "test/{name}",method = RequestMethod.GET)
    public User test(@PathVariable String name, HttpServletResponse response) {

        //调用dao层
        return userService.selectUserByName(name);
    }

}
