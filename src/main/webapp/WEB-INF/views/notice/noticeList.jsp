<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<c:set var="path" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지사항 목록</title>
</head>
<body>
	<table class="table">
		<thead>
			<tr><th>번호</th><th>제목</th><th>작성자</th></tr>
		</thead>
		<tbody>
			<c:forEach var="notilst" items="${notiList }">
				<tr>
					<td>${notilst.no }</td>
					<td><a href="${path }/notice/detail.do">${notilst.title }</a></td>
					<td>${notilst.author }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="${path }/notice/insert.do">글 등록</a>
	<a href="javascript:history.go(-1)">뒤로가기</a>
</body>
</html>