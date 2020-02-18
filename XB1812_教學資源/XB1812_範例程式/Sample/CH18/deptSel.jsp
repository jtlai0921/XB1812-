<%@ page contentType="text/html;charset=utf-8" import="java.sql.*" %>
<% 
  String code, name;

  String sId=request.getParameter("text");
  response.setContentType("text/xml; charset=UTF-8");  
  response.setHeader("Cache-Control", "no-cache");
  try{
    out.println("<options>");  
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    Connection con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;database=school","demo","demo");
    PreparedStatement pst = con.prepareStatement("select * from Depart where id=?");
    pst.setString(1,sId);
    ResultSet rs= pst.executeQuery();
    while ( rs.next() ){
       code=rs.getString("dept");
       code=code.trim();
       name=rs.getString("name");
       out.println("<option>"+name+"</option>");
       out.println("<option>"+code+"</option>");
    }
    out.println("</options>"); 
      
    //關閉物件
    rs.close();
    pst.close();
    con.close();
  }catch(Exception e){ out.print("資料庫無法使用，請確認原因:"+e.getMessage());}
%>
