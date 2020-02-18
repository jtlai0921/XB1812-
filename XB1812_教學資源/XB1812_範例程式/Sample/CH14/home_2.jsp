<html>
<%@ page contentType="text/html;charset=Utf-8" %>
<%
    synchronized(session){
        int iCnt=0;    
        String sCnt = (String)application.getAttribute("COUNT");

        if ( sCnt != null)
                iCnt=Integer.parseInt(sCnt);

        if (session.isNew()){
            iCnt++;
            sCnt=Integer.toString( iCnt );
            application.setAttribute("COUNT", sCnt);
          }
          out.print("歡迎光臨，你是網站第"+sCnt+"位訪客");
     }
%>
</html>
