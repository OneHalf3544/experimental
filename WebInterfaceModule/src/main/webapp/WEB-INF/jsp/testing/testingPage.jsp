<%@ page language="java" contentType="text/html; charset=utf8" pageEncoding="utf8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>Testing page</title>
    </head>
    <body>
        <h1>Testing page</h1>

        <p>Test set #${testSet}</p>
        <p>Test number #${testNumber}</p>

        <h2>${question.question}</h2>
        <c:url var="actionUrl" value="/spring/testAnswer"/>
        <form action="${actionUrl}" method="post">
            <input type="hidden" name="testSet" value="${testSet}"/>
            <input type="hidden" name="testNumber" value="${testNumber}"/>
            <ol>
                <% int count = 0; %>
                <c:forEach var="each" items="${question.variants}">
                    <li><label>
                        <input type="radio" name="variant" value="<%= count++ %>"/>
                        <span class="variantText">${each.text}</span>
                    </label></li>
                </c:forEach>
            </ol>
            <input type="submit" value="send" />
        </form>
    </body>
</html>