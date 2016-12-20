<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'right.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/easyui/themes/default/easyui.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/easyui/themes/icon.css" />
<script src="${pageContext.request.contextPath}/resources/easyui/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/easyui/jquery.easyui.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/easyui/locale/easyui-lang-zh_CN.js"></script>
  </head>
  
  <body>
   <h3>亲爱的用户:您好！<br>
        请注意关注我的邮箱查阅，以便及时回复信息。</h3>   
   <p>最新的招聘信息</p>
    <div style="margin: 10px 30px">
  
  
  <div id="searchCarForm" style="padding: 10px">
  <div style="margin-bottom: 10px">
	      <a class="easyui-linkbutton" plain="true" 
          iconCls="icon-add" onclick="person_obj.showEdit('add')">发信</a>
        <a class="easyui-linkbutton" plain="true"
          iconCls="icon-edit" onclick="person_obj.showEdit('modify')">收藏</a>
	    </div>
      <div id="edit"></div> 
  <div style="padding:0 0 0 6px" >
  <input  class="easyui-textbox" id="name" size="6">
  <input  class="easyui-datebox" id="beginDate" size="10">
  <input  class="easyui-datebox" id="endDate" size="10">
  <a class="easyui-linkbutton" iconCls="icon-search"
     onclick="person_obj.search()">查询</a>
  </div>  
  </div>
  
  <div style="margin-top: 10px ">  
  <table id="personDataGrid">
  
  </table>
  </div>
 </div>
  <script type="text/javascript">
	 $(function(){
	   person_obj = {
		 search : function(){
			 $("#personDataGrid").datagrid('load',{
				 name : $.trim($("#name").val()),
				 beginDate : $("#beginDate").datebox('getValue'),
				 endDate : $("#endDate").datebox('getValue'),
				  });
			  },
			   showEdit : function(state){
				  var url = "";
				  var info = "";
				  if(state == 'add'){
				  info = "发信";
				   var rows = $('#personDataGrid').datagrid("getSelections");
				    if(rows.length == 1){ 
					  url = "aaa?id="+rows[0].jid;
					  }else{
						  $.messager.alert("警告", "必须只选中一行", "warning");
						  return ;
		     	  }				  
					  
				  }
				  if(state == 'modify'){
					  info = "收藏collect";
					  var rows = $('#personDataGrid').datagrid("getSelections");
					  if(rows.length == 1) {
						  url = "bbb?id="+rows[0].companyjob.cid;
					  }else{
						  $.messager.alert("警告", "必须只选中一行", "warning");
						  return ;
		     	  }				  
			  }
			    $("#edit").window({
					  title : info,
					  width : 600,
					  height: 540,
					  modal : true,
			      minimizable : false,
			      href : url,
			      onClose : function(){
			    	  $("#personDataGrid").datagrid('reload');
			      }
				  });
			  }
		  } 		  
	   $("#personDataGrid").datagrid({
	    url : "PersonController_list.html",
        title : '招聘职位信息表',
        fitColumns : true, 
        striped : true,    
        rownumbers : true, 
        columns:[[{ 
          field : 'jid',  // field 名必需与json中的名一致
          title : '编号',
          width : 50,
          checkbox : true,
          sortable : true
        }, {
          field : 'jname',
          title : '职位',
          width : 100,
          sortable : true,
        }, {
         field : 'companyjob',
         title : '招聘单位',
         width : 200,
         sortable : true,
       }, {
         field : 'jdate',
         title : '发布日期',
         width : 100,
         sortable : true,
       }]],
       toolbar : "#searchCarForm",
       pagination : true, 
       pageSize : 5,
       pageList : [5, 10, 15, 20, 50 ],
       sortName : "jid", 
       sortOrder : "asc", 
		  });
	  });
	  
	</script>
  
  </body>
</html>
