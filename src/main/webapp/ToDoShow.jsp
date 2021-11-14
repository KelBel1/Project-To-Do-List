<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>To-Do List</title>
         <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script>
$(document).ready(function(){
    $("#deleteEmployee").show();
});
</script>
    </head>
    <body>
All Employees: <br> 
        <c:forEach var="task" items="${results}">
            Task ID: ${task.ttaskID} <br>
            Task Description: ${task.task} <br>
            -------------------------------------<br>
        </c:forEach>
        
        <form action="TaskController" method="POST">

            <select name="id">
                <c:forEach items="${results}" var="task">
                <option value="${task.ttaskID}">${task.ttaskID}</option>
                 </c:forEach>
            </select>

            <button type="submit" id="deleteEmployee" name="deleteEmployee"> Delete </button>
            
        </form>
    </body>
</html>