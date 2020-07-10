<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Add New Employee</h1>  
       <form method="post" action="save">    
        <table >    
         <tr>    
          <td>Name : </td>   
          <td><input type="text" name="name" value="${edit_emp.name}"/></td>  
         </tr>    
         <tr>    
          <td>Salary :</td>    
          <td><input type="number" name="salary" value="${edit_emp.salary}"/></td>  
         </tr>   
         <tr>    
          <td>Designation :</td>    
          <td><input type="text" name="designation" value="${edit_emp.designation}"/></td>  
         </tr>   
         <c:if test="${not empty edit_emp}">
         <input type="hidden" name="id" value="${edit_emp.id}">
         </c:if>
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Save" /></td>    
         </tr>    
        </table>    
       </form>
</body>
</html>