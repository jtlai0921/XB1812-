<html>
<head>
  <%@ page import="java.sql.*, myBean.*" contentType="text/html;charset=utf-8" %>
  <jsp:useBean id="pool" scope="application" class="myBean.PoolBean"/>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
</head>
<body>
<%
  String sId = request.getParameter("id");
  if (sId==null) //防止未經查詢過程直接進入本程式
    response.sendRedirect("query.html"); 

  try{
    Connection con=pool.getConnection(); 
    String sql="select * from CurrentContent where id=?";
    PreparedStatement pst=con.prepareStatement( sql );
    pst.setString(1,sId);
    ResultSet rs=pst.executeQuery();
    if (rs.next() ){
      //用於highlight的查詢字串
      String sHTML="<table border=\"1\"><tr>";
      sHTML=sHTML+"<tr><td>"+"系統號：</td><td>"+sId+"</td></tr>";
      sHTML=sHTML+"<tr><td>"+"編號：</td><td>"
            +rs.getString("SNo")+"</td></tr>";
      sHTML=sHTML+"<tr><td>"+"期刊：</td><td>"
            +rs.getString("Serial")+"</td></tr>";
      sHTML=sHTML+"<tr><td>"+"卷期：</td><td>"
            +rs.getString("Issue")+"</td></tr>";
      sHTML=sHTML+"<tr><td>"+"特刊：</td><td>"
            +rs.getString("Special")+"</td></tr>";
      sHTML=sHTML+"<tr><td>"+"篇名：</td><td>"
            +rs.getString("Title")+"</td></tr>";
      sHTML=sHTML+"<tr><td>"+"作者：</td><td>"
            +rs.getString("Author")+"</td></tr>";
      sHTML=sHTML+"<tr><td>"+"頁次：</td><td>"
            +rs.getString("Page")+"</td></tr>";
      sHTML=sHTML+"<tr><td>"+"附註：</td><td>"
            +rs.getString("Note")+"</td></tr>";
      sHTML=sHTML+"</table>";
      out.print(sHTML);
    }
    rs.close();
    pst.close();
    pool.releaseConnection(con);
  }catch(Exception e){     out.print("資料存取發生問題:"+e.toString() );}
%>
</body>
</html>
