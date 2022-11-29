package com.java;

import com.java.mapper.User1Mapper;
import com.java.pojo.User1;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;

@WebServlet("/registerServlet")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        接受
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        User1 user1 = new User1();
        user1.setUsername(username);
        user1.setPassword(password);
//根据用户名查询用户对象
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//        2.获取sqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
//        获取mapper
        User1Mapper mapper = sqlSession.getMapper(User1Mapper.class);
//        调用方法
        User1 u = mapper.selectByUsername(username);

        if (u == null){
            mapper.add(user1);
            sqlSession.commit();
            sqlSession.close();
            response.setContentType("text/html;charset=utf-8");
            response.getWriter().write("注册成功");
        }else {
            response.setContentType("text/html;charset=utf-8");
            response.getWriter().write("用户名已经存在");
        }

    }
}
