package com.demo;

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
public class JDBCDemo_Connection {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1.注册驱动
       // Class.forName("com.mysql.jdbc.Driver");

        //2.获取链接 如果是链接的本地localhost可以直接省略不写
        String url = "jdbc:mysql:///test1?useSSL=false"; //协议：ip地址：端口号/数据库名称？参数的键值对&
        String username ="root";
        String password="123456";
        Connection connection = DriverManager.getConnection(url, username, password);

        //3.定义sql
        String sql1="update demo set age = 49 where id = 1";
        String sql2 ="update demo set age = 59 where id = 2";

        //开始事物

        //ctrl alt + t ——>抛出异常
        Statement statement = null;

        try {
            //开启事物
            connection.setAutoCommit(false);
            //4.获取sql的对象Statement
            statement = connection.createStatement();

            //5.执行sql
            int count1 = statement.executeUpdate(sql1);//受影响的行数
            //6.处理结果
            System.out.println(count1);

            //5.执行sql
            int count2 = statement.executeUpdate(sql2);//受影响的行数
            //6.处理结果
            System.out.println(count2);

            //提交事物
            connection.commit();
        } catch (Exception e) {
            connection.rollback();
            e.printStackTrace();
            //事物回滚

        }

        //事物提交

        //7.释放资源
        statement.close();
        connection.close();

    }
}
