<%@ page contentType="text/html; charset=UTF-8" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<title>大众点评后台管理</title>
		<link href="${basePath}/css/main.css" rel="stylesheet" type="text/css" />
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/common/jquery-1.8.3.js"></script>
		<script type="text/javascript">
			$(document).ready(function() {
				location.href = "${pageContext.request.contextPath}/index";
			});
		</script>
	</head>
	<body>
		<!--时间  -->
		${water.startTime}${water.endTime}
		
		
		
		<!--操作  -->
		<%-- <c:if test="${not empty  water.startTime}">
			开
		</c:if>
		<c:if test="${not empty  water.endTime}">
			关
		</c:if> --%>
		
	
	</body>
</html>