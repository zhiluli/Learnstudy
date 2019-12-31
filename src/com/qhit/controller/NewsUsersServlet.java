package com.qhit.controller;

import com.qhit.service.NewsUsersService;
import com.qhit.service.serviceImpl.NewsUsersServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class NewsUsersServlet extends HttpServlet {
    NewsUsersService newsUsersService=new NewsUsersServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String uname=request.getParameter("uname");
        String upwd=request.getParameter("upwd");
        PrintWriter out = response.getWriter();

        System.out.println("用户名是"+uname);
        System.out.println("密码是"+upwd);
        boolean isLog=newsUsersService.checkLogin(uname,upwd);
        if(isLog){
            request.getRequestDispatcher("/admin.jsp").forward(request,response);
        }else {
            out.write("script");
            out.write("alert('用户名或者密码错误请重新输入')");
            out.write("/script");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doPost(request,response);
    }
}
