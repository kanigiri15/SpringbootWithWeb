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
<title>Register</title>
</head>
<body style="margin-top:50px">
	<div class="container">
	<p class="text-right">
	<a href="/login">&#8592;...Get back to Login Page</a>
	</p>
	<div class="card align-middle">
		<div class="card-body">
    	<h4 class="card-title text-center">Register</h4>
			<form:form modelAttribute="register" action="/register" method="post">
				<div class="form-row">
					<div class="form-group col-md-6">
						<form:input path="firstName" class="form-control"
							placeholder="First Name" />
					</div>
					<div class="form-group col-md-6">
						<form:input path="lastName" class="form-control"
							placeholder="Last Name" />
					</div>
				</div>

				<div class="form-group">
					<form:input path="email" class="form-control" placeholder="Email" />
				</div>

				<div class="form-group">
					<form:input path="userId" class="form-control" placeholder="UserId" />

					<p style="color: red;">${errorMsg }</p>
				</div>
				<div class="form-group">
					<form:password path="password" class="form-control"
						placeholder="Password" />
				</div>
				<div class="form-group text-center">
				<input type="submit" value="Register" class="btn btn-primary" />
				</div>
			</form:form>
		</div>
	</div>
	</div>
</body>
</html>