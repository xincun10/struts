<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/form3.action" method="post">
		username:<input type="text" name="username"/><br>
		password:<input type="text" name="password"/><br>
		<input type="submit" value="submit"/>
	</form>
</body>
</html>