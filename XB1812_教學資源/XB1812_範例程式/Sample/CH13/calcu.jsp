<html>
<%@ page contentType="text/html;charset=utf-8" %>
執行結果：
<%
    String sNo1=request.getParameter("num1");
    String sNo2=request.getParameter("num2");
    String operation=request.getParameter("opt");
    
    float num1, num2;
    float answer=0;
    num1=Float.parseFloat(sNo1);
    num2= Float.parseFloat (sNo2);
    switch ( operation ){
      case "+" : answer=num1+num2; break;
      case "-" : answer=num1-num2; break;
      case "*" : answer=num1*num2; break;
      case "/" : answer=(float)num1/num2; break;
    }
    out.print(num1+operation+num2+" = "+answer);
%>
</html>
