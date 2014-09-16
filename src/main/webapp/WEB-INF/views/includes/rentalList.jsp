<section class="rental-items">

	<header>
		<h2>
			<spring:message code="view.nb.result" arguments="${response.query.nbResults}"/>
			<c:if test="${not empty placeLabel}">
				<spring:message code="${placeLabel}" arguments="${placeName}"/>
			</c:if>
			<small>
				<portlet:renderURL var="rentalSearchLink">
					<portlet:param name="action" value="rentalSearch"/>
				</portlet:renderURL>
			
				<spring:message code="view.reset.search"/>
				<a href="${rentalSearchLink}" role="button" class="btn btn-default btn-md">
					<span class="glyphicon glyphicon-search"></span>
					<spring:message code="view.new.search"/>
				</a>
			</small>
			
		</h2>
		
		<jsp:directive.include file="pager.jsp"/>
	</header>
	
	<section>
		<c:forEach var="rentalItem" items="${response.results}" varStatus="status">
		
			<article class="annonce">
				<div class="thumbnail row">
					<c:if test="${not empty rentalItem.thumbnail}">
						<div class="picture-crop col-xs-3">
							<img src="${rentalItem.thumbnail}" alt="${rentalItem.type} - ${rentalItem.superficie}"/>
						</div>
					</c:if>
					<div class="caption col-xs-${not empty rentalItem.thumbnail ? "9" : "12"}">
						
						<h3>
							${rentalItem.type} - 
							<c:if test="${rentalItem.superficie ne '[]'}">
								${rentalItem.superficie eq '[]' ? '' : rentalItem.superficie} - 
							</c:if>
							${rentalItem.contrat}
						</h3>
						
						<p>
							<spring:message code="view.loyer" arguments="${rentalItem.loyer}"/>
							<c:if test="${not empty rentalItem.loyer}">
								<spring:message code="view.charges" arguments="${rentalItem.charges}"/>
							</c:if>
						</p>
						
						<c:if test="${not empty rentalItem.disponibilite}">
							<p>
								<spring:message code="view.availability" arguments="${rentalItem.disponibilite}"/>
							</p>
						</c:if>
						
						<p>
							<spring:message code="view.publishedDate" arguments="${rentalItem.publication}"/>
						</p>
					
						<c:if test="${not empty rentalItem.url}">
							<a href="${rentalItem.url}" class="btn btn-primary" role="button" target="_blank">
								<spring:message code="view.full"/>						
							</a>
						</c:if>
					
					</div>
				</div>	
			</article>
		</c:forEach>
	</section>
	
	<footer>
		<jsp:directive.include file="pager.jsp"/>
	</footer>
	
	<p>
		<spring:message code="portlet.source"/>
		<em><a href="http://www.lokaviz.fr/">Lokaviz.fr</a></em>
	</p>

</section>