<%@ page language="java" contentType="text/html; charset=utf8" pageEncoding="utf8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://onehalf.ru/tags" prefix="t"%>
<t:htmlPageTemplate>
    <jsp:attribute name="title">Create question</jsp:attribute>
    <jsp:body>
        <c:url var="actionUrl" value="/spring/create/question" />
        <form:form commandName="createdQuestion" action="${actionUrl}" method="post">
            <form:hidden path="testSetNo"/>
            <form:hidden path="testNumber"/>
            <form:textarea path="question" rows="7" cols="60"/><form:errors path="question"/>
            <ul>
                <li><form:input path="variant0" /><form:errors path="variant0"/></li>
                <li><form:input path="variant1" /><form:errors path="variant1"/></li>
                <li><form:input path="variant2" /><form:errors path="variant2"/></li>
                <li><form:input path="variant3" /><form:errors path="variant3"/></li>
                <li><form:input path="variant4" /><form:errors path="variant4"/></li>
            </ul>
            <form:input path="rightVariant"/><form:errors path="rightVariant"/>
            
            <input type="submit" value="submit"/>
        </form:form>
    </jsp:body>
</t:htmlPageTemplate>