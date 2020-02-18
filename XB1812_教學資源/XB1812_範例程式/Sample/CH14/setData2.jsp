<html>
<%@ page contentType="text/html;charset=Utf-8" %>
<%
    pageContext.setAttribute("DATA", "這是application資料", pageContext.APPLICATION_SCOPE);
    pageContext.setAttribute("DATA", "這是session資料", pageContext.SESSION_SCOPE);
    session.setAttribute("TEST", "大家好");
 %>
<a href="getData2.jsp">看資料</a>
</html>
