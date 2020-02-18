<%@ page contentType="text/html;charset=utf-8" import="java.sql.*" %>
<%
    try{
      String sId=request.getParameter("user");
      Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
      Connection con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;database=school","demo","demo");
      PreparedStatement pst = con.prepareStatement("select * from staff where id=?");
      pst.setString(1,sId);
      ResultSet rs= pst.executeQuery();
      if ( rs.next() )	 //將指標移到第一筆紀錄，實際也應該只有一筆紀錄
         out.print("true"); //回應true表示帳號已經存在
      else
         out.print("false");  //回應false表示帳號不存在

      //關閉物件
     
      rs.close();
      pst.close();
      con.close();
    }catch(Exception e){ out.print("資料庫無法使用，請確認原因:"+e.getMessage());}
  %>
