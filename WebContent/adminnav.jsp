<%@page import="com.bit.hostel.model.User"%>
<%
User user = null;
if(request.getSession().getAttribute("user")!=null){
	user = (User)request.getSession().getAttribute("user");
%>
<nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="index.jsp">Hostel Project</a>
            </div>
            <!-- /.navbar-header -->

            <ul class="nav navbar-top-links navbar-right">
               	<%if(request.getAttribute("pendingReq") !=null && (Integer)request.getAttribute("pendingReq") > 0) {%>
               	<li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                        <i class="fa fa-bell faa-ring animated"></i> <span class="badge"><%=request.getAttribute("pendingReq") %></span>
                    </a>
                </li> 
               	<%} %>           
               
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                        (<%=user.getUsername().toUpperCase() %> as <%=user.getRole() %>)<i class="fa fa-user fa-fw"></i> <i class="fa fa-caret-down"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-user">
                        <li><a href="./admin?action=editprofile"><i class="fa fa-user fa-fw"></i> User Profile</a>
                        </li>
                        <li><a href="#"><i class="fa fa-gear fa-fw"></i> Settings</a>
                        </li>
                        <li class="divider"></li>
                        <li><a href="./admin?action=logout"><i class="fa fa-sign-out fa-fw"></i> Logout</a>
                        </li>
                    </ul>
                    <!-- /.dropdown-user -->
                </li>
                <!-- /.dropdown -->
            </ul>
            <!-- /.navbar-top-links -->

           <jsp:include page="leftnav_admin.jsp"></jsp:include>
        </nav>
<%} else {

response.sendRedirect("./login.jsp");
}%>