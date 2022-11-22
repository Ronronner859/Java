package com.java;

import com.java.mapper.UserMapper;
import com.java.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class mybatisDemo2 {
    public static void main(String[] args) throws IOException {
//        加载mybatis的核心配置文件，获取sqlSessionFactory对象
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//        2.获取sqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

//        3.执行sql
//        List<User> users = sqlSession.selectList("test.selectAll");
        //3.获取uermapper接口的处理对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.selectAll();

        

//
        System.out.println(users);

        sqlSession.close();



    }
}
