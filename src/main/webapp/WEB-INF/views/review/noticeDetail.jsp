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
<title>리뷰 상세</title>
</head>
<body>
	<table class="table">
		<tbody>
			<tr>
				<th>번호</th>
				<td>${review.reviewid }</td>
			</tr>
			<tr>
				<th>제목</th>
				<td>${review.reviewtitle }</td>
			</tr>
			<tr>
				<th>내용</th>
				<td>${review.reviewcontent}</td>
			</tr>
			<tr>
				<th>작성일</th>
				<td>${review.reviewedat }</td>
			</tr>
		</tbody>
	</table>
	<a href="${path }/">글 수정하기</a>
	<a href="${path }/">글 삭제</a>
	<a href="javascript:history.go(-1)">뒤로가기</a>
</body>
</html>