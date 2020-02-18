<html>
<%@ page contentType="text/html;charset=utf-8" %>
<% 
    String id="", pwd=""; 
    Cookie ck[] = request.getCookies();
    for (int i=0; i<ck.length; i++){
        if (ck[i].getName().equals("ID") )
            id=ck[i].getValue();
        else if (ck[i].getName().equals("PWD") )
            pwd=ck[i].getValue();
    }
    out.println("你的資料: <br>帳號:"+id);
    out.println("<br>密碼:"+pwd);
%>
</html>
