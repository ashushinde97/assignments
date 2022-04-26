<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<div>
		<form action="itemSubmit">
			<table>
			<tr><h1> Store Manager <h1></tr>
				<tr>
					<td>Enter item name</td>
					<td><input type="text" name="itm"></td>
				</tr>
				<tr>
					<td>Enter item price</td>
					<td><input type="text" name="price"></td>
				</tr>
				<tr>
					<td>Enter item quantity</td>
					<td><input type="text" name="qt"></td>
				</tr>
				<tr>
					<td>Enter item discount</td>
					<td><input type="text" name="dis"></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="submit"></td>
				</tr>
			</table>
		</form>
	</div>
	
	
	
	
</body>
</html>