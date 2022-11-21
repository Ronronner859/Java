package com.Example;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Properties;

//JDBC对关系型数据的增删改查
public class BrandTest4 {
    public static void main(String[] args) throws Exception {
        //接受页面提交的参数

        int id = 4;
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
        String sql = "delete from tb_brand where id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);


        preparedStatement.setInt(1,id);
        //执行sql
        int count = preparedStatement.executeUpdate();
        //处理结果
        System.out.println(count>0);



        connection.close();
        preparedStatement.close();

    }
}
