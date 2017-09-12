<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="../../css/reset.css">
<link rel="stylesheet" type="text/css" href="../../css/style.css">
</head>
<body>
	<!-- 헤더부분 -->
	<jsp:include page="../../inc/header.jsp"/> <!-- 개쩐다 이게바로 집중화구나 -->
	
	<jsp:include page="../inc/visual.jsp"/>
	
	<div id = "body" class="clearfix">
		<div class="content-container clearfix">
			<!-- 어사이드 -->
		<jsp:include page="../inc/aside.jsp"/>
	
			<main id ="main">	
				 <h2>공지사항</h2>
				<div>
					<h3>경로</h3>
					<ol>
						<li><a href="">home</a></li>
						<li><a href="">고객센터</a></li>
						<li><a href="">공지사항</a></li>
					</ol>
				</div>
				
				<form method="post" >
					 <table class="table">
		            <tr>
		               <th>번호</th>
		               <td colspan="3">${d.id}</td>
		           	</tr>
		           	<tr>
		               <th>제목</th>
		               <td colspan="3"><input name="title"/></td>
		            </tr>
			         <tr>
			         	<th>첨부파일</th>
			         	<td colspan="3"></td>
			         </tr>   
			         <tr>
			         	<th>내용</th>
			         	<td colspan="4"><textarea name="content"></textarea></td>
			         </tr>
		         </table>
					
					<div>
		         		<input type="submit" class ="btn btn-default" value="등록"/>
		         		<a class="btn btn-default" href="notice/list">취소</a>
		         	</div>
	         	</form>
	         	
			</main>
		</div> 
	</div>
		
		<jsp:include page="../../inc/footer.jsp"/>
<!-- 푸터부분 -->

</body>
</html>