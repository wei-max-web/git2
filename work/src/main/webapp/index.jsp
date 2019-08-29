<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<style type="text/css">
td{
width: 100px;
}
</style>
</head>
<body>
<form action="index" method="post">
<input name ="name">
<input type="submit" value="名字查询">
</form>

<table>
<tr><td>id</td><td>name</td><td>sex</td><td>typename</td></tr>
<c:forEach items="${list}" var="x" varStatus="v">
<tr> <td>${v.index}</td><td>${x.name}</td>
<td>${x.sexname}</td><td>${x.typename}</td></tr>
</c:forEach>
</table>
</body>
</html>
