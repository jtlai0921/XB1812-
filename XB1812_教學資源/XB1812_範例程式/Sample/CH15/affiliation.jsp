<html>
<%@ page contentType="text/html;charset=utf-8" import="java.io.*" %>
<%
    String id=request.getParameter("user");
    String pwd=request.getParameter("pwd");
    String name=request.getParameter("name");
    String email=request.getParameter("email");

    String fileName= request.getSession().getServletContext().getRealPath(".")+"/"+id;  //以id內容作為檔名
    File f = new File(fileName);
    if ( f.exists() ){
         out.print("帳號："+id+" 已經存在! ");
    }else{
         FileWriter fw = new FileWriter(fileName);
         BufferedWriter bw = new BufferedWriter(fw);
         bw.write(id);
         bw.newLine();
         bw.write(pwd);
         bw.newLine();
         bw.write(name);
         bw.newLine();
         bw.write(email);
         
         bw.close();
         fw.close();
         out.print("帳號："+id+"新增完畢!");
    }
%>
    <input type="button" value="回上一頁" onclick="history.back()">
</html>
