<html>
<%@ page contentType="text/html;charset=Utf-8" %>
<%
    String sNo=request.getParameter("id");
    String sMid=request.getParameter("mid");
    String sFinal=request.getParameter("final");
    float avg=(Float.parseFloat(sMid)+Float.parseFloat(sFinal))/2;

    session.setAttribute("ID",sNo);
    session.setAttribute("AVG",Float.toString(avg) );
%>
  運算完畢<br/>
<a href="showAvg.jsp">顯示成績</a>
</html>
