<html> 
<%@ page contentType="text/html;charset=utf-8"  errorPage="handle.jsp" %>
<%
    float[] score= new float[3];
    float sum=0, avg=0; //sum:總分, avg:平均
    try{
        score[0]=Float.parseFloat(request.getParameter("chi"));
        score[1]=Float.parseFloat(request.getParameter("mat"));
        score[2]=Float.parseFloat(request.getParameter("eng"));

        for (int i=0; i<=score.length; i++)
            sum+=score[i];              

        avg=sum/score.length;
        out.print("總分："+sum+"<br/>平均成績："+avg);
    }catch(NumberFormatException e){
        out.print("數值輸入格式不正確!!");
    } 
%>
</html>
