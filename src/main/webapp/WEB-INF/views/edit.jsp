<jsp:directive.include file="includes/header.jsp" />
<h1>
	<spring:message code="portlet.title" />
</h1>

<jsp:directive.include file="includes/goBackHome.jsp" />

<p>
	<portlet:actionURL name="deletePreferences" var="deletePreferencesAction"/>
	<a href="${deletePreferencesAction}" class="btn btn-danger btn-md">
		Supprimer mes recherches enregistrées
	</a>
</p>
${isLokavizActive}
<c:if test="${isDeleted eq true}">
	<div class="alert alert-warning" role="alert">
		Vous avez supprimer vos recherches par défaut.
		
		<ul>
			<c:if test="${lokaviz eq true}">
			
				<portlet:renderURL var="jobSearchLink">
					<portlet:param name="action" value="jobSearch"/>
				</portlet:renderURL>
			
				<li>
					Lancer une nouvelle <a href="${jobSearchLink}">recherche d'emploi</a>
				</li>
			</c:if>
			<c:if test="${jobaviz eq true}">
	
				<portlet:renderURL var="rentalSearchLink">
					<portlet:param name="action" value="rentalSearch"/>
				</portlet:renderURL>
				
				<li>
					Lancer une nouvelle <a href="${rentalSearchLink}">recheche de logement</a>
				</li>
			</c:if>
		</ul>
	</div>
</c:if>

<jsp:directive.include file="includes/footer.jsp" />