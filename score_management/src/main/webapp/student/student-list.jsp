<%@ page contentType="text/html; charset=UTF-8" %>
<%@include file="../header.html" %>

<h2>学生情報登録</h2>

<form action="<%= request.getContextPath() %>/StudentAddServlet.action" method="post">

<p>
学生番号：
<input type="text" name="student.id" value="" readonly>
</p>

<p>
氏名：
<input type="text" name="student.name">
</p>

<p>
クラス：
<select name="student.course">
    <option value="1">１：システム開発コース</option>
    <option value="2">２：AIシステム・データサイエンスコース</option>
</select>
</p>

<p><input type="submit" value="登録して終了"></p>

</form>

<a href="<%= request.getContextPath() %>/koukasokutei/menu.jsp">戻る</a>

<%@include file="../footer.html" %>

<!-- 2:学生一覧 -->

<!--<%@ page contentType="text/html; charset=UTF-8" %>-->
<!--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>-->

<!--<h2>学生一覧</h2>-->
<!--<table border="1" style="border-collapse:collapse;">-->
<!--<tr>-->
<!--    <th>ID</th>-->
<!--    <th>名前</th>-->
<!--    <th>コース</th>-->
<!--</tr>-->
<!-- listという名前でデータを渡される -->
<!--<c:forEach var="student" items="${list}">-->
<!--<tr>-->
<!--    <td>${student.studentId}</td>-->
<!--    <td>${student.studentName}</td>-->
<!--    <td>${student.courseName}</td>-->
<!--</tr>-->
<!--</c:forEach>-->
<!--</table>-->

<!--<br>-->
<!--<a href="<%= request.getContextPath() %>/koukasokutei/menu.jsp">メニューへ</a>-->