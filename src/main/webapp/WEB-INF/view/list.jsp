<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%
       String path = request.getContextPath();
       pageContext.setAttribute("path", path);
    
    %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib uri="http://www.springframework.org/tags/form"  prefix="fx"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="<%=request.getContextPath()%>/css/css.css" rel="stylesheet">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.8.2.min.js"></script>
<title>管理页面</title>
</head>
<body>
<form action="selects" method="post">
 名称:<input type="text" name="name"><input type="submit" value="搜索">
</form>
    <table>
     <tr>
      <td>
      <input type="button" value="全选" onclick="qx()">
      </td>
      <td>编号</td>
      <td>植物名称</td>
      <td>描述</td>
      <td>分类</td>
      <td>编辑</td>
     </tr>
     <c:forEach items="${selects }" var="s">
      <tr>
       <td>
        <input type="checkbox" name="ck" value="${s.id }">
       </td>
       <td>${s.id }</td>
       <td>${s.name }</td>
       <td>${s.miao }</td>
       <td>${s.cname }</td>
       <td>
        <input type="button" value="查看" onclick="cha(${s.id})">
        <input type="button" value="删除" onclick="del(${s.id})">
        <input type="button" value="修改" onclick="update(${s.id})">
       </td>
      </tr>
     </c:forEach>
     <tr>
     <td>
     <input type="button" value="批量删除" onclick="pl()">
     <input type="button" value="增加" onclick="add()">
     </td>
      <td colspan="8">${page }</td>
     </tr>
    </table>
</body>
<script type="text/javascript">
 function qx(){
	 $("[name='ck']").prop("checked",true);
 }
 function cha(id){
	 location.href="cha?id="+id;
 }
 function del(id){
	 $.post("del",{id:id},function(obj){
		 if(obj){
			 alert("删除成功");
			 history.go(0);
		 }else{
			 alert("删除失败");
			 return ;
		 }
	 },"json")
 }
 function pl(){
	 var ids="";
	 $("[name='ck']:checked").each(function(){
		 ids+=","+$(this).val();
	 })
	 ids=ids.substring(1);
	var b =  confirm("您确定要删除吗");
	if(b){
		del(ids);
	}
	 
 }
 function add(){
	 location.href="add";
 }
 function update(){
	 location.href="update";
 }
</script>
</html>