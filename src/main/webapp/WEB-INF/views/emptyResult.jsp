<jsp:directive.include file="includes/header.jsp" />

<jsp:directive.include file="includes/goBackHome.jsp" />

<h2>
	<spring:message code="empty.results"/>
</h2>

<div>
	<spring:message code="edit.deleted.search"/>
	
	<ul>
		<c:if test="${lokaviz eq true}">
		
			<portlet:renderURL var="jobSearchLink" portletMode="view">
				<portlet:param name="action" value="jobSearch"/>
			</portlet:renderURL>
		
			<li>
				<spring:message code="edit.new.search"/>
				<a href="${jobSearchLink}">
					<spring:message code="edit.new.jobSearch"/>
				</a>
			</li>
		</c:if>
		<c:if test="${jobaviz eq true}">

			<portlet:renderURL var="rentalSearchLink" portletMode="view">
				<portlet:param name="action" value="rentalSearch"/>
			</portlet:renderURL>
			
			<li>
				<spring:message code="edit.new.search"/>
				<a href="${jobSearchLink}">
					<spring:message code="edit.new.rentalSearch"/>
				</a>
			</li>
		</c:if>
	</ul>
</div>

<jsp:directive.include file="includes/footer.jsp" />