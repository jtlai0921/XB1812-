<html>
<%@ page contentType="text/html;charset=Utf-8" %>
<%
    String A=(String)application.getAttribute("DATA");
    String B=(String)session.getAttribute("DATA");
    String C=(String)pageContext.getAttribute("TEST",pageContext.SESSION_SCOPE);
    out.print("A字串的內容="+A);
    out.print("<br/>B字串的內容="+B);
    out.print("<br/>C字串的內容="+C);
%>
</html>
