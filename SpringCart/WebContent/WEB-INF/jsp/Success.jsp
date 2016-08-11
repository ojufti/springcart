<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.bitwise.cart.LoginBeans" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Insert title here</title>
</head>
<body>
<h2>${msg}</h2><br><br><br>
<center>
<form:form method="post" commandName="SuccesBeans"  >
<table>
<tr><td colspan="2">list of  items avaliable</td>
</tr>
<tr>
<td>
<select name="itemList" >
<option value="tv">tv</option>
<option value="pen">pen</option>
<option value="pencil">pencil</option>
<option value="toygun">toygun</option>
<option value="candle">candle</option></select>
</td></tr>

<tr><td colspan="2"><input type="submit" value="view details" ></td></tr>
</table></form:form></center>
</body>
</html>