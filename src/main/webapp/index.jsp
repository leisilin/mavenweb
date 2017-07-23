<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
欢迎进入神秘的Maven世界。<br>
<c:forEach var="i" items="${list }">
    ${i.uuid } ${i.name }  ${i.tele } <br>
</c:forEach>
</body>
</html>
