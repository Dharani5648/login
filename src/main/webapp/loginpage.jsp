<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> Login </title>
<style>
        body {
            font-family: Arial, sans-serif;
            background-image: url('background.jpg');
             backdrop-filter: blur(2px);
            background-size: cover;
            background-position: center;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        form {
            width: 400px;
            height: 370px;
            margin-top:30px;
            background: transparent;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.4);
        }

        h1 {
            text-align: center;
            font-size:40px;
            color: black;
        }

        label {
            display: block;
            margin: 10px 0 5px;
            font-size: 17px;
            font-weight: bold;
        }

        input {
            width: 100%;
            padding: 10px;
            margin: 5px 0 15px;
            margin-bottom: 25px;
            box-sizing: border-box;
            border: 1px solid #ccc;
            border-radius: 4px;
           }

         button  {
            background-color: #4d99b0;
            color: black;
            cursor: pointer;
            font-size: 17px;
            font-weight: bold;
            margin-top: 20px;
        }

        button :hover {
            background-color: #4d99b0;
        }
       
    </style>

</head>
<body>
 <form action="LoginServlet" method="post">
        <h1>Login</h1>
        <label>Username</label><input type="text" name="username" required><br>
        <label>Password</label><input type="password" name="password" required><br>
        <button type="submit">Login</button>
    </form>
      

</body>
</html>