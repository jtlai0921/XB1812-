<html>
   <%@ page contentType="text/html;charset=Utf-8" %>
   <%
      //取出儲存的陣列物件
        String[] Interest=(String[])session.getAttribute("INTEREST");   
        out.println("你的興趣包括：<br/>");
        for (int i=0; i<Interest.length; i++)
            out.println( Interest[i] + "<br/>" );
         
         //還原回原先的Boolean物件
        Boolean Flat=(Boolean)session.getAttribute("FLAG");
        boolean f=Flat.booleanValue();  
        out.println("<hr/> 旗號的內容為："+f);
     %>
</html>
