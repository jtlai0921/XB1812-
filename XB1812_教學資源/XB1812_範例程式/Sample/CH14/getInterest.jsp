<html>
<%@ page contentType="text/html;charset=Utf-8" %>
<%
        String[] data=request.getParameterValues("interest");

        Boolean f=new Boolean(true);
        session.setAttribute("INTEREST", data);
        session.setAttribute("FLAG", f);
    %>
  處理完畢<br/>
<a href="showInterest.jsp">顯示興趣</a>
</html>
