<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign-Up Page</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
<style>
#ctn {
	width: 400px;
	border: 0px solid none;
	position: absolute;
	top: 5px;
	left: 490px;
	border-radius: 3px;
	background-color: white;
	border: 0px solid none;
}

body {
	background-image:
		url(https://images.unsplash.com/photo-1504639725590-34d0984388bd?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTZ8fGNvZGluZ3xlbnwwfHwwfHx8MA%3D%3D);
	background-repeat: no-repeat;
	background-size: cover;
}

.btn {
	margin-top: 20px;
	margin-left: 150px;
}

#head {
	margin-left: 120px;
}
#rg{
margin-left : 500px;
}
.sr{
margin-left : 100px;
font-weight : bold;
color : black;
}
</style>
</head>
<body>
	<div id="ctn">
		<form action="Signup" method="post" id="myForm">
			<h4 id="head">Register Here</h4>

			<div class="form-floating mb-3">
				<input type="text" name="user_name" class="form-control"
					id="floating" placeholder="Name"> <label
					for="floatingInput">Name</label>
			</div>
			<div class="form-floating mb-3">
				<input type="email" name="user_email" class="form-control"
					id="floatingInput" placeholder="name@example.com"> <label
					for="floatingInput">Email address</label>
			</div>
			<div class="form-floating">
				<input type="password" name="user_pwd" class="form-control"
					id="floatingPassword" placeholder="Password"> <label
					for="floatingPassword">Password</label>

			</div>
			<input type="submit" class="btn btn-primary" id="btn">



			<div class="loader"
				style="margin-top: 40px; text-align: center; display: none">
				<div class="spinner-border text-dark" role="status">
					<span class="visually-hidden">Loading...</span>

				</div>
				<h5 id="pw">Please Wait..</h5>
			</div>
		</form>
	</div>
<script>
var form = document.getElementById("myForm");
var ctn = document.getElementById("ctn");
form.addEventListener('submit',(e)=>{
	
	
	var div=document.createElement('div');
	div.innerText = 'Successfully Registered';
	ctn.appendChild(div);
	div.setAttribute('class', 'sr');
})
</script>
</body>
</html>