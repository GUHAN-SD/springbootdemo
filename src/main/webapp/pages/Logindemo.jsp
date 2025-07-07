<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>

<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f2f2f2;
        margin: 0;
        padding: 0;
    }

    .outerDiv {
        width: 350px;
        margin: 100px auto;
        padding: 30px;
        background-color: #ffffff;
        border-radius: 8px;
        box-shadow: 0 0 10px rgba(0,0,0,0.1);
    }

    .tit h2 {
        text-align: center;
        margin-bottom: 20px;
        color: #333;
    }

    .inner1 label {
        font-weight: bold;
        color: #555;
    }

    .inner1 input[type="text"],
    .inner1 input[type="password"] {
        width: 100%;
        padding: 10px;
        margin-top: 5px;
        margin-bottom: 15px;
        border: 1px solid #ccc;
        border-radius: 4px;
        box-sizing: border-box;
    }

    .inner2 {
        text-align: center;
    }

    .inner-button {
        background-color: #4CAF50;
        color: white;
        padding: 10px 20px;
        border: none;
        border-radius: 4px;
        cursor: pointer;
        font-size: 16px;
    }

    .inner-button:hover {
        background-color: #45a049;
    }
</style>

</head>
<body>
<div class="outerDiv">
    <div class="tit">
        <h2>Login Page</h2>
    </div>
    <form action="index" method="get">
        <div class="inner1">
            <label for="uname">User Name</label><br/>
            <input type="text" id="uname" name="uname" required><br/>

            <label for="password">Password</label><br/>
            <input type="password" id="password" name="password" required><br/>
        </div>
        <div class="inner2">
            <input type="submit" id="login" value="Login" class="inner-button">
        </div>
    </form>
</div>
</body>
</html>
