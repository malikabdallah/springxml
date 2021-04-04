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

<h1>add todo</h1>
<form>
description : <input type="text" value="description" name="description"/><br/>

<input type="submit" value="envoyer"/>

</form>

<p>envoyer vos todo</p>

</body>
</html>
