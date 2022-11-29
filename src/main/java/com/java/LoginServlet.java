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
import java.io.PrintWriter;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        获取用户名和密码
        String username = request.getParameter("username");
        String password = request.getParameter("password");

//        调用查询
//        获取对象
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//        2.获取sqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
//        获取mapper
        User1Mapper mapper = sqlSession.getMapper(User1Mapper.class);
//        调用方法
        User1 use1 = mapper.select(username, password);
//       释放资源
        sqlSession.close();

//        获取字符输出流
        response.setContentType("text/html;charset=utf-8");
//        response
        PrintWriter writer = response.getWriter();
//        判断user1是否为null
        if (use1 !=null){
            writer.write("登录成功");
        }else {
            writer.write("登录失败");
        }



    }
}
