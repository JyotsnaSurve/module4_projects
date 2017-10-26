<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>All Employees:</h2>
<c:forEach var="emp" items="${emplist}">

<c:out value="${emp.custId}"/>
<c:out value="${emp.fname}"/>
<c:out value="${emp.lname}"/>
<c:out value="${emp.salary}"/>
<c:out value="${emp.desig}"/><br/>
 Action : <a href="edit.capg?custId=${emp.custId}">EDIT</a> <span>|</span>
			<a href="delete.capg?custId=${emp.custId}">DELETE</a>
			
<c:out value="--------------------------------"/><br/>
</c:forEach>

				
<br/>

</body>
</html>