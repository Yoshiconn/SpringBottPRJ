<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<%
    String notice_seq = (String)request.getAttribute("Notice_seq");
%>
<html>
<head>
    <meta charset="utf-8">
    <title>웹페이지 제목</title>
</head>
<body>
    <h2>글 수정 페이지</h2>
    <form action="DoNoticeUpdate">
        <div>제목</div>
        <div><input name = "title"></div>
        <div>내용</div>
        <div><textarea  name = "contents"></textarea></div>
        <div><input name="notice_seq" hidden="hidden" value="<%=notice_seq%>"></div> <!--hidden은 값을 숨겨준다는 뜻-->
        <div><input type="submit">업데이트</div>
    </form>
</body>
</html>                