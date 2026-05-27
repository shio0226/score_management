<title>得点管理システム</title>

<%@ page contentType="text/html; charset=UTF-8" %>
<%@include file="../header.html" %>
<%@include file="../koukasokutei/menu.jsp" %>

<h2>ログイン</h2>

<form action="Login.action" method="post">
<p>ID:<input type="text" name="student-id"></p>
<p>パスワード:<input type="text" name="student-password"></p>
<input type="checkbox" name="agree"> パスワードを表示
<p><input type="submit" value="ログイン"></p>
</form>

<%@include file="../footer.html" %>

<!--<title>得点管理システム</title>-->

<!--<%@ page contentType="text/html; charset=UTF-8" %>-->
<!--<%@include file="../header.html" %>-->
<!--<%@include file="../koukasokutei/menu.jsp" %>-->

<!--<h2>ログイン</h2>-->

<!--<form action="Login.action" method="post">-->

<!--<p>-->
<!--ID:-->
<!--<input type="text" name="student-id">-->
<!--</p>-->

<!--<p>-->
<!--パスワード:-->
<!--<input type="password" name="student-password" id="password">-->
<!--</p>-->

<!--<label>-->
<!--    <input type="checkbox" onclick="showPassword()">-->
<!--    パスワードを表示-->
<!--</label>-->

<!--<p>-->
<!--<input type="submit" value="ログイン">-->
<!--</p>-->

<!--</form>-->

<!--<script>-->
<!--function showPassword() {-->
<!--    const pw = document.getElementById("password");-->

<!--    if (pw.type === "password") {-->
<!--        pw.type = "text";-->
<!--    } else {-->
<!--        pw.type = "password";-->
<!--    }-->
<!--}-->
<!--</script>-->

<!--<%@include file="../footer.html" %>-->