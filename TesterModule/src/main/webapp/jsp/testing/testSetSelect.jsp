<%@ page language="java" contentType="text/html; charset=utf8" pageEncoding="utf8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title><spring:message code="testset.selectpage.title"/></title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
</head>
<body>
    <h1><spring:message code="testset.selectpage.title"/></h1>

    <c:url var="actionUrl" value="/spring/testSetSelect"/>
    <form action="${actionUrl}" method="post">
        <dl>
            <c:forEach var="each" items="${testSetContent}">
                <dt><label><input type="radio" name="testSetNumber" value="${each.id}"/>${each.name}</label></dt>
                <dd>${each.description}</dd>
            </c:forEach>
        </dl>
        <spring:message var="submitText" code="testset.selectpage.submittext"/>
        <input type="submit" value="${submitText}"/>
    </form>
</body>
</html>