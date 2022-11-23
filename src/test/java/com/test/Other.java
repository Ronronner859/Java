package com.test;

import com.java.mapper.OtherMapper;
import com.java.mapper.ProductMapper;
import com.java.pojo.Product;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Other {
    @Test
    public void test2() throws IOException {
        //获取对象
        //        加载mybatis的核心配置文件，获取sqlSessionFactory对象
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//        2.获取sqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        OtherMapper mapper = sqlSession.getMapper(OtherMapper.class);

        List<com.java.pojo.Other> others = mapper.selectAll();


        System.out.println(others);

        sqlSession.close();




    }
}
