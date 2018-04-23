<%--
  Created by IntelliJ IDEA.
  User: wilder
  Date: 22/04/18
  Time: 10:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Hello</title>
    </head>
    <body>
        <form action="/simple-hello" method="post" />
            nom: <input type="text" name = "surname"/>
            prénom: <input type="text" name="name"/>
            heure: <input type="time" name="time" />
            <input type="submit" />
        </form>
    </body>
</html>
