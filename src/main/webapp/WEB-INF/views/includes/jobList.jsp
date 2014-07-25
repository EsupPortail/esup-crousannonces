<section class="rental-items">

	<header>
		<h2>
			<spring:message code="view.nb.result" arguments="${response.query.nbResults}"/>
			<small>
				<portlet:renderURL var="jobSearchLink">
					<portlet:param name="action" value="jobSearch"/>
				</portlet:renderURL>
			
				<spring:message code="view.reset.search"/>
				<a href="${jobSearchLink}" role="button" class="btn btn-default btn-md">
					<span class="glyphicon glyphicon-search"></span>
					<spring:message code="view.new.search"/>
				</a>
			</small>
		</h2>
		
		<jsp:directive.include file="pager.jsp"/>
	</header>
	
	<footer>
		<jsp:directive.include file="pager.jsp"/>
	</footer>	
	
</section>