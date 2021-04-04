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
bonjour ${name} ton mdp est ${mdp}<br/>
voici vos todo ${liste} <br/>
<a class="button" href="http://localhost:8080/springmvcpremier/add">ADD a todo</a>
</body>
</html>
