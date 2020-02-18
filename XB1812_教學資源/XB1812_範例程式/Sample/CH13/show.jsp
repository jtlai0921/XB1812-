<html>
<%@ page contentType="text/html;charset=utf-8" %>
執行結果：
<%
    String[] dept=request.getParameterValues("dept");
    String[] interest=request.getParameterValues("interest");
    String data;

    if (dept !=null){   // 陣列元素不是null 表示有勾選報考系所)
        out.print("報考的系所為：");
        for (int i=0; i<dept.length; i++){
             data=dept[i];
             switch(data){
                  case "IC": out.print(" 資傳系"); break;
                  case "IM": out.print(" 資管系"); break;
                  case "IE": out.print(" 資工系"); break;
                  case "LI": out.print(" 圖資系"); break;
                  case "IS": out.print(" 資科系"); break;
              }
         }
    }

    if (interest != null){  // 陣列元素不是null表示有勾選興趣
        out.print("<hr/>個人興趣包括：");
        for (int i=0; i<interest.length; i++){
              data=interest[i];
              switch(data){
                  case "R": out.print(" 閱讀書籍"); break;
                  case "T": out.print(" 旅行"); break;
                  case "M": out.print(" 看電影"); break;
                  case "F": out.print(" 美食饗宴"); break;
              }
         }
    }
%>
</html>
