<html>
<head>
  <%@ page contentType="text/html;charset=utf-8"
           import="java.sql.*" %>
</head>
<body>
<%
  try{
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
    Connection con=DriverManager.getConnection(
      "jdbc:sqlserver://localhost:1433;database=school",
      "demo","demo");
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery("select * from student");
%>
<center><table border="1">
  <tr><th>學號</th><th>姓名</th><th>地址</th>
  <th>生日</th><th>性別</th></tr>
<%
    while (rs.next() ){
      out.println("<tr><td>"+rs.getObject("id")+"</td>"); //學號
      out.println("<td>"+rs.getObject("name")+"</td>");   //姓名
      out.println("<td>"+rs.getObject("address")+"</td>");//地址
      out.println("<td>"+rs.getObject("birth")+"</td>");  //生日
      out.println("<td>"+rs.getObject("gender")+"</td></tr>");//性別
    }
    rs.close();
    st.close();
    con.close();
  }catch(Exception e){
    out.println("資料庫連結錯誤："+e.toString() );
  }
%>
</table></center>
</body>
</html>