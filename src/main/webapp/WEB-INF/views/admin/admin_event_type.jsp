<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<link rel="stylesheet" href="/hos/resources/css/admin_event.css" />
<script type="text/javascript">
	$(document).ready(function() {
		$('#adminlist').on('click', listRun);

	});//end ready

	function listRun() {
		$('#frm').attr('action', 'admin_event_list').submit();
	}
</script>

<div id="admineventtype">
	<h1 id="admin_h">병원 이벤트 타입별 리스트</h1>


	<!-- e_subject, e_content, e_type, 	e_url, hos_id, hos_name -->
	<!-- 제목               내용                 이벤트 방식    타입       병원 코드    병원 이름 -->

	<ul id="admin_h">
		<form name="frm" id="frm">
			<button type="button" class="btn btn-dark" id="adminlist" value="리스트">목록</button>
			<c:forEach items="${etype_List}" var="aetypelist">
				<li class="joinList">
					<table>
						<tr>
							<td id="red" colspan="2"><h4 class="joinList">${aetypelist.e_subject}</h4><br/></td>
						</tr>
						<tr>
							<td style="text-align: right;">병원 이름 :
								${aetypelist.e_hosDTO.hos_name}</td>
						</tr>
						<tr>
							<td style="text-align: right;">병원 코드 : ${aetypelist.hos_id}</td>
						</tr>
						<tr>
							<td style="text-align: right;">병원 연락처 :
								${aetypelist.e_hosDTO.hos_phone}</td>
						</tr>
						<tr>
							<td style="text-align: right;">이벤트 방식 : ${aetypelist.e_type}</td>
							
						</tr>
						<tr>
							<td><br/>${aetypelist.e_content}</td>
						</tr>
					</table>
					<hr />
				</li>
			</c:forEach>
		</form>
	</ul>
</div>