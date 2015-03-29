<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<title>Login</title>
<link rel="stylesheet"
	href='<spring:url value="/resources/css/bootstrap.min.css"/>' />
<link rel="stylesheet"
	href='<spring:url value="/resources/css/custom.css"/>' />
</head>
<body>
	<div id="login-form">
		<spring:url value="/dologin.do" var="url" />
		<form:form role="form" action="${url }" method="POST">
			<legend>Sign in</legend>
			<c:if test="${param.error != null}">
				<div class="alert alert-danger">
					Failed to login.
					<c:if test="${SPRING_SECURITY_LAST_EXCEPTION != null}">
              Reason: <c:out
							value="${SPRING_SECURITY_LAST_EXCEPTION.message}" />
					</c:if>
				</div>
			</c:if>
			<div class="form-group">
				<label for="username">Username</label> <input type="text"
					id="username" class="form-control" required="required"
					name="username" placeholder="Enter username">
			</div>
			<div class="form-group">
				<label for="password">Password</label> <input id="c" type="password"
					class="form-control" required="required" name="password"
					placeholder="Password">
			</div>
			<div class="form-group">
				<input type="checkbox" name="_spring_security_remember_me"><span>Remember me</span>
			</div>
			<button type="submit" class="btn btn-default">Login</button>
		</form:form>
	</div>
</body>
</html>