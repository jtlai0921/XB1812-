<html>
<head>
  <title>新增人員</title>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />  
</head>
<body>
  <%@ page contentType="text/html;charset=utf-8" import="java.sql.*" %>  
  <%
    //指定接收瀏覽器端傳送內容的字碼
    request.setCharacterEncoding("utf-8");
    //取得瀏覽器端傳送的內容
    String sName=request.getParameter("name");
    String sId=request.getParameter("user");
    String sPwd=request.getParameter("pwd");
    String sMail=request.getParameter("email");
    String sUnit=request.getParameter("unit");
    String sDept=request.getParameter("dept");
    try{
      //使用微軟 JDBC 驅動程式，連結SQL Server之school資料庫 
      Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
      Connection con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;database=school","demo","demo");
      PreparedStatement pst = con.prepareStatement("insert into Staff values (?,?,?,?,?,?)");
      pst.setString(1,sId);
      pst.setString(2,sPwd);
      pst.setString(3,sName);
      pst.setString(4,sMail);
      pst.setString(5,sUnit);
      pst.setString(6,sDept);

      pst.executeUpdate();
      out.println("新增完成");

      //關閉物件
      pst.close();
      con.close();
    }catch(Exception e){ out.print("資料庫無法使用，請確認原因:"+e.toString());}
  %>
</body>
</html>