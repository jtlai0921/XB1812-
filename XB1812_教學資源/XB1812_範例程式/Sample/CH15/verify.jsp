<%@ page contentType="text/html;charset=utf-8" %>
<%
    String id = request.getParameter("user");
    String key=request.getParameter("pwd");
    String remain= request.getParameter("keep");
    /*
        因為還沒有學習到如何檢驗帳號、密碼是否正確，
        所以本程式就假設輸入的都是正確。
    */
    session.setAttribute("ID",id);

    if ( remain !=null ){
        Cookie ck = new Cookie("ACCOUNT", id);
        ck.setMaxAge(99999); //設一個大數，儲存久久
        response.addCookie(ck);
    }    

    response.sendRedirect("home.jsp");  
%>
