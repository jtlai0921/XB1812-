<html>
<head>
  <%@ page contentType="text/html;charset=utf-8" %>
  <%@ page import=" java.sql.*" %>
  <meta http-equiv="Content-Type"
        content="text/html; charset=utf-8">
</head>
<body>
<%
  final int nPageLine=10; //每頁顯示的資料數目
  int nRowCount=0, nPageCount=0, nPage=0;
  String sId="", sRowCnt="", sPage="";
  ResultSet rs=null;
  try{
    rs=(ResultSet)session.getAttribute("QUERY");
    sRowCnt=(String)session.getAttribute("ROWCOUNT");
    nRowCount=Integer.parseInt(sRowCnt);
  }catch(Exception e){
    out.print("檢索結果資存取發生錯誤："+e.toString() );
  }

  if (rs==null)
    //防止未經查詢過程直接進入本程式
    response.sendRedirect("query.html");
  else{
    sPage=request.getParameter("page");
    if (sPage ==null)
      nPage=1;
    else{
      nPage=Integer.parseInt(sPage);
      if (nPage<1) nPage=1;
    }
    //計算此頁要顯示資料的起訖筆數
    int nLine=(nPage-1)*nPageLine;
    int nMax=nLine+nPageLine-1; 
    //計算總頁數
    nPageCount=(nRowCount+nPageLine-1)/nPageLine; 

    if (nPage > nPageCount)
      nPage=nPageCount;
    out.print("資料筆數："+nRowCount+"，頁數：第"+
              nPage+"頁/總頁數："+nPageCount+"頁<hr/>");

    if (nPage>1)  //顯示「上一頁」的超連結
      out.print("<a href=\"queryBrief.jsp?page="+
                (nPage-1)+"\">上一頁</a> ");
    if (nPage<nPageCount) //顯示「下一頁」的超連結
      out.print("<a href=\"queryBrief.jsp?page="+
                (nPage+1)+"\">下一頁</a> ");
    out.print("<a href=\"query.html\">離開</a><hr/>");
%>
    <!--網頁以表格方式簡易顯示查詢結果的資料內容-->
    <table border="1" width="100%">
      <tr><th width="5%">序號</th>
      <th width="25%">期刊</th>
      <th width="70%">篇名</th></tr>
<%		
    //顯示資料
    rs.absolute((nPage-1)*nPageLine+1);  //資料集指標指向此頁的第一筆

    while (nLine <=nMax && !rs.isAfterLast() ){
      nLine++;
      sId=rs.getString("id");
      out.println("<tr><td>"+
            "<a href=\"queryDetail.jsp?id="+sId+"\">"+nLine+"</a>"+
            "</td><td>"+rs.getString("serial")+
            "</td><td>"+rs.getString("title")+
            "</td></tr>");
      	
      rs.next();
    }
    out.print("<table><hr/>");
  }
%>
</body>
</html>
