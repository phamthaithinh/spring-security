<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Access denied</title>
<link rel="stylesheet"
	href='<spring:url value="/resources/css/bootstrap.min.css"/>' />
<link rel="stylesheet"
	href='<spring:url value="/resources/css/custom.css"/>' />
</head>
<body>
<div id="error-area">
<h2>Access Denined</h2>
<p class="alert">You don't have permission to access this page.</p>
</div>
</body>
</html>