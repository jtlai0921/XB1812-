<html>
<%@ page contentType="text/html;charset=Utf-8" %>
<%
      String data=request.getParameter("data");
      String type=request.getParameter("type");
      if (type.equals("A") )
         pageContext.setAttribute("DATA",data,pageContext.APPLICATION_SCOPE);
      else
         pageContext.setAttribute("DATA",data,pageContext.SESSION_SCOPE);

      response.sendRedirect("show.jsp");
%>
</html>
