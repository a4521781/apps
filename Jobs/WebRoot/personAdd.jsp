<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE HTML >
<html>
  <head>

    <title>My JSP 'admin_top.jsp' starting page</title>
    
	<meta >

  </head>
  
  <body>
   <p>=======个人基本资料==========</p>
   <form action="${pageContext.request.contextPath}/personController_list.html" method="post" name="f">
   <input type="hidden" name="pid" value="${person.pid }">
   <input type="hidden" name="pnamejper" value="${person.pnamejper }">
   <input type="hidden" name="pwd" value="${person.pwd }"> 
  <table> 
  <!-- <tr><td>id:<input type="text" name="pid" value="${person.pid }"></td></tr>
  <tr><td>用户名:<input type="text" name="pnamejper" value="${person.pnamejper }"></td></tr>
   <tr><td>密码:<input type="text" name="pwd" value="${person.pwd }"></td></tr>-->
  <tr><td>真实姓名:<input type="text" name="pname" value="${person.pname }"></td></tr>
  <tr><td>身份证号码:<input type="text" name="code" value="${person.code }"></td></tr>
  <tr><td>婚姻状况:
  <select name="marry">
  <option value="${person.marry }" selected="selected">${person.marry }</option>
  <option value="未婚" selected="selected">未婚</option>
  <option value="已婚">已婚</option>
  </select>
  </td></tr>
  <tr><td>民族:<input type="text" name="mzhu" value="${person.mzhu }"></td></tr>
  <tr><td>政治面貌:<input type="text" name="politics" value="${person.politics }"></td></tr>
  <tr><td>职称:<input type="text" name="zchen" value="${person.zchen }"></td></tr>
  <tr><td>生日:<input type="date" name="birthday" value="${person.birthday }"></td></tr>
  <tr><td>学历:
 <select name="edu">
  <option value="${person.edu }" selected="selected">${person.edu }</option>
  <option value="专科">专科</option>
  <option value="大学">大学</option>
  <option value="硕士">硕士</option>
  <option value="博士">博士</option>
  </select>
  </td></tr>
  <tr><td>毕业学校:<input type="text" name="school" value="${person.school }"></td></tr>
  <tr><td>专业:<input type="text" name="major" value="${person.major }"></td></tr>
  <tr><td>精通语言:<input type="text" name="language" value="${person.language }"></td></tr>
  <tr><td>语言级别:<input type="text" name="lanlevel" value="${person.lanlevel }"></td></tr>
  <tr><td>普通话程度:<input type="text" name="mandarin " value="${person.mandarin }"></td></tr>
  <tr><td>计算机能力:<input type="text" name="computer " value="${person.computer }"></td></tr>
  <tr><td>工作年限:<input type="text" name="workyears" value="${person.workyears }"></td></tr>
  <tr><td>工作经历:<input type="text" name="experience" value="${person.experience }"></td></tr>
  <tr><td>职位:<input type="text" name="qjob" value="${person.qjob }"></td></tr>
  <tr><td>工作地点:<input type="text" name="location" value="${person.location }"></td></tr>
  <tr><td>薪水要求:<input type="text" name="salary" value="${person.salary }"></td></tr>
  <tr><td>特长:<input type="text" name="special" value="${person.special }"></td></tr>
  <tr><td>电话:<input type="text" name="pphone" value="${person.pphone }"></td></tr>
  <tr><td>邮箱:<input type="text" name="emailp" value="${person.emailp }"></td></tr>
  <tr><td>点击数:<input type="text" name="pclick" value="${person.pclick }"></td></tr>
  <tr><td>家庭住址:<input type="text" name="paddreess" value="${person.paddreess }"></td></tr>
  <tr><td>登录日期:<input type="date" name="pdate" value="${person.pdate }"></td></tr>
  <tr><td><input type="submit" value="提交"></td></tr>

  </table> 
  
  </form> 
  </body>
</html>
