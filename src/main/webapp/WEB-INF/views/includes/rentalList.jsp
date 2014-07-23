<section class="rental-items">

	<header>
		<h2>
			<spring:message code="view.nb.result" arguments="${rental.query.nbResults}"/>
			<small>
				<spring:message code="view.reset.search"/>
				<button type="button" class="btn btn-default btn-md">
					<span class="glyphicon glyphicon-search"></span>
					<spring:message code="view.new.search"/>
				</button>
			</small>
		</h2>
		
		<jsp:directive.include file="pager.jsp"/>
	</header>
	
	<div>
		<c:forEach var="rentalItem" items="${rental.results.resultList}" varStatus="status">
		
			<article class="annonce">
				
				<c:choose>
					<c:when test="${not empty rentalItem.thumbnail}">
						<c:set var="imgUrl" value="${rentalItem.thumbnail}"/>
					</c:when>
					<c:otherwise>
						<c:set var="imgUrl" value="http://www.financiereguizot.com/wp-content/themes/twentyeleven/images/img-not-found_600_600.jpg"/>
					</c:otherwise>
				</c:choose>
				
					<div class="thumbnail row">
						<div class="picture-crop col-xs-3 col-sm-3 col-md-3 col-lg-3">
							<img src="${imgUrl}" alt="${rentalItem.type} - ${rentalItem.superficie}"/>
						</div>
						<div class="caption col-xs-9 col-sm-9 col-md-9 col-lg-9">
							
							<h3>${rentalItem.type} - ${rentalItem.superficie} - ${rentalItem.contrat}</h3>
							
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
	</div>
	
	<footer>
		<jsp:directive.include file="pager.jsp"/>
	</footer>

</section>