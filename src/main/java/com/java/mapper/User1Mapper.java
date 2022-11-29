package com.java.mapper;

import com.java.pojo.User1;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface User1Mapper {
    @Select("select * from tb_user where username = #{username} and password = #{password}")
    User1 select(@Param("username") String username,@Param("password") String password);

    @Select("select * from tb_user where username = #{username}")
    User1 selectByUsername(String username);

    @Insert("insert into tb_user values(null,#{username},#{password})")
    void add(User1 user1);
}
