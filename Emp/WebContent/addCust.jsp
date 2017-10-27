<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>enter details</title>
<link href="../css/style.css" rel="stylesheet"/>

</head>
<body>
Enter details:
<form:form action="add.capg" method="post" commandName="cust">
<table align="center" border=5px>
		<tr>
			<td>
				Customer id<span style="color:red;">*</span>
			</td>
			<td style="color: red;">	
				<form:input path="custId"/>
				<form:errors path="custId"/>
				
			</td>
		</tr>
			
		<tr>
			<td>
				first name<span style="color:red;">*</span>
			</td>
			<td style="color: red;">	
				<form:input path="fname"/>
				<form:errors path="fname"/>
			</td>
		</tr>
		
		<tr>
			<td>
				last name<span style="color:red;">*</span>
			</td>
			<td style="color: red;">	
				<form:input path="lname"/>
				<form:errors path="lname"/>
			</td>
		</tr>
		<tr>
			<td>
				Salary<span style="color:red;">*</span>
			</td>
			<td style="color: red;">
				<form:input path="salary"/>
				<form:errors path="salary"/>
			</td>
		</tr>
			
		<tr>
			<td>
				Designation<span style="color:red;">*</span>
			</td>
			<td style="color: red;">
				<form:input path="desig"/>
				<form:errors path="desig"/>
			</td>
		</tr>
		
		<tr>
			<td colspan=2 align="center">
				<input class="btn" type="submit" value="submit"/>
			</td>
		</tr>
</table>
</form:form>
</body>
</html>