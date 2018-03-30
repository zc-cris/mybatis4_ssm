<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>员工列表</title>
</head>
<body>
	
	<table border="1" align="center" cellpadding="10" cellspacing="0">
		<tr>
			<td>编号</td>
			<td>姓名</td>
			<td>邮箱</td>
			<td>性别</td>
		</tr>
		<c:forEach items="${emps}" var="emp">
			<tr>
				<td>${emp.id}</td>
				<td>${emp.name}</td>
				<td>${emp.email}</td>
				<td>${emp.gender}</td>
			</tr>
		</c:forEach>
	</table>
	
</body>
</html>