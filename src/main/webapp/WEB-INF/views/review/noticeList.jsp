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
<title>리뷰 목록</title>
</head>
<body>
	<table class="table">
		<thead>
			<tr><th>번호</th><th>제목</th><th>작성자</th></tr>
		</thead>
		<tbody>
			<c:forEach var="rList" items="${reviewList }">
				<tr>
					<td>${rList.reviewid }</td>
					<td><a href="${path }/">${rList.reviewtitle }</a></td>
					<td>${rList.reviewedat }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<c:if test="${sid.equals('admin') }">
		<a href="${path }">글 등록</a>
	</c:if>
	<a href="javascript:history.go(-1)">뒤로가기</a>
</body>
</html>