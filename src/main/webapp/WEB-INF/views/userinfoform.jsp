<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">


    <title></title>
</head>
<body class="container">
<div class="jumbotron">
    <h1>회원가입 페이지</h1>
    <p>테스트중</p>
</div>
<form action="getInsertuserinfo" method="post">
    <input name = "user_id" type="text">
    <input name = "user_pwd" type="password">
    <input name = "user_email" type="email">
    <input name = "user_name" type="name">
    <button type="submit" class="btn btn-primary">전송</button>
</form>

<!-- Optional JavaScript -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</body>
</html>
