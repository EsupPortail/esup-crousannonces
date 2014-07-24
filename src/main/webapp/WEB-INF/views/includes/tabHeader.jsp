<portlet:renderURL var="rentalListLink">
	<portlet:param name="action" value="rentalList"/>
</portlet:renderURL>
<portlet:renderURL var="jobListLink">
	<portlet:param name="action" value="jobList"/>
</portlet:renderURL>

<c:if test="${activeView eq 'lokaviz'}">
	<a href="${jobListLink}" class="btn btn-default btn-lg">
		Annonces emploi
	</a>
</c:if>
<c:if test="${activeView eq 'jobaviz'}">
	<a href="${rentalListLink}" class="btn btn-default btn-lg">
		Annonces location
	</a>
</c:if>
