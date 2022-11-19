package com.demo;

import java.sql.*;

/*
    JDBC
 */
public class JDBCDemo_UserLogin {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1.注册驱动
       // Class.forName("com.mysql.jdbc.Driver");

        //2.获取链接 如果是链接的本地localhost可以直接省略不写
        String url = "jdbc:mysql:///test1?useSSL=false"; //协议：ip地址：端口号/数据库名称？参数的键值对&
        String username ="root";
        String password="123456";
        Connection connection = DriverManager.getConnection(url, username, password);
        //接受用户输入和密码  登录的逻辑
        String name = "cy";
        String pwd = "' or '1' = '1";

        String sql = "select * from tb_user where username = '"+name+"' and password = '"+pwd+"'";
        System.out.println(sql);

        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery(sql);

        if (resultSet.next()){
            System.out.println("登录成功");
        }else {
            System.out.println("登录失败");
        }

        //7.释放资源
        statement.close();
        connection.close();

    }
}
