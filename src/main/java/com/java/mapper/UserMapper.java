package com.java.mapper;

import com.java.pojo.User;

import java.util.List;

public interface UserMapper {

    List<User> selectAll();
    User selectById(int id);

//    查询详情

}
