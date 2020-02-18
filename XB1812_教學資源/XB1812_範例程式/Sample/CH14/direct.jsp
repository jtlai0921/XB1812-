<html>
   <%@ page contentType="text/html;charset=Utf-8" %>
   <%
        String target=request.getParameter("target");
        response.sendRedirect( target );
    %>
</html>
