<html>
<%@ page contentType="text/html;charset=utf-8" %>
<%!
    public String Convert(String orig, String repStr, String chgStr){
        String txt=orig;
        int idx;
        while ((idx=txt.indexOf(repStr)) !=-1){
            txt=txt.substring(0,idx) + chgStr + txt.substring(idx+repStr.length());
        }
        return txt;
    }
%>

執行結果：
<%
    String account=request.getParameter("id");
    String password=request.getParameter("pwd");
    String message=request.getParameter("message");
  
    message=Convert(message,"台","臺");  

    out.print("帳號："+account+", 密碼："+password);
    out.print("<hr/>訊息內容：<hr/>"+message);

%>
</html>
