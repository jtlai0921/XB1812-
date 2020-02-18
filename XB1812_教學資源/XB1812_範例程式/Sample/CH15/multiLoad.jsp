<html>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<%@ page contentType="text/html;encoding=utf-8"
         import="org.lxh.smart.*"%>
<%
  String path= request.getSession().getServletContext().getRealPath("/");
  String dir = "upload"; //檔案上傳後儲存的目錄
  java.io.File f = new java.io.File(path+dir);
  out.println("目錄:"+path+dir+"<hr/>");
  if (!f.exists())  //目錄不存在則新建目錄
    f.mkdir();
 
  String fileName;
  SmartUpload smart = new SmartUpload(); //建構 SmartUpload物件
  smart.initialize(pageContext); //初始化上傳操作
  smart.upload();

  out.println("檔案數量:"+smart.getFiles().getCount());
  for(int i=0;i<smart.getFiles().getCount();i++){
    fileName=smart.getFiles().getFile(i).getFileName();
    if (fileName.length() >0){
      out.println("<br/>檔名:"+fileName);
      smart.save(path+dir);
    }
  }
  out.print("<hr/>上傳完成");
%>
</html>
