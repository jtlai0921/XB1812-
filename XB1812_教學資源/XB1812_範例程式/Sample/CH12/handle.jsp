<html>
    <%@ page contentType="text/html;charset= utf-8" isErrorPage="true" %>
    <h3><center>抱歉系統發生問題，請稍後再試!!</center></h3>
    <% 
        response.setStatus(200); // 提供IE瀏覽器使用
        out.println("原因:"+exception.toString() );
    %>
</html>
