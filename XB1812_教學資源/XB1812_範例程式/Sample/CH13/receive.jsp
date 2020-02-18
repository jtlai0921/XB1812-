<html>
  <meta http-equiv="Content-Type" content="text/html"; charset="uft-8"/>
  網站接收到你輸入的訊息:
  <%@ page contentType="text/html;charset=utf-8" %>
  <%
     String user = request.getParameter("user");
     String pwd  = request.getParameter("pwd");
     String serial=request.getParameter("serial");
     out.println("帳號:"+user+", 密碼:"+pwd+", 序號:"+serial);
  %>
</html>
