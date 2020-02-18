<html>
<%@ page contentType="text/html;charset=utf-8" import="java.sql.*" %>

<%

try{
  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
  Connection con= DriverManager.getConnection(
    "jdbc:sqlserver://localhost:1433;database=school","demo","demo");

  Statement st = con.createStatement();

  String sql= "SELECT * FROM student";
  ResultSet rs = st.executeQuery(sql);

  while (rs.next()) {
    out.println("學號" + rs.getString(1)); 
    out.println("姓名" + rs.getString(2));
    out.println("成績" + rs.getString(3)+"<br/>");
  }

  rs.close();
  st.close();
  con.close();
}catch(Exception e){out.println("資料庫連節發生問題："+e.toString() );}

%>
</html>