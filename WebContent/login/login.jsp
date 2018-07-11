<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<!--
        	有时候会遇到一个很诡异的问题：为什么我的IE浏览器都升级到IE9以上了，但是浏览器的文档模式却是IE8
		怎么解决这个问题呢？
		这句话可以保证让IE的文档模式永远都是最新的
        -->
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<!--
        	width=device-width ： 网页宽度等于设备宽度
		initial-scale=1.0 ： 初始缩放比例为1.0 。网页初始页面的大小占整个面积的100%
		maximum-scale=1.0 ： 最大缩放比例为1.0 ，
		user-scalable ： 用户是否可以手动缩放
        -->
    	<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
		<title></title>
		<link rel="stylesheet" href="css/font-awesome.min.css" />
		<!-- jQuery -->
    		<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    		<script src="js/jquery.backstretch.js"></script>
		<!--加载ie浏览器的兼容性文件 因为IE9，IE6、7、8不支持媒体查询，所以必须加载以下文件
        -->
		<!--[if lt IE 9]>
	      <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
	      <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
	    <![endif]-->
	    
	    <!-- 连接css与js -->
	    <link rel="stylesheet" href="css/login.css" />
	    <link href="js/login.js"   type="text/javascript" rel="stylesheet"/>

	</head>
	<body>
		
	<div class="container">
		<div class="user-login">
			<h1>Login</h1>
			<form class="login">
					<p>Username / Email</p>
					<li class="base">
						<input type="text" value=""><i class="fa fa-user"></i>
					</li>
					<p>Password</p>
					<li>
						<input type="password" value=""><i class="fa fa-lock"></i>
					</li>

					<div class="submit-login">
						<input type="submit" value="Log In" > 
					</div>
			</form>
		</div>
	</div>


	</body>
</html>
