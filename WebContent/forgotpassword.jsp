<jsp:include page="header.jsp"></jsp:include>
<body>
	<div id="wrapper">
		 <div class="container">
        <div class="row">
            <div class="col-md-4 col-md-offset-4">
                <div class="login-panel panel panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title">Recover you password</h3>
                    </div>
                    <div class="panel-body">
                        <form role="form" action="./recoverpassword" method="post">
                            <fieldset>
                            	<label>
                                        <%=request.getAttribute("errormsg")==null?"": request.getAttribute("errormsg")%>
                                </label>
                                <div class="form-group">
                                    <input class="form-control" placeholder="username" name="username" type="text" autofocus>
                                </div>
                               <div class="row" style="padding-top:10px">
                            	<div class="col-sm-12 text-center"><b>OR</b></div>
                            	</div>
                                <div class="form-group">
                                    <input class="form-control" placeholder="email-id" name="email" type="email" value="">
                                </div>
                              
                                <!-- Change this to a button or input when using this as a form -->
                                <button class="btn btn-lg btn-success btn-block" type="submit">Submit</button>
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