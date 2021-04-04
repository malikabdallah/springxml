<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ page session="false"%>
<html>
<head>
    <title>Home</title>
</head>
<body>
<h1>Hello world!</h1>

<P>The time on the server is ${serverTime}.</p>

${liste}


<a href="/springmvcpremier/add">add a todo </a>
</body>
</html>
