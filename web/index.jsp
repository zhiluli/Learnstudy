<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title></title>
  <link rel="stylesheet" type="text/css" href="css/denglu.css">
  <script src="../static/js/5.js"></script>

</head>
<body>

<div class="top-1">
  <form action="util/user" method="post">
    <img src="img/dl4.jpg" >
    <p>
      <span>用户登录</span>
      <a href="zhucu.html">注册账号</a>
    </p>

    <input type="text" name="uname" placeholder="&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;邮箱/手机/用户名" class="inp"><br>

    <input type="password"  name="upwd" placeholder="&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;密码" class="inp"><br>
    <input name="sex" type="radio" id="d3">
    <a id="d3-1">自动登录</a>
    <span id="d4">忘记密码？</span>

    <input type="submit" class="login_sub" value="登录" id="d5" class="inp" />
  </form>
  <a>选择其它登录方式</a>
  <img src="img/l_1.png" alt="">
  <img src="img/l_4.png" alt="">
</div>
</body>
<script type="text/javascript">
    function zhuce(){
        window.location.href="zhucu.html"
    }

</script>
</html>

