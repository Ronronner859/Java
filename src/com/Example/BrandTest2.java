package com.Example;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.pojo.Brand;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Properties;
//JDBC对关系型数据的增删改查
public class BrandTest2 {
    public static void main(String[] args) throws Exception {
        //接受页面提交的参数
        String brandName = "AMD";
        String companyName = "amd";
        int ordered = 1;
        String description = "芯片";
        int Status = 1;
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
        String sql = "insert into tb_brand(brand_name,company_name,ordered,description,status) value(?,?,?,?,?);";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setString(1,brandName);
        preparedStatement.setString(2,companyName);
        preparedStatement.setInt(3,ordered);
        preparedStatement.setString(4,description);
        preparedStatement.setInt(5,Status);
        //执行sql
        int count = preparedStatement.executeUpdate();
        //处理结果
        System.out.println(count>0);



        connection.close();
        preparedStatement.close();

    }
}
