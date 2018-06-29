<jsp:include page="header.jsp"></jsp:include>
<body>
	<div id="wrapper">
		 <div class="container">
        <div class="row">
            <div class="col-md-4 col-md-offset-4">
                <div class="login-panel panel panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title">Please Sign In</h3>
                    </div>
                    <div class="panel-body">
                        <form role="form" action="./login" method="post">
                            <fieldset>
                            <%if(request.getAttribute("errormsg")!=null){ %>
                            	<div class="alert alert-danger">
                                        <%=request.getAttribute("errormsg")==null?"": request.getAttribute("errormsg")%>
                                </div>
                                <%} %>
                                <div class="form-group">
                                    <input class="form-control" placeholder="username" name="username" type="text" autofocus>
                                </div>
                                <div class="form-group">
                                    <input class="form-control" placeholder="Password" name="password" type="password" value="">
                                </div>
                                
                                <div class="checkbox">
                                    <label>
                                        <input name="remember" type="checkbox" value="Remember Me">Remember Me
                                    </label>
                                </div>
                                <!-- Change this to a button or input when using this as a form -->
                                <button class="btn btn-lg btn-success btn-block" type="submit">Login</button>
                            </fieldset>
                            <div class="row" style="padding-top:10px">
                            	<div class="col-sm-6"><a href="./home?action=signup">Sign up</a></div>
                            	<div class="col-sm-6"><a href="./home?action=forgotpassword">forgot password</a></div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
		<jsp:include page="footer.jsp"></jsp:include>
	</div>
</body>