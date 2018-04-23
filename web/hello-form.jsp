<%--
  Created by IntelliJ IDEA.
  User: wilder
  Date: 22/04/18
  Time: 10:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"  %>
<html>
    <head>
        <title>Hello</title>
    </head>
    <body>
        <form action="simple-hello" method="post">
            <label for="surname">Nom: </label>
            <input type="text" id="surname" name = "surname"/>
            <label for="name">Prénom: </label>
            <input type="text" id="name" name="name"/>
            <label for="time">Heure: </label>
            <input type="time" id="time" name="time" />
            <input type="submit" />
        </form>
    </body>
</html>
