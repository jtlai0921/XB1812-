<html>
<%@ page contentType="text/html;charset=utf-8"
         errorPage="handle.jsp" %>
計算成績<hr/>
<%
   int[] score={78,84,96,75,92,83};
   int sum=0;
   for (int i=0; i<=score.length; i++)
      sum+=score[i];

   out.println("成績總分為："+sum);
%>
</html>
