<%@ page contentType="text/html;charset=utf-8"  %>
  <% 
    String id=request.getParameter("user");
    out.print("<font color=\'red\'>輸入的帳號是:"+id+"</font>");
  %>
