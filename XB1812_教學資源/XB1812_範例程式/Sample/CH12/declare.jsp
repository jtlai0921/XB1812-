<html>
<head>
   <%@ page contentType= "text/html;charset=utf-8" %>
   <%! 
        int i=20;
        String txt="今天天氣好";
    %>
</head>
<body>
   <%
        i++;
        out.print( txt+" 溫度："+i);
   %>   
</body>
</html>

