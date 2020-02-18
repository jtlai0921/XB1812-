<html>
<%@ page contentType="text/html;charset=utf-8" %>
<%
    String id = (String)session.getAttribute("ID");
    if ( id == null)
        //尚未登入，直接進入網頁頁面
        response.sendRedirect("login.jsp");
    else{
        out.print("<table>");
        out.print("<tr><td>"+ id+" 歡迎光臨</td>");
%>
    <td>
        <form action="logout.jsp">
            <input type="submit" value="登出" />
        </form>
    </td></table>
    <hr/>
    <h3>這是模擬的網站首頁內容</h3>
<%
    }
%>
</html>
