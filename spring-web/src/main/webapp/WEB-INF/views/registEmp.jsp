<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
    
<h2>Welcome, Enter the Employee Details</h2>
<form:form action="addEmployee" method="post" modelAttribute="emp">
<table>

<tr>
<td><form:label path="name">Employee Name</form:label></td>
<td><form:input path="name"/></td>
</tr>

<tr>
<td><form:label path="id">Employee Id</form:label></td>
<td><form:input path="id"/></td>
</tr>


<tr>
<td> <input type="submit" value="Submit"> </td>
</tr>

</table>
</form:form>