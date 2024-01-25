package com.example.userapp.user;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.BufferedReader;
import java.io.IOException;

//@WebServlet("/join")
public class JoinServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setHeader("Content-Type", "text/html; charset=utf-8"); // 한글 깨짐 방지
        //  username=matthew&password=1234&email=matthew@1234.com
//        BufferedReader br = req.getReader();
//
//        String requestBody = "";
//
//        requestBody = requestBody + br.readLine();
//
//        while(true){
//            String line = br.readLine();
//            if (line == null) break;;
//            requestBody = requestBody + line;
//        }
//        System.out.println(requestBody);
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");

        System.out.println("username : " + username);
        System.out.println("password : " + password);
        System.out.println("email : " + email);

        //  2. 유효성검사
        if (username.length() < 4 || username.length() > 12){
            resp.getWriter().println("<h1>username의 글자수가 4-12 여야 합니다.");
            return;
        }

        //  3. DB 연결

        //  4. DAO의 INSERT 메소드 호출

        //  5. 메인 페이지 그리기 (비요율적임 탈락)

        //  6. 리다이렉트
//        resp.getWriter().println("/main");
        resp.setStatus(302);    //  상태 코드를 302(Found)로 설정
        resp.setHeader("Location", "/main");    // Location 헤더를 설정, 리다이렉트할 대상 URL을 알려줌
        resp.setHeader("clock", "12pm");    // clock 헤더를 설정, 추가적인 정보를 제공
    }
}
