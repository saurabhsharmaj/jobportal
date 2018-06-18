<%
String pageName=(request.getAttribute("page")==null ||request.getAttribute("page")=="")?"main.jsp":(String)request.getAttribute("page");
%>
<jsp:include page="<%=pageName%>"></jsp:include>