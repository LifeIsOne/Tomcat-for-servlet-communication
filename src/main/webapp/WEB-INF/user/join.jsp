<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    // response로 고정되어있음.
    response.setHeader("Content-Type", "text/html; charset=utf-8"); // 한글 깨짐 방지

    //  1. Parsing
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    String email = request.getParameter("email");

    System.out.println("username : " + username);
    System.out.println("password : " + password);
    System.out.println("email : " + email);

    //  2. 유효성검사
    if (username.length() < 4 || username.length() > 12){
        response.getWriter().println("<h1>username의 글자수가 4-12 여야 합니다.");
        return;
    }

    //  3. DB 연결

    //  4. DAO의 INSERT 메소드 호출

    //  5. 메인 페이지 그리기
    //  6. 리다이렉트

//        resp.getWriter().println("/main");
    response.setStatus(302);    //  상태 코드를 302(Found)로 설정
    response.setHeader("Location", "/main.do");    // Location 헤더를 설정, 리다이렉트할 대상 URL을 알려줌
    response.setHeader("clock", "12pm");    // clock 헤더를 설정, 추가적인 정보를 제공
%>
