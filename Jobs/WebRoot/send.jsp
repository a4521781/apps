<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE HTML >
<html>
  <head>

    <title>pwd</title>
    
	<meta >

  </head>
  
  <body>
   <p>=======发送站内信件==========</p>
   <form action="" method="post" name="f" id="form">
 <input type="hidden" name="companyjob" value="">
 <input type="hidden" name="person" value="">
  <table> 
  <tr><td>收信单位:${companyjob.cname }</td></tr>
  <tr><td>发件人姓名:<input type="text" name="sendname" ></td></tr>
  <tr><td>邮件标题：<input type="text" name="title" ></td></tr>
  <tr><td>正文:<br>
  <textarea name="mailtext" rows="6" cols="12"></textarea>  
</td></tr>
 <tr><td>邮件日期：<input type="date" name="sdate" ></td></tr>
 <tr><td>是否是新邮件:<input type="radio" value="1" name="newmail">是
   <input type="radio" value="2" name="newmail">否 </td></tr>
   <tr><td><input type="submit" value="OK"></td></tr>
  </table>
  </form> 
  
  <script type="text/javascript">
  $("#form").form({
  url:"ccc",
  success:function(data){
  if(data){
    $.messager.show({
    title : '提示',
    msg : '发送'+data+'成功'
    });
    $("#edit").window('close',true);
   }
  }
  
  });
  </script>
  
  
  </body>
</html>
