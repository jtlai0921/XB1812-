<html>
<head>
   <%@ page contentType= "text/html;charset=utf-8" %>
   <%! 
        float c=0, f=0;
        String txt="今天天氣好";

        float getFahrenheit(){
            //華氏= 攝氏*(9/5)+32
            float degree=c*((float)9/5)+32;
            return degree;
        }
   %>
</head>
<body>
   <%
        c=24f;   //指定24(float)給變數c，代表攝氏溫度
        out.print( "攝氏溫度："+c);
        f=getFahrenheit();
        out.print("<br/>華氏溫度："+f );
   %>   
</body>
</html>
