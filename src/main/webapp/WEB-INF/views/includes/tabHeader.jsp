<c:set var="activeTabClass" value="class=\"active\""/>

<ul class="nav nav-tabs" role="tablist">
	<li <c:if test="${activeView eq 'lokaviz'}">${activeTabClass}</c:if>>
		<portlet:renderURL var="rentalListLink">
			<portlet:param name="action" value="rentalList"/>
		</portlet:renderURL>
		<a href="${rentalListLink}">
			<spring:message code="tab.lokaviz.label"/>
		</a>
	</li>
	<li <c:if test="${activeView eq 'jobaviz'}">${activeTabClass}</c:if>>
		<portlet:renderURL var="jobListLink">
			<portlet:param name="action" value="jobList"/>
		</portlet:renderURL>
		<a href="${jobListLink}">
			<spring:message code="tab.jobaviz.label"/>
		</a>
	</li>
</ul>