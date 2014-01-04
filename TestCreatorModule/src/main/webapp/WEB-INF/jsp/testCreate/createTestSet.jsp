<%@ page language="java" contentType="text/html; charset=utf8" pageEncoding="utf8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://onehalf.ru/tags" prefix="t"%>
<t:htmlPageTemplate>
    <jsp:attribute name="title">Create test set</jsp:attribute>
    <jsp:body>
        <c:url var="actionUrl" value="/spring/create/testset"/>
        <form:form commandName="createdTestSet" action="${actionUrl}" method="post">
            <form:hidden path="testSetId"/>
            <div>
                Название набора: <form:input path="name"/>
            </div>
            <div>
                Описание набора: <form:textarea path="description"/>
            </div>
            <input type="submit" value="Создать" />
        </form:form>
    </jsp:body>
</t:htmlPageTemplate>