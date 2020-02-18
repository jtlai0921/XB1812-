<html>
<%@ page contentType="text/html;charset=utf-8" import="java.io.*" %>
<%
    String line;
    String path= request.getSession().getServletContext().getRealPath("./text/");
    String fileName=path+"info.txt";
    out.println("測試檔案之路徑："+fileName+"<hr/>");

    FileReader f = new FileReader(fileName);
    BufferedReader bf=new BufferedReader(f);
    while ((line= bf.readLine() ) != null )
        out.print("<br>"+line);

    bf.close();
    f.close();
%>
</html>
