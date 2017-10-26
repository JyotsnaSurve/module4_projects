<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit details</title>
</head>
<body>
<form:form action ="update.capg" method="post" commandName="bean"  modelAttribute="bean">
	
	Employee ID : <form:input path="custId" /> <form:errors path="custId"/><br/>
	
	First Name : <form:input path="fname"/> <form:errors path="fname"/><br/>
	
	Last Name : <form:input path="lname"/> <form:errors path="lname"/><br/>
		
	Salary : <form:input path="salary" /><form:errors path="salary"/><br/>
	
	Designation : <form:input path="desig"/> <form:errors path="desig"/><br/>
	
	<input type="submit" value="Update Details"/>

</form:form>
</body>
</html>