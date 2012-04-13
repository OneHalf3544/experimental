<%@ page language="java" contentType="text/html; charset=utf8" pageEncoding="utf8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<yamoney commandName="<c:out value="${commandName}"/>">
    <jsp:include page="requestParams.jsp"/>
    <jsp:include page="${commandName}.jsp"/>
</yamoney>