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
<title>공지사항 상세</title>
</head>
<body>
	<table class="table">
		<tbody>
			<tr>
				<th>번호</th>
				<td>${notice.no }</td>
			</tr>
			<tr>
				<th>제목</th>
				<td>${notice.title }</td>
			</tr>
			<tr>
				<th>내용</th>
				<td>${notice.content }</td>
			</tr>
			<tr>
				<th>작성일</th>
				<td>${notice.regdate }</td>
			</tr>
		</tbody>
	</table>
	<a href="${path }/notice/update.do">글 수정하기</a>
	<a href="${path }/notice/delete.do">글 삭제</a>
	<a href="javascript:history.go(-1)">뒤로가기</a>
</body>
</html>