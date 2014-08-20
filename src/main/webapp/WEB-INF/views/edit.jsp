<jsp:directive.include file="includes/header.jsp" />
<h1>
	<spring:message code="portlet.title" />
</h1>

<jsp:directive.include file="includes/goBackHome.jsp" />

<ul>
	<c:if test="${lokaviz and lokavizPrefs != null}">
		<li>
			<spring:message code="edit.saved.search" arguments="Lokaviz"/>
		</li>
	</c:if>
	<c:if test="${jobaviz and jobavizPrefs != null}">
		<li>
			<spring:message code="edit.saved.search" arguments="Jobaviz"/>
		</li>
	</c:if>
</ul>

<p>
	<portlet:actionURL name="deletePreferences" var="deletePreferencesAction"/>	
	<a href="${deletePreferencesAction}" class="btn btn-danger btn-md">
		<spring:message code="edit.delete.saved.search"/>
	</a>
</p>

<c:if test="${isDeleted eq true}">
	<div class="alert alert-warning" role="alert">
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
</c:if>

<jsp:directive.include file="includes/footer.jsp" />