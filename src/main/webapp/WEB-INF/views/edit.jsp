<jsp:directive.include file="includes/header.jsp" />
<h1>
	<spring:message code="portlet.title" />
</h1>

<jsp:directive.include file="includes/goBackHome.jsp" />

<p>
	<portlet:actionURL name="deletePreferences" var="deletePreferencesAction"/>
	
	<c:if test="${lokaviz and lokavizPrefs != null}">
		<strong>Préférence lokaviz</strong>
	</c:if>
	<c:if test="${jobaviz and jobavizPrefs != null}">
		<strong>Préférence jobaviz</strong>
	</c:if>
	
	<a href="${deletePreferencesAction}" class="btn btn-danger btn-md">
		Supprimer mes recherches enregistrées
	</a>
</p>
<c:if test="${isDeleted eq true}">
	<div class="alert alert-warning" role="alert">
		Vous avez supprimer vos recherches par défaut.
		
		<ul>
			<c:if test="${lokaviz eq true}">
			
				<portlet:renderURL var="jobSearchLink" portletMode="view">
					<portlet:param name="action" value="jobSearch"/>
				</portlet:renderURL>
			
				<li>
					Lancer une nouvelle <a href="${jobSearchLink}">recherche d'emploi</a>
				</li>
			</c:if>
			<c:if test="${jobaviz eq true}">
	
				<portlet:renderURL var="rentalSearchLink" portletMode="view">
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