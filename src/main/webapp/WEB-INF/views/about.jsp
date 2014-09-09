<jsp:directive.include file="includes/header.jsp" />

<jsp:directive.include file="includes/goBackHome.jsp" />

<c:if test="${isLokavizActivate eq true}">
	<p class="text-center">
		<img src="${contextPath}/img/logo-lokaviz.jpg" alt="Logo Lokaviz" class="img-responsive center-block"/>
	</p>
	<p>
		<spring:message code="about.lokaviz.description"/>
	</p>
</c:if>

<c:if test="${isLokavizActivate eq true and isJobavizActivate eq true}">
	<hr/>
</c:if>

<c:if test="${isJobavizActivate eq true}">
	<p class="text-center">
		<img src="${contextPath}/img/logo-jobaviz.jpg" alt="Logo Lokaviz" class="img-responsive center-block"/>
	</p>
	<p>
		<spring:message code="about.jobaviz.description"/>
	</p>
</c:if>

<jsp:directive.include file="includes/footer.jsp" />