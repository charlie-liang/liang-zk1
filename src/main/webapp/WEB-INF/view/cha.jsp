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
<title>查看</title>
</head>
<body>
       <table>
     <tr>
      <td>编号</td>
      <td>植物名称</td>
      <td>描述</td>
      <td>分类</td>
     </tr>
     <c:forEach items="${list }" var="s">
      <tr>
       <td>${s.id }</td>
       <td>${s.name }</td>
       <td>${s.miao }</td>
       <td>${s.cname }</td>
      </tr>
     </c:forEach>
    </table>
</body>
</html>