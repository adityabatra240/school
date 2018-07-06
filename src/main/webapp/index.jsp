<html>

<head>
<meta charset="ISO-8859-1">
<style>
img {
	position: absolute;
	left: 0px;
	top: 0px;
	z-index: -1;
	width: 50%;
	height: 50%;
}
</style>
<title>School website</title>
</head>

<body>
	<img src="download.jpg" alt="download"> Username:
	<input type="text" name="username" id="username" value="">
	password:
	<input type="password" name="password" id="password" value="">
	<input type="button" id="submit" value="submit" onclick="onClick()";>
	</br>
	</br>
	<input type="button" id="about us" value="about us"
		onclick="window.open('http://localhost:8080/school/aboutus.html');">

	<input type="button" id="Contact us" value="Contact us"
		onclick="window.open('http://localhost:8080/school/Contactus.html');">

	<input type="button" id="Register" value="Register"
		onclick="window.open('http://localhost:8080/school/Register.html');">
	</br>
	</br>

	<script type="text/javascript">
		function onClick()

		{
			var username = document.getElementById("username").value;
			var password = document.getElementById("password").value;
			alert("abc");
			
				var url="webapi/Credentials/"+username+"/"+password;
			alert(url);
			window.location.href = url;

			if (username == "" || password == "") 
			{

				alert("wrong password entered, please try again");
				document.getElementById("username").value = "";
				document.getElementById("password").value = "";
			}
		}
	</script>
</body>
</html>
