<%--
  Created by IntelliJ IDEA.
  User: chengzida
  Date: 2019/3/10
  Time: 下午9:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>HelloWorld</title>
</head>
<body>
   成功了
    Request name
    <br>
   <span>From request scope name:${requestScope.name }</span>
   <br>
   <br>
   <span>From request scope sex:${requestScope.sex}</span>
   <br>
   <br>
    <span>From request scope age:${requestScope.age}</span>
   <br>
   <br>
   <span>From request scope city:${requestScope.city}</span>
   <br>
   <br>
   <span>From session scope mail:${sessionScope.mail}</span>
   <br>
   <span>From request scope mail:${requestScope.mail}</span><a href="result">session</a>

</body>
</html>
