<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri = "http://java.sun.com/jsp/jstl/functions"%>
<%@ page import="java.util.*, java.lang.*" %>
<%@ page import="java.text.*, java.net.InetAddress" %>
<c:set var="path1" value="${pageContext.request.contextPath }" />

<header class="d-flex flex-wrap align-items-center justify-content-center justify-content-md-between py-3 mb-4 border-bottom">
	<a href="/" class="d-flex align-items-center col-md-3 mb-2 mb-md-0 text-dark text-decoration-none">
		<svg class="bi me-2" width="40" height="32" role="img" aria-label="Bootstrap"><use xlink:href="#bootstrap"></use></svg>
	</a>

	<ul class="nav col-12 col-md-auto mb-2 justify-content-center mb-md-0">
		<li><a href="#" class="nav-link px-2 link-secondary">Home</a></li>
		<li><a href="#" class="nav-link px-2 link-dark">Features</a></li>
		<li><a href="#" class="nav-link px-2 link-dark">Pricing</a></li>
		<li><a href="#" class="nav-link px-2 link-dark">FAQs</a></li>
		<li><a href="#" class="nav-link px-2 link-dark">About</a></li>
	</ul>

	<ul class="col-md-3 text-end">
		<li class="btn btn-outline-primary me-2" href="${path1 }/member/loginForm.do">Login</li>
		<li type="button" class="btn btn-primary">Sign-up</li>
	</ul>
</header>