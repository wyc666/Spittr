<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="t"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<%@ page session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">

<head>
	<meta charset="utf-8">
	<meta name="viewport"
		content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<meta name="description" content="Spittr">
	<meta name="author" content="wyc">

	<title>SpittrII</title>

	<!-- Bootstrap core CSS -->
	<link href= "<s:url value= "/vendor/bootstrap/css/bootstrap.min.css"/>" rel="stylesheet">

	<!-- Custom fonts for this template -->
	<link href="<s:url value="/vendor/fontawesome-free/css/all.min.css"/>" rel="stylesheet"
		type="text/css">
<!-- 	<link href="//netdna.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet"> -->
	<link href="https://fonts.googleapis.com/css?family=Montserrat:400,700"
		rel="stylesheet" type="text/css">
	<link href='https://fonts.googleapis.com/css?family=Kaushan+Script'
		rel='stylesheet' type='text/css'>
	<link
		href='https://fonts.googleapis.com/css?family=Droid+Serif:400,700,400italic,700italic'
		rel='stylesheet' type='text/css'>
	<link
		ref='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700'
		rel='stylesheet' type='text/css'>

	<!-- Custom styles for this template -->
	<link href="<s:url value="/css/agency.css"/>" rel="stylesheet">

</head>

<body id="page-top">
	<div id="header">
		<t:insertAttribute name="header" />
	</div>
	<div id="content">
		<t:insertAttribute name="body" />
	</div>
	<div id="footer">
		<t:insertAttribute name="footer" />
	</div>
	<!-- Bootstrap core JavaScript -->
	<script src=" <s:url value="/vendor/jquery/jquery.min.js"/>"></script>
	<script src=" <s:url value="/vendor/bootstrap/js/bootstrap.bundle.min.js"/>"></script>

	<!-- Plugin JavaScript -->
	<script src=" <s:url value="/vendor/jquery-easing/jquery.easing.min.js"/>"></script>

	<!-- Contact form JavaScript -->
	<script src="<s:url value="/js/jqBootstrapValidation.js"/>"></script>
	<script src="<s:url value="/js/contact_me.js"/>"></script>

	<!-- Custom scripts for this template -->
	<script src="<s:url value="/js/agency.min.js"/>"></script>
	
</body>
</html>

