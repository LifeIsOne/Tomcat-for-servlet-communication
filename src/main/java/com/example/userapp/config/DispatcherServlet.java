package com.example.userapp.config;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

//  FrontController
@WebServlet("*.do")   //  리다이렉션 때문에 /* 안댐
public class DispatcherServlet extends HttpServlet {

    //  /join.do
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //  1. 공동로직
        System.out.println("~~~~~~common~logic~~~~~~");
        resp.setHeader("Content-Type", "text/html; charset=utf-8");

        //  2. 분기
        String uri = req.getRequestURI();   //  parsing
        System.out.println(uri);

        if (uri.equals("/join-form.do")){
//            resp.sendRedirect("/WEB-INF/user/join-form.jsp");
            req.getRequestDispatcher("/WEB-INF/user/join-form.jsp").forward(req, resp);  //  사과 가방 들고 이동 forward
        }else if(uri.equals("/join.do")) {
//            resp.sendRedirect("/WEB-INF/user/join.jsp");
            req.getRequestDispatcher("/WEB-INF/user/join.jsp").forward(req, resp);  //  사과 가방 들고 이동 forward
        }else if(uri.equals("/main.do")) {
//            resp.sendRedirect("/WEB-INF/user/main.jsp");
            req.getRequestDispatcher("/WEB-INF/board/main.jsp").forward(req, resp);  //  사과 가방 들고 이동 forward
        }else{
            resp.setStatus(404);
            resp.getWriter().println("잘못된 페이지를 요청하셨어요.");
        }
    }
}
