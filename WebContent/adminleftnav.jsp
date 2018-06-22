<%
String pageName=(request.getAttribute("leftnav")==null ||request.getAttribute("leftnav")=="")?"leftnav_default.jsp":(String)request.getAttribute("leftnav");
if(request.getSession().getAttribute("user") !=null){
%>
<jsp:include page="<%=pageName%>"></jsp:include>
<%}%>