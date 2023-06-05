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
<title>공지사항 수정</title>
</head>
<body>
	<form action="insert.do" method="post">
		<table class="table">
			<tbody>
				<tr>
					<th>제목</th>
					<td><input type="text" name="title" id="title" value="${notice.title }"></td>
				</tr>
				<tr>
					<th>내용</th>
					<td><textarea cols="100" rows="8" id="content" name="content">
							${notice.content }
						</textarea>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="글 수정">
					</td>
				</tr>
			</tbody>
		</table>
	</form>
	<a href="${path }/notice/list.do">목록으로</a>
</body>
</html>