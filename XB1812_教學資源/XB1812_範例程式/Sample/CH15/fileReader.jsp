<html>
<%@ page contentType="text/html;charset=utf-8" import="java.io.*" %>
<%
    char buffer[] = new char[1];
    int ch;
    String path= request.getSession().getServletContext().getRealPath("./text/");
    String fileName=path+"info.txt";
    out.println("測試檔案之路徑："+fileName+"<hr/>");

    FileReader f = new FileReader(fileName);
    while ( f.read(buffer,0,1) != -1 ){
        ch=buffer[0];
        if (ch==13)
            out.print("<br>");
        else
            out.print(buffer);
    }
    f.close();
%>
</html>
