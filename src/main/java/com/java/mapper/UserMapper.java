package com.java.mapper;

import com.java.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    List<User> selectAll();

//    注解开发
    @Select("select * from tb_user where id = #{id}")
    User selectById(int id);

//    查询详情
//    增加用户
    void add(User user);
    //    多参数查询

    User selects(@Param("username" )String username, @Param("password") String password);
//    myBatis参数封装
    /*
        1.单个参数
            1.pojo类型 ：直接使用，属性名和参数占位符一致
            2.map集合： 直接使用，键名和参数占位符一致
            3.collection
            4.List
            5.array
            6.其他类型
        2，多个参数
            用@param注解
     */


}
