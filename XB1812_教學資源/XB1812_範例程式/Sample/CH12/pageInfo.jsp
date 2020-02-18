<html>
	<%@ page contentType="text/html;charset=utf-8" info="這是網頁的資訊" %>
	<%
     	out.print("<br/>資訊內容："+((HttpJspPage)page).getServletInfo() );
	%>
</html>
