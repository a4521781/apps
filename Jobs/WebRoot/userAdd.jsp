<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8"%>


<!DOCTYPE HTML >
<html>
 <head>
 <title>注册</title>
 <meta charset="utf-8">
 <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/easyui/themes/default/easyui.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/easyui/themes/icon.css" />
<script src="${pageContext.request.contextPath}/resources/easyui/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/easyui/jquery.easyui.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/easyui/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript">
$.extend($.fn.validatebox.defaults.rules, {    
    equals: {    
        validator: function(value,param){    
            return value == $(param[0]).val();    
        },    
        message: '两次密码输入不相同'   
    }    
}); 

</script>	
  </head>
  <body>
  
  <h2>##新用户注册##</h2>
  <form form action="success.html" method="post" name="f">
  用户名：<input type="text" name="uname" class="easyui-validatebox" data-options="required:true"><br>
  登陆密码：<input type="password" name="pwd" id="pwd" class="easyui-validatebox" data-options="required:true"><br>
  重复密码:<input type="password" name="pwd1" id="pwd1" class="easyui-validatebox"     
        required="required" validType="equals['#pwd']" ><br>
<input type="radio" name="tt" value="个人" >个人<input type="radio" name="tt" value="单位" checked="checked">单位 
 <input type="submit" value="注册">
  </form>
  </body>
</html>