<%-- <c:set var="basePath" scopl="request" value="${pageContext.request.contextPath}"/> --%>

<%
	String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath();
	request.setAttribute("basePath", basePath);
%>