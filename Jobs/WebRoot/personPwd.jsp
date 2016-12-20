<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE HTML >
<html>
  <head>

    <title>pwd</title>
    
	<meta >

  </head>
  
  <body>
   <p>=======修改密码==========</p>
   <form action="${pageContext.request.contextPath}/personController_pwd.html" method="post" name="f">
  <table> 
  <tr><td>用户名:${user }[个人用户]</td></tr>
  <tr><td>原密码:<input type="text" name="pwd1" ></td></tr>
  <tr><td>新密码：<input type="text" name="pwd2" ></td></tr>
  <tr><td>重复新密码:<input type="text" name="pwd3"></td></tr>
   <tr><td><input type="submit" value="OK"></td></tr>
  </table>
  </form> 
  </body>
</html>
