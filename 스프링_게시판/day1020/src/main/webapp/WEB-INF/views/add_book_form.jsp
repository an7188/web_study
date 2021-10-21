<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>책 정보 입력 화면</title>
</head>
<body>
	<form action="<%= request.getContextPath() %>/bookAdd" method="post">
		제목:<input type="text" name="title" ><br>
		책번호:<input type="text" name="bookId"> <br>
		출판사:<input type="text" name="publisher"><br>
		저자:<input type="text" name="writer"><br>
		가격:<input type="number" name="price"><br>
		
		<input type="submit" value="제출!!">
	</form>
</body>
</html>