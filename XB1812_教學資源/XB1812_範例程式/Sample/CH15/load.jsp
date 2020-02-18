<html>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<%@ page contentType="text/html" pageEncoding="utf-8" import="org.lxh.smart.*" %>
<%

  String path= request.getSession().getServletContext().getRealPath("/");
  String dir = "upload"; //檔案上傳後儲存的目錄
 
  java.io.File f = new java.io.File(path+dir);
  out.println("目錄:"+path+dir+"<hr/>");
  if (!f.exists())  //目錄不存在則新建目錄
    f.mkdir();

  SmartUpload smart = new SmartUpload();  //建構 SmartUpload物件
  smart.initialize(pageContext);	//初始化上傳操作
  smart.upload();  //執行上傳


  int rtn = smart.save("upload"); // 將上傳檔保存在upload目錄內
  if (rtn==1) //有上傳成功1個檔案
    out.println("檔案上傳完畢");
  else
    out.println("檔案上傳狀態："+Integer.toString(rtn) );
%>
</html>
