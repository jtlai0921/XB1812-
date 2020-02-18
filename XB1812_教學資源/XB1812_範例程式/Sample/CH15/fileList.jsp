<html>
<%@ page contentType="text/html;charset=utf-8" import="java.io.*" %>
<%
    String path= request.getSession().getServletContext().getRealPath("/");

    out.print("網站根目錄的真實路徑位置："+path);

    File f = new File(path);
    File[] fList = f.listFiles();//取得f物件所在位置的所有子目錄與檔案
    for (int i=0; i<fList.length; i++){
        if (fList[i].isFile())
            out.print("<br/>檔案名稱："+fList[i].getName() );
        else
            out.print("<br/>目錄名稱："+fList[i].getName() );
    }
%>
</html>
