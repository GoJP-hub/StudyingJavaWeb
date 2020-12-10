<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Note for JSP</title>
</head>
<body>
<h3>テンプレート：JSPのHTML該当部分</h3>
<h5>!Doctype htmlを含め、htmlのタグで囲まれている。その法則に則った記載場所</h5>

<h3>Pageディレクティブ：JSPの設定を記載</h3>
<h5>最初の部分に記載があり、%@page で始まる箇所。プログラミング言語やページの設定を記載</h5>
<h5>Importをする場合も該当する。記載方法が異なり、「import="記載"」となる</h5>

<h3>スクリプトレット：Javaプログラムを記載する場所</h3>
<h5>記載方法は、「% ... %」で囲うこと。</h5>
<h5>例： for(int i = 0...), や String str = "..."など</h5>

<h3>スクリプト式：変数の値や戻り値を出力する</h3>
<h5>記載方法は、「%= ... %」。上記は（メソッド内に記載する）プログラム処理に対し、これは変数や値の簡単処理になる</h5>
<h5>例：str.length、str (内容を出す)、10 + 10</h5>

<h3>JSPコメント：JSP内のコメント</h3>
<h5>記載方法は、「%-- ... --%」で囲うこと。</h5>
</body>
</html>
