<%@ page language="java" contentType="text/html; charset=utf8" pageEncoding="utf8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://onehalf.ru/tags" prefix="t"%>
<t:htmlPageTemplate>
    <jsp:attribute name="title">Answer page</jsp:attribute>
    <jsp:body>
        <p>Выбранный вариант: ${answer.variant}</p>
    </jsp:body>
</t:htmlPageTemplate>