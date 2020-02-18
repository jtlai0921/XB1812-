<html>
<head>
  <%@ page contentType="text/html;charset=utf-8" %>
  <%@ page import=" java.sql.*, myBean.*" %>
  <jsp:useBean id="pool" scope="application" 
               class="myBean.PoolBean"/>
</head>
<body>
<%
  String sKwd=request.getParameter("keyword");;
  String sql=null;
  Connection con=null;
  Statement st=null;
  ResultSet rs=null;
  try{
    if (pool.getDriver()==null){
      pool.setDriver("com.microsoft.sqlserver.jdbc.SQLServerDriver");
      pool.setURL("jdbc:sqlserver://localhost:1433;database=school");
      pool.setUserName("demo");
      pool.setPassword("demo");   
      pool.setSize(5);  //設定連線池大小
      pool.initializePool();
    }
  }catch(Exception e){
     out.print("資料連結發生問題:"+e.toString() );
  }
  con=pool.getConnection();
  st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                         ResultSet.CONCUR_READ_ONLY); 
  sql="SELECT id, serial, issue, special, title "+
      "FROM CurrentContent "+
      "WHERE title like \'%"+sKwd+"%\' ORDER BY title";
  rs = st.executeQuery(sql);
  rs.last();
  int nRowCount=rs.getRow();  //取得查詢結果的數量
  if (nRowCount>0){
    session.setAttribute("QUERY",rs);
    session.setAttribute("ROWCOUNT",Integer.toString(nRowCount));
    session.setAttribute("KEYWORD",sKwd);
    response.sendRedirect("queryBrief.jsp");
  }else
    out.print("查詢:"+sKwd+" 沒有符合的資料");
   
  pool.releaseConnection(con);  //歸還連線物件
%>
</body>
</html>
