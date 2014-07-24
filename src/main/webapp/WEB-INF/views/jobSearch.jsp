<jsp:directive.include file="includes/header.jsp" />
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<portlet:renderURL var="formSubmitAction">
	<portlet:param name="action" value="jobSearch"/>
</portlet:renderURL>

<form:form method="post" action="${formSubmitAction}" role="form">

	<fieldset>
		<legend>
<%-- 			<spring:message code="form.new.search"/>	 --%>
		</legend>
		
		${situationList}
		
		<ul>
			<form:checkboxes element="li" path="job.situation" items="${situationList}"></form:checkboxes>
		</ul>
		
	</fieldset>

</form:form>

<jsp:directive.include file="includes/footer.jsp" />