<%@ page language="java" contentType="text/html; charset=utf8" pageEncoding="utf8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib tagdir="/WEB-INF/tags/" prefix="t"%>
<t:htmlPageTemplate>
    <jsp:attribute name="title">Testing page</jsp:attribute>
    <jsp:body>
        <h2>${question.question}</h2>
        <c:url var="actionUrl" value="/spring/testAnswer"/>
        <form action="${actionUrl}" method="post">
            <input type="hidden" name="testSet" value="${testSet}"/>
            <input type="hidden" name="testNumber" value="${testNumber}"/>
            <ol>
                <c:forEach var="each" items="${question.variants}">
                    <li><label>
                        <input type="radio" name="variant" value="${each.id}"/>
                        <span class="variantText">${each.text}</span>
                    </label></li>
                </c:forEach>
            </ol>
            <input type="submit" value="send" />
        </form>
    </jsp:body>
</t:htmlPageTemplate>