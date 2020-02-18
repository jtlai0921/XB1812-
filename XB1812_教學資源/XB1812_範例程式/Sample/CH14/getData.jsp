<html>
<%@ page contentType="text/html;charset=Utf-8" %>
<%
    String strName=(String)request.getAttribute("Name");
    String strYear=(String)request.getAttribute("Year");
    int year=Integer.parseInt( strYear ) - 1911;
    out.print("姓名："+ strName+" 民國"+year+"年出生");
%>
</html>
