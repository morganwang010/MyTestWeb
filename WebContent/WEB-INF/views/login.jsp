<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<jsp:useBean id="loginForm"  class="org.chinavo.test.form.LoginForm" scope="request" />

<h1>Identity Registration</h1>
if you dont have a account, please rigist at <a href="regist">here</a>!
<form:form action="authenticate" modelAttribute="loginForm" method='post'
	accept-charset='UTF-8'>
	<table>
		<tr>
			<td>UserName:</td>
			<td><form:input path="username" /></td>
			<td><form:errors path="username" cssClass="error" /></td>
		</tr>
		<tr>
			<td>Passphrase:</td>
			<td><form:password path="password" /></td>
			<td><form:errors path="password" cssClass="error" /></td>
		</tr>
		<tr>
			<td></td>
			<td><input type='submit' name='Submit' value='Submit' /></td>
		</tr>
	</table>

</form:form>

<style type="text/css">
body {
	background-color: #F8F8F8;
	text-align: left;
	margin: 0;
	padding: 0;
}

.error {
	background-color: #FFF;
	color: red;
	text-align: left;
}
</style>