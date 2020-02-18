<html>
<head>
  <%@ page contentType="text/html;charset=utf-8" %>
  <%@ page import="java.util.*, java.sql.*, myBean.*" %>
  <jsp:useBean id="pool" scope="application" class="myBean.PoolBean"/>
</head>
<body>
<%
  Connection con=null;
  try{
    //測試是否已建立連線池物件
    if (pool.getDriver()==null){
      pool.setDriver(
        "com.microsoft.sqlserver.jdbc.SQLServerDriver");
	  pool.setURL(
        "jdbc:sqlserver://localhost:1433;database=school");
      pool.setUserName("demo");
      pool.setPassword("demo");   
      pool.setSize(5);  //設定連線池大小
       pool.initializePool();
    }
    con=pool.getConnection();
    Statement st=con.createStatement();
    String sql= "SELECT Student.id, name, count(*)\"cnt\","+
                "avg(score)\"avg\" FROM Student, Course "+
                "WHERE Student.id=Course.id "+
                "GROUP BY Student.id,name";
    ResultSet rs = st.executeQuery(sql);
%>
	<center><table border="1">
	<tr><th>學號</th><th>姓名</th><th>修課數</th>
    <th>平均分數</th></tr>
<%
  while (rs.next() ){
    out.println("<tr><td>"+rs.getObject("id")+"</td>");//學號
    out.println("<td>"+rs.getObject("name")+"</td>");  //姓名
    out.println("<td>"+rs.getObject("cnt")+"</td>");   //修課數
    out.println("<td>"+rs.getObject("avg")+"</td>");   //平均分數
  }
    rs.close();
    pool.releaseConnection(con);
  }catch(Exception e){ out.println(e.getMessage());}
%>
	</table></center>
</body>
</html>
