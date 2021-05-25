<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Test</title>

    <link href="${contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="${contextPath}/resources/css/common.css" rel="stylesheet">
</head>
<%--<head>--%>
<%--    <meta charset="UTF-8">--%>
<%--    <title>Hello ${name}!</title>--%>
<%--</head>--%>
<body>
<%--<h2 class="hello-title">Hello ${name}!</h2>--%>

<form:form method="POST" modelAttribute="test" class="form-signin">
    <spring:bind path="name">
        <div class="form-group ${status.error ? 'has-error' : ''}">
            <form:input type="text" path="name" class="form-control" placeholder="Name"
                        autofocus="true"></form:input>
            <form:errors path="name"></form:errors>
        </div>
    </spring:bind>

</form:form>>
</body>
</html>