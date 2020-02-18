<%@ page contentType="text/html;charset=utf-8" import="java.io.*" %>
<%
    String id = request.getParameter("user");
    String key=request.getParameter("pwd");
    String remain= request.getParameter("keep");
    String fileName= String path= request.getSession().getServletContext().getRealPath(".")+id;  //以帳號做為檔名
    File f = new File(fileName);
    if (f.exists()){
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
        br.readLine();  //第一行是帳號，不是我們要的
        String password=br.readLine();  //第二行是密碼
        if (password.equals(key)){
            session.setAttribute("ID",id);
            if ( remain !=null ){
                Cookie ck = new Cookie("ACCOUNT", id);
                ck.setMaxAge(99999);  //設一個大數，儲存久久
                response.addCookie(ck);
            }
            response.sendRedirect("home.jsp");
        }
    }
%>
<center>
    檔案或密碼錯誤!!
    <input type="button" value="回上一頁" onclick="history.back()">
</center>
</html>
