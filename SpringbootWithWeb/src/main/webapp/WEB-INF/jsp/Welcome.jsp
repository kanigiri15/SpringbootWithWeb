<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="/webjars/bootstrap/3.3.6/css/bootstrap.min.css">
<script src="/webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<%@ include file="common/navigation.jspf"%>
<title>Welcome ${name}</title>
</head>
<body>
<div class="container align-items-center align-self-center"">
<div class="jumbotron align-items-center">
	<h1 class="display-3 text-center">
		Hello ${name}
	</h1>
</div>
</div>
</body>
</html>