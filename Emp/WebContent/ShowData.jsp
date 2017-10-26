<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>show data</title>
</head>
<body>

<c:forEach var="emp" items="${emplist}">

<c:out value="${emp.custId}"/>
<c:out value="${emp.fname}"/>
<c:out value="${emp.lname}"/>
<c:out value="${emp.salary}"/>
<c:out value="${emp.desig}"/><br/>
<c:out value="--------------------------------"/><br/>
</c:forEach>
<a href="all.capg">all employees</a><br/>
<a href="new.capg">add cust</a><br/>
<a href="getById.capg">Get By Id</a>
</body>
</html>