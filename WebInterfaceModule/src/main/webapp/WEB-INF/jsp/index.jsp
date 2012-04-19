<%@ page language="java" contentType="text/html; charset=utf8" pageEncoding="utf8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib tagdir="/WEB-INF/tags" prefix="t"%>
<t:htmlPageTemplate>
    <jsp:attribute name="title">Welcome page</jsp:attribute>
    <jsp:body>
        <c:url var="testSelectUrl" value="spring/testing/0/0"/>
        <a href="${testSelectUrl}">Begin test</a>
    </jsp:body>
</t:htmlPageTemplate>
