<%--
  Created by IntelliJ IDEA.
  User: 吕少明
  Date: 2019/8/13
  Time: 16:09
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<html>
<head>
    <title>修改图书信息</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    图书管理系统
                </h1>
            </div>
        </div>
    </div>

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改图书信息</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="" name="userForm">
        <input type="hidden" name="bookId" value="${book.bookId}"/>
        书名：<input type="text" name="bookName" value="${book.bookName}"/>
        作者：<input type="text" name="bookAuthor" value="${book.bookAuthor}"/>
        简介：<input type="text" name="bookContent" value="${book.bookContent }"/>
        <input type="button" value="提交" onclick="updateBook()"/>
    </form>
    <script type="text/javascript">
        function updateBook() {
            var form = document.forms[0];
            form.action = "<%=basePath %>book/updateBook";
            form.method = "post";
            form.submit();
        }
    </script>
</div>

