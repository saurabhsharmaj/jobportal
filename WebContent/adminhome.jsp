<%
String pageName=(request.getAttribute("page")==null ||request.getAttribute("page")=="")?"adminmain.jsp":(String)request.getAttribute("page");
%>
<jsp:include page="<%=pageName%>"></jsp:include>