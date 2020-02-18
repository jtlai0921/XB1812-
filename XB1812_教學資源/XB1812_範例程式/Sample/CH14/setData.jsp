<html>
<%@ page contentType="text/html;charset=Utf-8" %>
<%
    int birth=2000;
    request.setAttribute("Name", "張三");
    request.setAttribute("Year",  Integer.toString(birth) );
    // response.sendRedirect( "getData.jsp" );
%>
<jsp:forward page="./getData.jsp" />  
</html>
