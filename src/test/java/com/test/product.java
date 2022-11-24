package com.test;

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

public class product {
    @Test
    public void test2() throws IOException {
        //获取对象
        //        加载mybatis的核心配置文件，获取sqlSessionFactory对象
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//        2.获取sqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        ProductMapper mapper = sqlSession.getMapper(ProductMapper.class);

        List<Product> products = mapper.selectAll();
        System.out.println(products);
        sqlSession.close();


    }
    @Test

    public void selectById() throws IOException {
        int id = 3;
        //获取对象
        //        加载mybatis的核心配置文件，获取sqlSessionFactory对象
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//        2.获取sqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        ProductMapper mapper = sqlSession.getMapper(ProductMapper.class);

        //获取id
        Product product = mapper.selectAllById(id);
        System.out.println(product);
        sqlSession.close();


    }
    @Test
    public void add() throws IOException {
        int id = 99;
        String name = "商品99";
        String price = "1000.00";
        //获取对象
        //        加载mybatis的核心配置文件，获取sqlSessionFactory对象
        Product product = new Product();
        product.setId(id);
        product.setName(name);
        product.setPrice(price);

        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//        2.获取sqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        ProductMapper mapper = sqlSession.getMapper(ProductMapper.class);

        mapper.add(product);
        sqlSession.commit();
        sqlSession.close();


    }
}
