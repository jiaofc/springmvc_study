<%--
  Created by IntelliJ IDEA.
  User: chengzida
  Date: 2019/4/12
  Time: 下午7:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--引用国际化--%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>国家化</title>
</head>
<body>
<%--通过fmt:message中的key标签，引用国际化资源文件中的value值--%>
<fmt:message key="id"></fmt:message>
<br>
<fmt:message key="name"></fmt:message>
<br>

</body>
</html>
