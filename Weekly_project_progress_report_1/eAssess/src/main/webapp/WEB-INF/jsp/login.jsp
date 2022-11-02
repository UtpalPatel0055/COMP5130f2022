<html>
	<head>
		<title>Login</title>
		<link href="webjars/bootstrap/4.6.0/css/bootstrap.min.css" rel="stylesheet"/>
		<style>
			.login-form{
				width: 400px;
				height: 200px;
				position: absolute;
				top: 50%;
				left: 50%;
				margin-right: -50%;
				transform: translate(-50%, -50%);
			}
		</style>
	
	</head>
	<body>
		<h2>${errormsg}</h2>
		<div class="login-form">
			<div class="container-fluid">
				<form method="post">
					<input type="text" class="form-control mt-3" name="username"/>
					<br/><br/>
					<input type="password" class="form-control mt-3" name="password"/>
					<br/><br/>
					<button type="submit" class="mt-3">Submit</button>
				</form>
			</div>
		</div>
		
		<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
		<script src="webjars/bootstrap/4.6.0/bootstrap.min.js"></script>
	</body>
</html>