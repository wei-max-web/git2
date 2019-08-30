<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" isELIgnored="false"%>
<%@page import="java.util.List"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset="utf-8">
<title></title>
</head>
<body>
<form action="update" method="post">
<input type="hidden" name="id" value="${list1.get(0).id}">
<input name ="name" value="${list1.get(0).name}">
<input name ="sex" value="${list1.get(0).sex}">
<input name ="typeid" value="${list1.get(0).typeid}">
<input type="submit" value="修改">
</body>
</html>