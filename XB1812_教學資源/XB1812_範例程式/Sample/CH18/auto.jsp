<%@ page contentType="text/html;charset=utf-8" import="java.sql.*" %>
<%
  String responses="--符合的資料--";  //回應前端的字串
  if (request.getParameter("content") != null){
    String content=request.getParameter("content");
    try{
      Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
      Connection con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;database=school","demo","demo");
      String sql="select title from currentContent where substring(title,1,len(?))=?";
      PreparedStatement pst = con.prepareStatement( sql );
      pst.setString(1,content);
      pst.setString(2,content);
      ResultSet rs= pst.executeQuery();
      while ( rs.next() ){
        responses=responses+"<br>"+rs.getString("title");
      }
      //關閉物件
      rs.close();
      pst.close();
      con.close();
    }catch(Exception e){ out.print("資料庫無法使用，請確認原因:"+e.getMessage());}
  }
  out.print(responses);
%>