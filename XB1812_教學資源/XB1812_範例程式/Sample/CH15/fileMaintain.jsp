<html>
<%@ page contentType="text/html;charset=utf-8" import="java.io.*" %>
<%
    String fileName=request.getParameter("name");
    String fileType=request.getParameter("type");
    String path= request.getSession().getServletContext().getRealPath(".");

    File f = new File(path+fileName);
    if (f.exists() ){
        if (f.isFile())
           out.print("檔案");
        else out.print("目錄");
        out.print( fileName+"已經存在。");
        boolean result=f.delete();
        if (result)
            out.print("刪除成功");
        else
            out.print("無法刪除");
    }else{
        if (fileType.equals("F")){
           out.print("建立檔案："+fileName);
           f.createNewFile();
        }else{
           out.print("建立目錄："+fileName);
           f.mkdir();
        }
    }
%>
</html>
