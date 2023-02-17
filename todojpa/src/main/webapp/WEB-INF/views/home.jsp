<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page session="false" %>
<html>
<head>
<meta charset="utf-8">
	<title>Home</title>
	
</head>
<body>
<sec:authorize access="!isAuthenticated()">
	<a href = "loginform.html">login</a>
</sec:authorize>

<sec:authorize access="isAuthenticated()">
	Welcome Back,,,   <sec:authentication property="name"/> <a href ="logout">logout</a>
</sec:authorize>


<br><hr>
<a href="userregform.html">join user</a> 
<a href="userregform.html">회원가입</a> 
<br><hr>

<a href="todo.html">todo</a>

</body>
</html>