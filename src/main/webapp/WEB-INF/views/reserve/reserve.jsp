<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="stylesheet" href="/hos/resources/css/reserve.css"/>
<script src="/hos/resources/js/reserve.js"></script>
<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
</head>
<body>

	<button id="insertBtn">예약할래유, 나아퍼유</button>


	<form name="frm" id="frm" method="post">
		<!-- Insert Medal-->
		<div id="insertModal">
			<table>
				<tr>
					<th colspan="2">
					<input type="form-control" type="text" id="hos_id" name="hos_id" value="아나파정형외과" readonly="readonly"></th>
				</tr>
				<tr>
					<th>I&nbsp;&nbsp;&nbsp;&nbsp;D</th>
					<td><input type="form-control" type="text" id="id" name="id"></td>
				</tr>
				<!-- 	<tr>
					<th>이&nbsp;&nbsp;&nbsp;&nbsp;름</th>
					<td><input type="form-control" type="text" id="name"
						name="name" required="required"></td>
				</tr> -->
				<tr>
					<th>진료항목</th>
					<td><input type="form-control" type="text" id="category" name="category" required="required"></td>
				</tr>
				<tr>
					<th>진&nbsp;료&nbsp;일</th>
					<td>
						 <input type="text" id="re_date" name="re_date">
						 <select id="re_time" name="re_time">
						</select> 
					<input type="button" id="time_chk" value="예약가능 시간 확인" />
					</td>
				</tr>
				<tr>
					<th>의사선생님께 전달할 메세지</th>
					<td><textarea id="message" name="message"></textarea></td>
				</tr>
			</table>
			<p>
				<input type="button" id="submitBtn" value="예약하기"/>
				 <input type="button" id="closeBtn" value="닫기"/>
			</p>
		</div>
	</form>
</body>
</html>