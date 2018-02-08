package com.example.demo.dao;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * Created by liangbs on 2018/2/7.
 */
@Mapper
@Repository
public interface UserMapper {

    User selectUserByName(String name);

}
