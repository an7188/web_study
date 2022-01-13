<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>book_list.jsp가 만드는 html 화면입니다.</title>
</head>
<body>
   <form action="book" method="post">
      <input type="hidden" name="cmd" value="del">
      <table border="1">
         <tr>
            <th>책번호</th>
            <th>책제목</th>
            <th>출판사</th>
            <th>가격</th>
            <th>저자</th>
            <th>삭제체크</th>
         </tr>
         <c:forEach items="${bList}" var="book">
            <tr>
               <td>${book.getBookId()}</td>
               <td>${book.getTitle()}</td>
               <td>${book.getPublisher()}</td>
               <td>${book.getPrice()}</td>
               <td>${book.getWriter()}</td>
               <td><input type="checkbox" name="delNum"
                  value="${book.getBookId()}"></td>
            </tr>
         </c:forEach>
      </table>
      <input type="submit" value="삭제해라!!">
   </form>
</body>
</html>