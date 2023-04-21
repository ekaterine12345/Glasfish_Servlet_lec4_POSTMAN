<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet 11</a>

<form method="post" action="<%=request.getContextPath()%>/student-servlet">
    <input type="text" placeholder="first name" name="first_name"/>
    <input type="text" placeholder="last name" name="last_name"/>
    <input type="number" placeholder="age" name="age"/>
    <input type="submit" value="submit">
</form>
</body>
</html>