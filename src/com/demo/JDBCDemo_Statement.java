package com.demo;

import org.junit.Test;

import java.net.IDN;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
    JDBC:connection
    事物开始
    事物提交
    事物回滚
 */
public class JDBCDemo_Statement {
    @Test
    public void testDML() throws SQLException {
        //1.注册驱动
        // Class.forName("com.mysql.jdbc.Driver");

        //2.获取链接 如果是链接的本地localhost可以直接省略不写
        String url = "jdbc:mysql:///test1?useSSL=false"; //协议：ip地址：端口号/数据库名称？参数的键值对&
        String username ="root";
        String password="123456";
        Connection connection = DriverManager.getConnection(url, username, password);

        //3.定义sql
        String sql  ="create database test2";

        //4.获取sql的对象Statement
        Statement statement = connection.createStatement();

        //5.执行sql
        int i = statement.executeUpdate(sql);//受影响的行数
        //6.处理结果
        if (i>0){
            System.out.println("修改成功");
        }else {
            System.out.println("修改失败");
        }
        //7.释放资源
        statement.close();
        connection.close();
    }

}
