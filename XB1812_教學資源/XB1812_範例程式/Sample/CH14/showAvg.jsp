<html>
<%@ page contentType="text/html;charset=Utf-8" %>
<hr/>顯示request內容<hr/>
<%
    String sNo=request.getParameter("id");
    String sMid=request.getParameter("mid");
    String sFinal=request.getParameter("final");
    out.print("學號:"+sNo+", 期中:"+sMid+", 期末:"+sFinal);
%>
<hr/>顯示session內容<hr/>
<%
    sNo=(String)session.getAttribute("ID");
    String sAvg=(String)session.getAttribute("AVG");
    out.print("學號:"+sNo+", 平均成績:"+sAvg);
%>
</html>
