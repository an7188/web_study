
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index.jsp</title>
</head>
<body>
   <a href="<%=request.getContextPath()%>/bookList">[책목록보기]</a>
   <a href="<%=request.getContextPath()%>/bookAdd">[책추가하기]</a>

<%
   //response.sendRedirect("book?cmd=list");
%>
</body>
</html>