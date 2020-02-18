<html>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<%@ page contentType="text/html;charset=utf-8" import="java.net.*" %>
<%
    request.setCharacterEncoding("utf-8");
    Cookie[] cks= request.getCookies();
    for(int i=0; i< cks.length; i++){
        //要找的cookie名稱為「DATA」
        if(cks[i].getName().equals("DATA"))
            out.print("資料的內容是："+ URLDecoder.decode(cks[i].getValue()));
    }
%>
</html>
