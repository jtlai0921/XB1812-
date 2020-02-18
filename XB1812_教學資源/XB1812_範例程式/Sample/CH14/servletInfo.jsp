<html>
<%@ page contentType="text/html;charset=Utf-8" import="Java.util.*"  %>
<%
    String serverName=pageContext.getRequest().getServerName();
    int serverPort=pageContext.getRequest().getServerPort();
    String account =pageContext.getRequest().getParameter("user");
    String password =pageContext.getRequest().getParameter("pwd");

    out.print("伺服器名稱："+serverName);
    out.print("<br/>伺服器埠號："+serverPort);
    out.print("<br/>使用者名稱："+account);
    out.print("<br/>使用者密碼："+password);
%>

</html>
