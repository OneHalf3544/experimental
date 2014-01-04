<%@ page language="java" contentType="text/html; charset=utf8" pageEncoding="utf8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://onehalf.ru/tags" prefix="t"%>
<t:htmlPageTemplate>
    <jsp:attribute name="title"><spring:message code="testset.selectpage.title"/></jsp:attribute>
    <jsp:body>
        <c:url var="actionUrl" value="/spring/testSetSelect"/>
        <form action="${actionUrl}" method="post">
            <dl class="testSetList">
                <c:forEach var="each" items="${testSetContent}">
                    <dt><label><input type="radio" name="testSetNumber" value="${each.id}"/>${each.name}</label></dt>
                    <dd>${each.description}</dd>
                </c:forEach>
            </dl>
            <spring:message var="submitText" code="testset.selectpage.submittext"/>
            <input type="submit" value="${submitText}"/>
        </form>
    </jsp:body>
</t:htmlPageTemplate>