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