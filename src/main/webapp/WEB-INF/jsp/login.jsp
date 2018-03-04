
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HelloController</title>
</head>
<body>
<%@ include file="./header.jsp" %>
<h2>::Login::</h2>

<form method="post" action="./handleLogin">
<label>User Name</label> <input type ="text" name="name"/><br>
<label>Password</label>  <input type="password" name="password"/><br>
<input type="submit" value="Login" />
</form>
<br><br><br><br>
<%@ include file="./footer.jsp" %>
</body>
</html>