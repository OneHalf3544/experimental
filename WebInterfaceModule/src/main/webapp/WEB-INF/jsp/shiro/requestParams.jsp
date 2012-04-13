<%@ page language="java" contentType="text/html; charset=utf8" pageEncoding="utf8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<request>
    <c:forEach var="entry" items="${param.entrySet}">
        <param name="${entry.key}"/>${entry.value}</param>
    </c:forEach>
</request>