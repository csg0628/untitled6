package com.hqzy.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/Servlet111/*","*.do"},
        initParams = {@WebInitParam(name = "encoding",value = "utf-8")})
public class Servlet1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("dd");
        System.out.println("cui 111111111111111");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("servlet 222222222221@@@1111");
        System.out.println(this.getInitParameter("encoding"));
        System.out.println(request.getParameter("encoding"));
    }
}
