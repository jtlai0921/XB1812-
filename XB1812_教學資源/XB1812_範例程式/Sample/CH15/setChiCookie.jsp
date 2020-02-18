<html>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<%@ page contentType="text/html;charset=utf-8" import="java.net.*" %>
<%
    String str = "這是中文的cookie內容值";
    Cookie ck = new Cookie("DATA", URLEncoder.encode(str));
    ck.setMaxAge(150); //設定可存活150秒

    response.addCookie(ck);
%>
    中文Cookie資料儲存完畢
</html>
