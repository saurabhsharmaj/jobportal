<%@page import="com.bit.hostel.common.UserRole"%>
<%@page import="com.bit.hostel.model.User"%>
<%
if(request.getSession().getAttribute("user") !=null){
	User user= (User)request.getSession().getAttribute("user");
%>
 <div class="navbar-default sidebar" role="navigation">
                <div class="sidebar-nav navbar-collapse">
                    <ul class="nav" id="side-menu">
                        <li class="sidebar-search">
                            <div class="input-group custom-search-form">
                                <input type="text" class="form-control" placeholder="Search...">
                                <span class="input-group-btn">
                                <button class="btn btn-default" type="button">
                                    <i class="fa fa-search"></i>
                                </button>
                            </span>
                            </div>
                            <!-- /input-group -->
                        </li>
                        <%if(user.getRole().equals(UserRole.ADMIN_ROLE)) {%>
	                        <li>
	                            <a href="./admin?action=dashboard"><i class="fa fa-dashboard fa-fw"></i> Dashboard</a>
	                        </li>
	                        
	                        <li>
	                            <a href="./admin?action=user"><i class="fa fa-table fa-fw"></i> User</a>
	                        </li>
	                         <li>
	                            <a href="./admin?action=student"><i class="fa fa-table fa-fw"></i> Student</a>
	                        </li>
	                         <li>
	                            <a href="./admin?action=vendor"><i class="fa fa-table fa-fw"></i> Vendor</a>
	                        </li>
	                         <li>
	                            <a href="./admin?action=staff"><i class="fa fa-table fa-fw"></i> Staff</a>
	                        </li>
	                        <li>
	                            <a href="./admin?action=leave"><i class="fa fa-table fa-fw"></i> View Leave(s)</a>
	                        </li>
                        <%} else if(user.getRole().equals(UserRole.STAFF_HOD_ROLE)) { %>
	                       	<li>
	                           <a href="./admin?action=student"><i class="fa fa-table fa-fw"></i> Student</a>
	                       	</li>
	                         <li>
	                            <a href="./admin?action=leave"><i class="fa fa-table fa-fw"></i> Apply Leave</a>
	                        </li>
	                        <li>
	                            <a href="./admin"><i class="fa fa-table fa-fw"></i> View Leave</a>
	                        </li>
	                         <li>
	                            <a href="./admin?action=staff"><i class="fa fa-table fa-fw"></i> Staff</a>
	                        </li>
                        
                        <%} else if(user.getRole().equals(UserRole.STAFF_ROLE)) { %>
                        	<li>
	                           <a href="./admin?action=student"><i class="fa fa-table fa-fw"></i> Student</a>
	                       	</li>
	                         <li>
	                            <a href="./admin?action=leave"><i class="fa fa-table fa-fw"></i> Apply Leave</a>
	                        </li>
	                         <li>
	                            <a href="./admin"><i class="fa fa-table fa-fw"></i> View Leave</a>
	                        </li>
                       
                       	<%} else if(user.getRole().equals(UserRole.STUDENT_ROLE)) { %>
                         	
	                        <li>
	                            <a href="./admin?action=leave"><i class="fa fa-table fa-fw"></i> Apply Leave</a>
	                        </li>
	                         <li>
	                            <a href="./admin"><i class="fa fa-table fa-fw"></i> View Leave</a>
	                        </li>
                        <%} else if(user.getRole().equals(UserRole.GARD_ROLE)) { %>
                        	<li>
	                            <a href="./admin?action=generatePass"><i class="fa fa-table fa-fw"></i> Generate Pass</a>
	                        </li>
                        <%} %>
                    </ul>
                </div>
                <!-- /.sidebar-collapse -->
            </div>
            <!-- /.navbar-static-side -->
<%}%>