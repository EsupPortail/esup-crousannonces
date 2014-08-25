<section class="rental-items">

	<header>
		<h2>
			<spring:message code="view.nb.result" arguments="${response.query.nbResults}"/>
			<c:if test="${not empty placeLabel}">
				<spring:message code="${placeLabel}" arguments="${placeName}"/>
			</c:if>
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
	
	<section>
		<c:forEach var="jobItem" items="${response.results.resultList}" varStatus="status">
		
			<article class="annonce annonce-job">
				<div class="thumbnail">
					<h3>
						${jobItem.domaine} - ${jobItem.type}
						<small>
							<spring:message code="view.published.date" arguments="${jobItem.publication}"/>
						</small>
					</h3>
					
					<p>
						${jobItem.contrat}
						<c:if test="${not empty jobItem.duree}">
							- ${jobItem.duree} ${jobItem.type_duree}
						</c:if>
						- ${jobItem.volume}
						
						- ${jobItem.remuneration} 
						<c:if test="${not empty jobItem.periode}">
							- ${jobItem.periode} 
						</c:if>
						<c:if test="${not empty jobItem.type_renum}">
							- ${jobItem.type_renum}
						</c:if>
					</p>
					
					<p>
						${jobItem.commune} (${jobItem.cp})
						<c:if test="${not empty jobItem.disponibilite}">
							- ${jobItem.disponibilite}
						</c:if>
					</p>
					
					<p>
						<a href="${jobItem.url}" target="_blank" class="btn btn-primary btn-md">
							<spring:message code="view.full"/>
						</a>					
					</p>				
				</div>
			</article>
		
		</c:forEach>
	</section>
	
	<footer>
		<jsp:directive.include file="pager.jsp"/>
	</footer>	
	
	<p>
		<spring:message code="portlet.source"/>
		<em><a href="http://www.jobaviz.fr/">Jobaviz.fr</a></em>
	</p>
	
</section>