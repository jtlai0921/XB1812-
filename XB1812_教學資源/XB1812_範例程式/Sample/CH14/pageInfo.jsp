<html> 
  <head>
      <meta http-equiv="Content-Type" content="text/html; charset=utf-8" /> 
      <%@ page contentType="text/html;charset=utf-8" info="這是一支練習的JSP網頁程式" %>
  </head>
  <body>
    網頁內容資訊：
    <%
      String txt= ((HttpJspPage)page).getServletInfo();
      out.println( txt );
    %>
  </body>
</html>
