<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="../css/style.css" rel="stylesheet"/>

</head>
<body>
<c:if test="${c==null }">
	<h2>Employee Id does not exist in database</h2>
</c:if>
<c:if test="${c!=null}">
	<h2>Employee details:::</h2>
	<c:out value="${c}"></c:out>
</c:if><br/>
id:<c:out value="${c.custId}"/><br/>
first name:<c:out value="${c.fname}"/><br/>
last name:<c:out value="${c.lname}"/><br/>
salary:<c:out value="${c.salary}"/><br/>
desig:<c:out value="${c.desig}"/>

</body>
</html>