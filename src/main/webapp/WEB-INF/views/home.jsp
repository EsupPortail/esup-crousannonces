<jsp:directive.include file="includes/header.jsp" />

<h1>
	<spring:message code="portlet.title" />
</h1>

<c:choose>
	<c:when test="${not empty rental}">
		<jsp:directive.include file="includes/rentalList.jsp" />
	</c:when>
	<c:otherwise>
		<jsp:directive.include file="includes/emptyList.jsp" />
	</c:otherwise>
</c:choose>

<c:choose>
	<c:when test="${not empty jobs}">
		<jsp:directive.include file="includes/jobList.jsp" />
	</c:when>
	<c:otherwise>
		<jsp:directive.include file="includes/emptyList.jsp" />
	</c:otherwise>
</c:choose>

<jsp:directive.include file="includes/footer.jsp" />