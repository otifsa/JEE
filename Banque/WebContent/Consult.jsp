
<%@page import="Beans.Compte"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-15"
    pageEncoding="ISO-8859-15"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-15">
<title>consultation de compte</title>
</head>
	<body>
	<% Compte compte=(Compte)session.getAttribute("compte");
	   
	%>
	<%= compte.getId_compte()%>
	<%= compte.getSolde()%>
	
	</body>
</html>