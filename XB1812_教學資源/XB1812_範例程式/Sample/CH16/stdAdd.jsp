<html>
  <head>
     <%@ page contentType="text/html;charset=utf-8" 
              import="java.sql.*, java.text.SimpleDateFormat" %>
  </head>
  <body>
    <%
      String id=request.getParameter("sno");
      String name=request.getParameter("name");
      String addr=request.getParameter("addr");
      String birth=request.getParameter("birth");
      String gender=request.getParameter("gender");

      //設定日期格式
      SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
      //進行轉換
      java.util.Date dt = sdf.parse(birth);
      Date sdt=new Date( dt.getDate());

      try{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
        Connection con=DriverManager.getConnection(
                       "jdbc:sqlserver://localhost:1433;database=school",
                       "demo","demo");
        PreparedStatement pst = con.prepareStatement(
                       "INSERT INTO Student VALUES (?,?,?,?,?)" );             
        pst.setString(1, id);
        pst.setString(2, name);
        pst.setString(3, addr);
        pst.setDate(4, sdt);  //日期是以String型態輸入處理
        pst.setString(5, gender);

        //執行
        if (pst.executeUpdate()==1)
           out.print("資料新增完畢!!");
       
        //清除資料
           pst.close();
           con.close();
      }catch(Exception e){
           out.println(e.toString() );
      }
  %>
  </body>
</html>
