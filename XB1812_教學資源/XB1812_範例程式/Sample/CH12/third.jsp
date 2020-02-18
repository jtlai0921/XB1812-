<html>
  <head>
    <%@ page contentType="text/html;charset=utf-8" %>
    <title>練習</title>
  </head>
  <body>
    <%-- 這是宣告 --%>
    <%!
        int getCalcu(int b){
           int sum=0;
           for (int i=1; i<=b; i++)
              sum=sum+i;
           return sum;
        }
        int varConvert(int a){
            //out.println("<hr>原本傳入的值為:"+a);//錯誤，網頁輸出的內容只能在scriptlet範圍內!!
            a=getCalcu(a);
            return a;
        }
        int a=10;   //宣告的「全域變數」
     %>
     
     程式開始...
     <%  //這裡是運算式元素的程式
        out.println("<br>變數a的值為: "+a);
        a= varConvert(a);
        out.println("<br>變數a的值為: "+a);
     %>
  </body>
</html>        
