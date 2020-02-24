<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>明天，你好!</h2>
第一个springmvc：
</br>
<a href="firstController/helloWorld?name=tom&age=14" >helloWorld</a>
<br>
<a href="firstController/zhanweifu/12">占位符的使用</a>
<br>
rest风格：
获取用户信息
<form action="firstController/testGet" method="get">
    <input type="submit" value="GET"/>
</form>
<form method="post" action="firstController/testPost/111">
    <input type="submit" value="POST">
</form>
<form method="post" action="firstController/testDelete/111">
    <input type="hidden" name="_method" value="DELETE"/>
    <input type="submit" value="DELETE">
</form>
<form method="post" action="firstController/testPut/111">
    <input type="hidden" name="_method" value="PUT"/>
    <input type="submit" value="PUT">
</form>
@RequestParam 取得了id和name的参数值
<form method="post" action="firstController/testRequestparam">
    id:<input type ="text" name="id"/>
    name:<input type ="text" name="name"/>
    <input type="submit" value="提交">
    <br>
    使用Pojo对象绑定请求参数值
</form><form method="post" action="firstController/testPojo">
    id:<input type ="text" name="id"/><br>
    name:<input type ="text" name="name"/><br>
    city:<input type ="text" name="address.city"/><br>//引用了对象里的属性
    street:<input type ="text" name="address.street"/><br>
    <input type="submit" value="提交">
</form>
<br>
使用@RequestHeader 获取上送报文头中的信息
<a href="firstController/testRequestHeader">RequestHeader</a>
<br>
<br>
<a href="firstController/testModelAndView">testModelAndView</a>
<br>
<br>
<a href="firstController/testMap">testMap</a>
<br>
<br>
<a href="firstController/testModel">testModel</a>
<br>
<br>
<a href="firstController/testModelMap">testModelMap</a>
<br>
<br>
testModelAttribute:
<br>
<form action="firstController/testModelAttribute">
    <input type="text" name="name" value="Tom">
    <br>
    <input type="text" name="id" value="101">
    <br>
    <input type="submit" value="UPDATE">
</form>

</body>
</html>
