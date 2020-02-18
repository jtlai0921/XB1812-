<html>
<%@ page contentType="text/html;charset=Utf-8" %>
<%
     String data1=(String)application.getAttribute("DATA");
     String data2=(String)session.getAttribute("DATA");
     out.print("application的資料:"+data1+"<br/>session的資料:"+data2);
%>
</html>
