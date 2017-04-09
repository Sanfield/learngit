<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
  <form action="<%=request.getContextPath()%>/servlet/Login.action" method="POST">
	<div>
		<table border="1" align="center" bgcolor="#ff66ff">
		<tr><td align="center" colspan="2">用户登陆</td></tr>
		<tr><td align="center">账号:</td><td><input type="text" name="username"/></td></tr>
		<tr><td align="center">密码:</td><td><input type="password" name="password"></td></tr>
		<tr><td align="center" colspan="2"><input type="submit" value="确认"/>&nbsp;&nbsp;&nbsp;<input type="reset" value="重制"></td></tr>
		<tr><td colspan="2"><font color="red"><%=(request.getAttribute("message")!=null?request.getAttribute("message"):"") %></font></td></tr>
		</table>
	</div>
  </form>
</body>
</html>