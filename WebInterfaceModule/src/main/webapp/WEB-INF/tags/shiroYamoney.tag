<%@ tag import="java.util.Date" %>
<%@ page language="java" contentType="text/xml; charset=utf8" pageEncoding="utf8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<yamoney time="<%= new Date() %>" commandName="<%= request.getParameter("commandName")%>">
    <jsp:include page="../jsp/shiro/requestParams.jsp"/>
    <response>
        <jsp:doBody/>
    </response>
</yamoney>