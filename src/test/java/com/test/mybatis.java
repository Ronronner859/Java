package com.test;

import com.java.mapper.BrandMapper;
import com.java.pojo.Brand;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class mybatis {
    @Test
    public void testSelectAll() throws IOException {
        //获取对象
        int id = 1;
        //        加载mybatis的核心配置文件，获取sqlSessionFactory对象
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//        2.获取sqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //获取mapper接口的代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

//        执行方法
        List<Brand> brands = brandMapper.selectAll();
        System.out.println(brands);
//    释放资源
        sqlSession.close();


    }

    @Test
    public void testSelectAllByID() throws IOException {
        //获取对象
        int id = 1;
        //        加载mybatis的核心配置文件，获取sqlSessionFactory对象
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//        2.获取sqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //获取mapper接口的代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

//        执行方法
        Brand brand = brandMapper.selectAllById(id);
        System.out.println(brand);
//    释放资源
        sqlSession.close();


    }

    @Test
    public void testSelectAllByCondition() throws IOException {
        //获取对象
        int status = 1;
        String companyName = "华为";
        String brandName = "华为";
//        模糊查询
        companyName = "%" + companyName + "%";
        brandName = "%" + brandName + "%";
        //封装对象
//        Brand brand = new Brand();
//        brand.setStatus(status);
//        brand.setCompanyName(companyName);
//        brand.setBrandName(brandName);
        Map map = new HashMap();
        map.put("status", status);
        map.put("companyName", companyName);
        map.put("brandName", brandName);
        //        加载mybatis的核心配置文件，获取sqlSessionFactory对象
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//        2.获取sqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //获取mapper接口的代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

//        执行方法
        /// List<Brand> brands = brandMapper.selectByCondition(status, companyName, brandName);
//        2。封装对象
//        List<Brand> brands = brandMapper.selectByCondition(brand);
        List<Brand> brands = brandMapper.selectByCondition(map);
        System.out.println(brands);
//    释放资源
        sqlSession.close();


    }

    @Test
    public void testSelectAllByConditionSingle() throws IOException {
        //获取对象
        int status = 1;
        String companyName = "华为";
        String brandName = "华为";
//        模糊查询
        companyName = "%" + companyName + "%";
        brandName = "%" + brandName + "%";
        //封装对象
        Brand brand = new Brand();
        brand.setStatus(status);
//        brand.setCompanyName(companyName);
//        brand.setBrandName(brandName);

        //        加载mybatis的核心配置文件，获取sqlSessionFactory对象
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//        2.获取sqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //获取mapper接口的代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

//        执行方法
        /// List<Brand> brands = brandMapper.selectByCondition(status, companyName, brandName);
//        2。封装对象
//        List<Brand> brands = brandMapper.selectByCondition(brand);
        List<Brand> brands = brandMapper.selectAllByConditionSingle(brand);
        System.out.println(brands);
//    释放资源
        sqlSession.close();


    }

    @Test
    public void add() throws IOException {
        //获取对象
        int status = 1;
        String companyName = "一加手机";
        String brandName = "一加";
        String description = "手机中的战斗机";
        int orderd = 100;
//        模糊查询

        //封装对象
        Brand brand = new Brand();
        brand.setStatus(status);
        brand.setCompanyName(companyName);
        brand.setBrandName(brandName);
        brand.setDescription(description);
        brand.setOrdered(orderd);

        //        加载mybatis的核心配置文件，获取sqlSessionFactory对象
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//        2.获取sqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        //获取mapper接口的代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

//        执行方法
        /// List<Brand> brands = brandMapper.selectByCondition(status, companyName, brandName);
//        2。封装对象
//        List<Brand> brands = brandMapper.selectByCondition(brand);
        brandMapper.add(brand);
        //提交事物
        sqlSession.commit();
//    释放资源
        sqlSession.close();


    }
}


