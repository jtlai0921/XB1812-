<%@ page contentType="text/html" pageEncoding="Big5"%>
<%@ page import="org.lxh.smart.*"%>
<html>
<%
    String userName=request.getParameter("user");
    out.println("�ϥ�request���o�ϥΪ̪��m�W�G"+userName);

    SmartUpload smart = new SmartUpload() ;  //�غc SmartUpload����
    smart.initialize(pageContext) ;	//��l�ƤW�Ǿާ@
    smart.upload();  //����W��
    smart.save("upload");	// �N�W���ɫO�s�bupload�ؿ���
    userName=smart.getRequest().getParameter("user");
    out.println("<br/>�ϥ�SmartUpload������o�ϥΪ̪��m�W�G"+userName);
%>
</html>
