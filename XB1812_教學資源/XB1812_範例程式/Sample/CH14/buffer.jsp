html>
    <head>
       <%@ page contentType="text/html;charset=Utf-8" import="java.util.*" %>
    </head> 
    <body>
       現在時間：<%= new Date() %><br>
       現在緩衝區大小：<%= out.getBufferSize() %> 位元組<br>
       現在緩衝區剩餘大小：<%= out.getRemaining() %> 位元組<br>
       <% out.clear(); %>
      現在緩衝區剩餘大小：<%= out.getRemaining() %> 位元組<br>
    </body>
</html>
