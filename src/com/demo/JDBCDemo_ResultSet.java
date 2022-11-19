package com.demo;

import com.pojo.Account;
import org.junit.Test;

import java.sql.*;
import java.util.List;
import java.util.ArrayList;

/*
    JDBC
 */
public class JDBCDemo_ResultSet {
   @Test
    public void Result() throws SQLException {
       //1.注册驱动
       // Class.forName("com.mysql.jdbc.Driver");

       //2.获取链接 如果是链接的本地localhost可以直接省略不写
       String url = "jdbc:mysql:///test1?useSSL=false"; //协议：ip地址：端口号/数据库名称？参数的键值对&
       String username ="root";
       String password="123456";
       Connection connection = DriverManager.getConnection(url, username, password);

       //3.定义sql
       String sql = "select * from demo";
       //4.获取Sql的Statement
       Statement statement = connection.createStatement();
       //5.执行sql
       ResultSet resultSet = statement.executeQuery(sql);

       //创建一个结合
       ArrayList<Account> list = new ArrayList<Account>();


       //6.处理结果
       while(resultSet.next()){
           //new一个实体
           Account account = new Account();

           int id = resultSet.getInt(1);
           String name = resultSet.getString(2);
           int age = resultSet.getInt(3);
           account.setId(id);
           account.setName(name);
           account.setAge(age);
           list.add(account);
       }
       System.out.println(list);
       //释放资源
       resultSet.close();
       statement.close();
       connection.close();
   }
}
