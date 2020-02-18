<html>
    <%@ page contentType="text/html;charset=Utf-8" isErrorPage="true" %>
    <h3><center>抱歉系統發生問題!!</center></h3>
    <% 
        out.println("原因:"+exception.toString() );
    %>
</html>
