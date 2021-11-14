<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
       
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>To-Do List</title>
    </head>
    <body>
        <div id="add">
        <h1> Add Tasks </h1>
        <form action="TaskController" method="GET">
            <table>
                <tr>
                    <td> Enter Task ID: </td>
                    <td><input type="text" name="ttaskID"></td>
                </tr>
                <tr>
                    <td> Describe the Task: </td>
                    <td><input type="text" name="task"></td>
                </tr>
                <tr>
                    <td><input type="submit" name="addTask" value="Add"></td>
                    
                </tr>
            </table>
        </form>
        </div>
        <form action="TaskController" method="POST">
            <input type="submit" name="showTask" value="Show"> &nbsp; &nbsp;<br>
            
            
        </form>
    </body>
</html>