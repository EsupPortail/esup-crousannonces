<c:if test="${not empty response.query.prev or not empty response.query.next}">
	<c:choose>
		<c:when test="${activeView eq 'jobaviz'}">
			<c:set var="actionName" value="jobList" />		
		</c:when>
		<c:otherwise>
			<c:set var="actionName" value="rentalList" />
		</c:otherwise>
	</c:choose>
	
	<ul class="pager">
		<c:choose>
			<c:when test="${not empty response.query.prev}">
				<portlet:renderURL var="prevLink">
					<portlet:param name="action" value="${actionName}"/>
	  				<portlet:param name="${activeView}Url" value="${response.query.prev}"/>
				</portlet:renderURL>
				<c:set var="disabledAttr" value=""/>
			</c:when>
			<c:otherwise>
				<c:set var="prevLink" value="#"/>
				<c:set var="disabledAttr" value="class=\"disabled\""/>
			</c:otherwise>
		</c:choose>
		<li ${disabledAttr}>
			<a href="${prevLink}">
				&laquo; 
				<spring:message code="view.pager.prev"/>
			</a>
		</li>
	
		<c:choose>
			<c:when test="${not empty response.query.next}">
				<portlet:renderURL var="nextLink">
					<portlet:param name="action" value="${actionName}"/>
	  				<portlet:param name="${activeView}Url" value="${response.query.next}"/>
				</portlet:renderURL>
				<c:set var="disabledAttr" value=""/>
			</c:when>
			<c:otherwise>
				<c:set var="nextLink" value="#"/>
				<c:set var="disabledAttr" value="class=\"disabled\""/>
			</c:otherwise>
		</c:choose>
		<li ${disabledAttr}>
			<a href="${nextLink}">
				<spring:message code="view.pager.next"/>
				&raquo;
			</a>
		</li>
	</ul>
</c:if>