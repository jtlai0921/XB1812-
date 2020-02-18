<%@ page contentType="text/html" pageEncoding="Big5"%>
<%@ page import="org.lxh.smart.*"%>
<html>
<%
    String userName=request.getParameter("user");
    out.println("使用request取得使用者的姓名："+userName);

    SmartUpload smart = new SmartUpload() ;  //建構 SmartUpload物件
    smart.initialize(pageContext) ;	//初始化上傳操作
    smart.upload();  //執行上傳
    smart.save("upload");	// 將上傳檔保存在upload目錄內
    userName=smart.getRequest().getParameter("user");
    out.println("<br/>使用SmartUpload物件取得使用者的姓名："+userName);
%>
</html>
