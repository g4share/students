<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Spring4 MVC - Students</title>
  </head>
  <body>
    <table border="1">
      <tr>
        <th>Id</th>
        <th>Firstname</th>
        <th>Lastname</th>
      </tr>
      <c:forEach items="${students}" var="student">
      <tr>
        <td><c:out value="${student.id}"/></td>
        <td><c:out value="${student.firstName}"/></td>
        <td><c:out value="${student.lastName}"/></td>
      </tr>
    </c:forEach>
    </table>
  </body>
</html>