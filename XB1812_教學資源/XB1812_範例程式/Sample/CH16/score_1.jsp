<html>
<%@ page contentType="text/html;charset=utf-8" import="java.sql.*" %>
<%
    try{
   Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
   Connection con=DriverManager.getConnection(
      "jdbc:sqlserver://localhost:1433;database=school",
      "demo","demo");

      Statement st = con.createStatement();
      String sql= "SELECT Student.id, name, count(*), avg(score) "+
                  "FROM Student,Course WHERE Student.id=Course.id "+
                  "GROUP BY Student.id, name";

      ResultSet rs = st.executeQuery(sql);
%>
   <center><table border="1">
   <tr><th>學號</th><th>姓名</th><th>修課數</th><th>平均分數</th></tr>
<% 
      while (rs.next() ){
        out.println("<tr><td>"+rs.getObject(1)+"</td>");   //學號
        out.println("<td>"+rs.getObject(2)+"</td>");      //姓名
        out.println("<td>"+rs.getObject(3)+"</td>");      //修課數
        out.println("<td>"+rs.getObject(4)+"</td>");      //平均分數
      }
      rs.close();
      st.close();
      con.close();
  }catch(Exception e){
      out.println(e.toString());
  }
%>
</table>
</html>
