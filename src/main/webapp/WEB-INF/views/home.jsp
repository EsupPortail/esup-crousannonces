<jsp:directive.include file="includes/header.jsp" />

<h1>
	<spring:message code="portlet.title" />
</h1>

<c:if test="${bothActive eq true}">
	<jsp:directive.include file="includes/tabHeader.jsp" />
</c:if>

<c:choose>
	<c:when test="${activeView eq 'lokaviz'}">
		<jsp:directive.include file="includes/rentalList.jsp" />
	</c:when>
	<c:when test="${activeView eq 'jobaviz'}">
		<jsp:directive.include file="includes/jobList.jsp" />
	</c:when>
</c:choose>

<jsp:directive.include file="includes/footer.jsp" />