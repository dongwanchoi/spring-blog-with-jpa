<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<title>회원가입</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>

	<div class="form_cont">
		<form>
		<input type="hidden" id="id" value="${principal.user.id}"/>
			<div class="form-group">
				<label for="username">Username</label> 
				<input type="text" value="${principal.user.username}" class="form-control" placeholder="Enter username" id="username" readonly>
			</div>
			
			<c:if test="${empty principal.user.oauth}">
				<div class="form-group">
					<label for="password">Password</label> 
					<input type="password" class="form-control" placeholder="Enter password" id="password">
				</div>
			</c:if>
			
				<div class="form-group">
					<label for="email">Email</label> 
					<input type="email" value="${principal.user.email}" class="form-control" placeholder="Enter email" id="email" readonly>
				</div>
				
		</form>

		<button id="btn-update" class="btn btn-primary">회원 수정 완료</button>
	</div>
	<script src="/js/user.js"></script>
	<%@ include file="../layout/footer.jsp"%>
</body>
</html>


