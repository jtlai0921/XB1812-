<html>
<%@ page contentType="text/html;charset=utf-8" import="java.io.*" %>
<%
    String data =request.getParameter("data");  //寫入的資料
    String type =request.getParameter("type");  //寫入模式
    boolean bType;
    if (type.equals("O") ) 
         bType=false;    //覆寫模式
    else bType=true;     //附加模式
     //寫入文字檔案名稱: test.txt 
    String fileName=request.getSession().getServletContext().getRealPath (".")+"\\demo.txt"; 
    out.println("測試檔案之路徑："+fileName+"<hr/>");

    File f = new File(fileName);
    if (! f.exists())  //如果不存在就開新檔
          f.createNewFile(); 

    FileWriter fw = new FileWriter(fileName, bType);
    BufferedWriter bw=new BufferedWriter(fw);
    bw.write(data);
    bw.newLine();

    bw.close();
    fw.close();
%>
資料寫入完畢!!
</html>
