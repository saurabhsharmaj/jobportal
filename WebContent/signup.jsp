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
                        <form role="form" action="./home?action=signup" method="post">
                            <fieldset>
                            	<label>
                                        <%=request.getAttribute("errormsg")==null?"": request.getAttribute("errormsg")%>
                                </label>
                                <div class="form-group">
                                    <input class="form-control" placeholder="username" name="username" type="text" autofocus>
                                </div>
                                <div class="form-group">
                                    <input class="form-control" placeholder="Password" name="password" type="password" value="">
                                </div>
                                
                                <div class="form-group">
                                    <input class="form-control" placeholder="email" name="email" type="text" value="">
                                </div>
                                
									<div class="radio ">
                                    <label class="col-sm-4">
                                        <input name="type" type="radio" value="student" checked="checked">Student
                                    </label>
                                    <label class="col-sm-4">
                                        <input name="type" type="radio" value="staff">Staff
                                    </label>
                                    <label class="col-sm-4">
                                        <input name="type" type="radio" value="other">Other
                                    </label>
                                </div>
                                
                                
                                 <div class="form-group">
                                <select name="stream" class="form-control">
                                	<option value="cse">CSE</option>
                                	<option value="ece">ECE</option>
                                </select>
                                </div>
                                <!-- Change this to a button or input when using this as a form -->
                                <button class="btn btn-lg btn-success btn-block" type="submit">Singup</button>
                            </fieldset>
                        </form>
                         <div class="row">
                            	<div><a href="./home?action=login">Sign in</a></div>
                            </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
		<jsp:include page="footer.jsp"></jsp:include>
	</div>
</body>