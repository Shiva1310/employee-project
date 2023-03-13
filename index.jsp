<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to employee</title>
</head>
<body>
<form action="addUser">
Enter name<input type="text" name="id"><br>
Enter id<input type="text" name="name"><br>
Enter email<input type="email" name="email"><br>
<input type="submit"></form>
<h1>Display user</h1>
<form action="getUser">
Enter name<input type="text" name="id"><br>
Enter email<input type="email" name="email"><br>
<input type="submit"></form>
<h2>enter details to delete</h2>
<form action="deleteUser">
Enter name<input type="text" name="id"><br>
<input type="submit"></form>
<h3>update user</h3>
<form action="updateUser">
Enter name<input type="text" name="id"><br>
<input type="submit"></form>

</body>
</html>