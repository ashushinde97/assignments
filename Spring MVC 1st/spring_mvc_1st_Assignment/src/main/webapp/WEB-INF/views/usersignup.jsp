<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fill form and get Register on our site</title>
</head>
<body>
<div style="magin:0 auto;">
<form:form action="usersbt" modelAttribute="obju">
  <table align="center">
    <tr>
     <td>Enter First Name</td>
     <td><form:input path="firstName" /></td>
    </tr>
   <tr>
     <td>Enter Last Name</td>
     <td><form:input path="lastName" /></td>
    </tr>
     <tr>
     <td>Enter Email</td>
     <td><form:input path="email" /></td>
    </tr>
     <tr>
     <td>Enter password</td>
     <td><form:password path="password" /></td>
    </tr>
    <tr>
     <td>Gender</td>
     <td><form:radiobutton path="gen" value="male" />Male &nbsp; <form:radiobutton path="gen" value="female" /> Female</td>
    </tr>
    <tr>
    <td>City</td>
    <td>
    <form:select path="cityname">
    	<form:option value="Indore" label="Indore" />
    	<form:option value="ujjain" label="UJJAIN" />
    	<form:option value="bhopal" label="bhopal" />
    	<form:option value="pune" label="PUNE" />
    </form:select>
    </td>
    </tr>
    <tr>
    <td colspan="2">
     <label for="terms_condition">
      I Accept terms and condition  <form:checkbox path="terms_condition" value="accept" id="terms_condition" />
     </label>
    </td></tr>
    <tr>
    <td colspan="2"> <input type="submit" value="Signup"></td>
    </tr>
  </table>
  </form:form>
</div>

</body>
</html>