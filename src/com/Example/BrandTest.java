package com.Example;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.pojo.Account;
import com.pojo.Brand;
import org.junit.Test;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class BrandTest {
    public static void main(String[] args) throws Exception {
        //1.获取connection

        //加载配置文件
        //获取连接池对象
        //获取数据库链接connection
        //定义配置文件
        Properties prop = new Properties();
        prop.load(new FileInputStream("jdbc-demo/src/druid.properties"));
        //加载配置文件
        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);

        //获取数据库链接
        Connection connection = dataSource.getConnection();

        //定义sql
        String sql = "select * from tb_brand";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        //执行sql
        ResultSet resultSet = preparedStatement.executeQuery();
        Brand brand = null;
        ArrayList<Brand> brands = new ArrayList<>();
        //封装为对象
        while (resultSet.next()){
            //获取数据
            int id = resultSet.getInt("id");
            String brandName = resultSet.getString("brand_name");
            String companyName = resultSet.getString("company_name");
            int ordered = resultSet.getInt("ordered");
            String description = resultSet.getString("description");
            int status = resultSet.getInt("status");
            //封装brand对象

            brand = new Brand();
            brand.setId(id);
            brand.setBrandName(brandName);
            brand.setCompanyName(companyName);
            brand.setOrdered(ordered);
            brand.setDescription(description);
            brand.setStatus(status);

            //装载集合
            brands.add(brand);
        }
        System.out.println(brands);
        resultSet.close();
        connection.close();
        preparedStatement.close();

    }
}
