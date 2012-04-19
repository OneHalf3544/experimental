<%@ page language="java" contentType="text/html; charset=utf8" pageEncoding="utf8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://onehalf.ru/tags" prefix="t"%>
<t:htmlPageTemplate>
    <jsp:attribute name="title">Create question</jsp:attribute>
    <jsp:body>
        <c:url var="actionUrl" value="spring/createTest.jsp" />
        <form:form commandName="question" action="${actionUrl}" method="post">
            <form:textarea path="" rows="10" cols="20"/>
            <form:input path="" name="name" value=""/>

            <input type="button" value="Добавить вариант" />
            <input type="submit" value="submit"/>
        </form:form>
    </jsp:body>
</t:htmlPageTemplate>