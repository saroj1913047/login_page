<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html lang="en" >
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <link rel="stylesheet" href="assets/css/style.css">

</head>
<body>
<div id="bg"></div>

<form action="login" method="post">
    <div class="form-field">
        <input type="text" name="username" placeholder="Username" required/>
    </div>

    <div class="form-field">
        <input type="password" name="password" placeholder="Password" required/>
    </div>

    <div class="form-field">
        <button class="btn" type="submit">Log in</button>
    </div>
</form>

</body>
</html>