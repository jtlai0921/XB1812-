<html>
<%@ page contentType="text/html;charset=utf-8" %>
<%
     String account="A1123";
     String password="abc123";
     Cookie ck1 = new Cookie("ID", account);
     Cookie ck2 = new Cookie("PWD", password);
     ck1.setMaxAge(60*60);  //設定生命週期
     ck2.setMaxAge(60*60);
     response.addCookie(ck1);
     response.addCookie(ck2);
     out.print("<h3>資料存放完畢</h3>");
%>
</html>
