<%@ page contentType="text/html; charset=utf-8" %>
<% 
    String txt=request.getParameter("choice"); //接收瀏覽器傳來的參數值
    if(txt.equals("tpe")){
		//傳回給流覽器的選單資料
		response.setContentType("text/xml; charset=UTF-8");  
		response.setHeader("Cache-Control", "no-cache");  
		out.println("<options>");  
		out.println("<option>國立政治大學</option>");  
		out.println("<option>國立陽明大學</option>");
		out.println("<option>國立臺北大學</option>");
		out.println("<option>國立臺北教育大學</option>");
		out.println("<option>國立臺灣師範大學</option>");
		out.println("<option>臺北市立大學</option>");
		out.println("<option>國立臺灣戲曲學院</option>");
		out.println("<option>國立臺灣科技大學</option>");
		out.println("<option>國立臺北護理健康大學</option>");
		out.println("<option>國立臺北科技大學</option>");
		out.println("<option>國立臺北商業技術學院</option>");
		out.println("<option>國防醫學院</option>");
		out.println("<option>實踐大學</option>");
		out.println("<option>臺北醫學大學</option>");
		out.println("<option>銘傳大學</option>");
		out.println("<option>大同大學</option>");
		out.println("<option>中國文化大學</option>");
		out.println("<option>東吳大學</option>");
		out.println("<option>世新大學</option>");
		out.println("<option>臺北城市科技大學</option>");
		out.println("<option>台北海洋技術學院</option>");
		out.println("<option>中國科技大學</option>");
		out.println("<option>中華科技大學</option>");
		out.println("<option>德明財經科技大學</option>");
		out.println("<option>臺灣浸會神學院</option>");
		out.println("</options>"); 
    }else if(txt.equals("klc")){
		response.setContentType("text/xml; charset=UTF-8");  
		response.setHeader("Cache-Control", "no-cache");  
		out.println("<options>");
		out.println("<option>國立臺灣海洋大學</option>");  
		out.println("<option>崇右技術學院</option>");  
		out.println("<option>國管理暨健康學院</option>");
		out.println("</options>");
    }else if (txt.equals("ntp")){
		response.setContentType("text/xml; charset=UTF-8");  
		response.setHeader("Cache-Control", "no-cache");  
		out.println("<options>");
		out.println("<option>國國立臺北大學</option>");  
		out.println("<option>國立臺灣藝術大學</option>");  
		out.println("<option>國立空中大學</option>");
		out.println("<option>真理大學</option>");
		out.println("<option>馬偕醫學院</option>");
		out.println("<option>淡江大學</option>");
		out.println("<option>輔仁大學</option>");
		out.println("<option>華梵大學</option>");
		out.println("<option>聖約翰科技大學</option>");
		out.println("<option>德霖技術學院</option>");
		out.println("</options>"); 
    }
%>
