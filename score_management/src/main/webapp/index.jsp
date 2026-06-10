<%@ page contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>得点管理システム</title>

<link rel="stylesheet" href="../css/style.css">

</head>
<body>

<div class="wrapper">

    <!-- ヘッダー -->
    <div class="header">
        <h1>得点管理システム</h1>

        <div class="user">
            ${user.name}　
            <a href="../Logout.action">ログアウト</a>
        </div>
    </div>

    <!-- メイン -->
    <div class="main">

        <!-- 左メニュー -->
        <div class="sidebar">

            <a href="../main/Menu.action">メニュー</a>

            <p>学生管理</p>
            <a href="../student/StudentList.action">学生管理</a>

            <p>成績管理</p>
            <a href="../score/TestRegist.action">成績登録</a>
            <a href="../score/TestList.action">成績参照</a>

            <p>科目管理</p>
            <a href="../subject/SubjectList.action">科目管理</a>

        </div>

        <!-- コンテンツ領域 -->
        <div class="content">

            <div class="page-title">
                ${pageTitle}
            </div>

            <!-- 各画面の内容を表示 -->
            <jsp:include page="${contentPage}" />

        </div>

    </div>

    <!-- フッター -->
    <div class="footer">
        © 2026 TIC<br>
        大原学園
    </div>

</div>

</body>
</html>