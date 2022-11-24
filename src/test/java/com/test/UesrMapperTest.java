package com.test;

import com.java.mapper.BrandMapper;
import com.java.mapper.UserMapper;
import com.java.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class UesrMapperTest {
    @Test
    public void UserTest() throws IOException {
        //        加载mybatis的核心配置文件，获取sqlSessionFactory对象
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//        2.获取sqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        //获取mapper接口的代理对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

//        执行方法：
        String username = "zhangsan";
        String password = "123";

        User user = userMapper.selects(username, password);
        System.out.println(user);
        

        sqlSession.close();

    }
}
