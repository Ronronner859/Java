package com.java.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet("/req4")
public class request extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("get....");
        Map<String, String[]> Map = req.getParameterMap();
        for (String key : Map.keySet()) {
            System.out.print(key+":");

            String[] values = Map.get(key);
            for (String value : values) {
                System.out.println(value+" ");
            }

        }
        System.out.println();

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
