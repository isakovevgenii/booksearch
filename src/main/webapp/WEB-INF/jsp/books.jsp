<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>


<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Книги</title>
</head>
<body>
<div>
    <table>
        <thead>
        <th>ID</th>
        <th>Name</th>
        </thead>
        <c:forEach items="${allBooks}" var="book">
          <tr>
            <td>${book.id}</td>
            <td>${book.name}</td>
          </tr>
        </c:forEach>
      </table>
      <a href="/">Главная</a>
</div>
</body>
</html>