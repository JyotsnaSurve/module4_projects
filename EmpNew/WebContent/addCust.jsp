<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="submit.obj" method="post" commandName="cust">
<table>
		<tr>
			<td>
				Cust_Name
			</td>
			<td>	
				<form:input path="cName"/>
				<form:errors path="cName"/>
			</td>
		</tr>
		<tr>
			<td>
				Cust_Id
			</td>
			<td>	
				<form:input path="cId"/>
				<form:errors path="cId"/>
				
			</td>
		</tr>
			
		<tr>
			<td>
				Cust_Mob
			</td>
			<td>
				<form:input path="mob"/>
				<form:errors path="mob"/>
			</td>
		</tr>
			
		<tr>
			<td>
				Cust_Email
			</td>
			<td>
				<form:input path="email"/>
				<form:errors path="email"/>
			</td>
		</tr>
		
		<tr>
			<td>
				Cust_Dob
			</td>
			<td>
				<form:input path="dob"/>
				<form:errors path="dob"/>
			</td>
		</tr>
			
		<tr>
			<td>
				<input type="submit" value="submit"/>
			</td>
		</tr>
</table>
</form:form>
</body>
</html>