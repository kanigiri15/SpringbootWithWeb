<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css">
<title>Login</title>
</head>
<body style="margin-top:50px">
	<div class="container card align-middle"  style="max-width:330px; margin:0 auto">
		<div class="card-body" >
    		<h4 class="card-title text-center">Login</h4>
			<p style="color: red;">${errorMsg}</p>
			<form:form modelAttribute="userv" action="/login" method="post">
					<div class="form-group">
						<form:input path="userId" class="form-control"
							placeholder="User Name" required="required"/>
					</div>
					<div class="form-group">
						<form:password path="password" class="form-control"
							placeholder="Password" required="required"/>
							
						<p style="color: red;">${errorPwd}</p>
					</div>
				<input type="submit" value="log In" class="btn btn-primary btn-block" />
			</form:form>
			<a href="/register">Not Yet Registered ? Register here</a>
		</div>
	</div>
</body>
</html>