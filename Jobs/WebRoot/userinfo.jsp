<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8"%>


<!DOCTYPE HTML >
<html>
 <head>
 <title>登陆</title>
 <meta charset="utf-8">

  </head>
  <body>
 <form action="user.html" method="post" name="f">
  用户名:<input type="text" name="uname"><br>
 密码:<input type="password" name="pwd"><br>
 <input type="radio" name="tt" value="个人">个人<input type="radio" name="tt" value="单位">单位 
 <input type="submit" value="登陆">
 </form>
 <a href="userAdd.jsp">新用户注册</a>
  </body>
</html>
