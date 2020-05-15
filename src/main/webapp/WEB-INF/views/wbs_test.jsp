<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head>
	<title>KIMSCHOOL || WBS</title>
</head>
<body>

	<table border="1">
	<tr>
		<c:forEach items="${userlist }" var = "userlist">
		<td style="background-color: lightblue">사원명</td>
		<td> ${userlist.name }</td>
		</c:forEach>
		<c:forEach items="${workplace}" var = "workplace">
		<td style="background-color: lightblue">근무처</td>
		<td>${ workplace.wp_name}</td>
		</c:forEach>
		<c:forEach items="${workplace}" var = "workplace">
		<td style="background-color: lightblue">최소근무 </td>
		<td>${workplace.min_time }시간</td>
		</c:forEach>
	</tr>
	<tr>
		<c:forEach items="${workplace}" var = "workplace" >
		<td style="background-color: lightblue">사원번호</td>
		<td>${workplace.u_no }</td>
		</c:forEach>
		<td colspan="2"></td>
		<c:forEach items="${workplace}" var = "workplace" >
		<td style="background-color: lightblue">최대근무 </td>
		<td>${workplace.max_time }시간</td>
		</c:forEach>
	</tr>
		<tr style="background-color: lightblue">
		<th>일자</th>
		<th>출근시간</th>
		<th>퇴근시간</th>
		<th>휴게시간</th>
		<th>휴일구분</th>
		<th>비고</th>
	</tr>
		<c:forEach items = "${wbs2020 }" var = "wbs2020">
	<tr>
		<td>${wbs2020.date} </td>
		<td>${wbs2020.start_time } </td>
		<td>${wbs2020.end_time} </td>
		<td>${wbs2020.rest_time} </td>
		<td>${wbs2020.vacation_type} </td>
		<td>${wbs2020.memo} </td>
	</tr>
		</c:forEach>
	
</table>
<br>
</body>
</body>
</html>