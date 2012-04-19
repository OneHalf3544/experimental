<%@ tag import="java.util.Date" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@attribute name="title" fragment="true" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <c:url var="cssUrl" value="/css/style.css"/>
    <link rel="stylesheet" type="text/css" href="${cssUrl}"/>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title><jsp:invoke fragment="title"/></title>
</head>
<body>
<div id="bodyDiv">
    <div id="mainPane">
        <h1><jsp:invoke fragment="title"/></h1>
        <jsp:doBody/>
    </div>
    <div id="rightColumn">
        <h2>Right column</h2>
    </div>
</div>
</body>
</html>