<html>
<head>
	<title>Employee information</title>
</head>

<body>
<table border="1">
   <g:each in="${AllEmployee}" status="i" var="thisProject">
	<tr>
		<td>${thisProject.emp_id}</td>
		<td>${thisProject.emp_name}</td>
		<td>${thisProject.emp_salary}</td>
		<td>${thisProject.emp_email}</td>
		<td>${thisProject.emp_address}</td>
		<td>${thisProject.emp_phone}</td>
	</tr>
   </g:each>
</table>

</body>
</html>