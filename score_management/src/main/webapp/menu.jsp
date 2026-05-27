<!-- 1:メニュー画面 -->

<title>得点管理システム</title>

<%@ page pageEncoding="UTF-8" %>

<h2>メニュー画面</h2>
<hr>

<a href="<%= request.getContextPath() %>/StudentSearchServlet.action">学生管理</a>
<a href="<%= request.getContextPath() %>/StudentAddServlet.action">成績管理</a>
<a href="<%= request.getContextPath() %>/StudentAddServlet.action">成績登録</a>
<a href="<%= request.getContextPath() %>/StudentAddServlet.action">成績参照</a>
<a href="<%= request.getContextPath() %>/StudentListServlet.action">科目管理</a>

