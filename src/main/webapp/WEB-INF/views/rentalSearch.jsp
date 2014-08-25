<jsp:directive.include file="includes/header.jsp" />
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<jsp:directive.include file="includes/goBackHome.jsp" />

<portlet:actionURL name="rentalSearch" var="formSubmitAction"/>
<form:form method="post" action="${formSubmitAction}" role="form">

	<fieldset>
		<legend>
			<spring:message code="form.legend.caracteristics"/>
		</legend>
		
		<p>
			<form:label path="situation">
				<spring:message code="form.label.situation"/>
			</form:label>
			<br/>
			<form:checkboxes path="situation" items="${situationList}"/>
		</p>
		
		<p>
			<form:label path="type">
				<spring:message code="form.label.type"/>
			</form:label> 
			<br/>
			<form:checkboxes path="type" items="${typeList}"></form:checkboxes>
		</p>
		
	</fieldset>
	
	<fieldset>
		
		<legend>
			<spring:message code="form.legend.roomfitting"/>
		</legend>
	
		<p>
			<form:label path="contrat">	
				<spring:message code="form.label.inside"/>
			</form:label>
			<br/>
			<form:checkboxes path="contrat" items="${contractTypeList}"></form:checkboxes>
		</p>
				
		<p>
			<c:set var="pmrTooltipTitle">
				<spring:message code="tootlip.pmr.title"/>
			</c:set>
			<form:label path="isPMR" data-toggle="tooltip" data-placement="top" title="${pmrTooltipTitle}">
				<spring:message code="form.label.pmr"/>
				<form:checkbox path="isPMR" value="1" id="isPMR"/>
			</form:label>
		</p>
		
		<p>
			<c:set var="labelTooltipTitle">
				<spring:message code="tootlip.label.title"/>
			</c:set>
			<form:label path="isLabel"  data-toggle="tooltip" data-placement="top" title="${labelTooltipTitle}">
				<spring:message code="form.label.label"/>
				<form:checkbox path="isLabel" value="1" id="isLabel"/>
			</form:label>
		</p>
		
		<script>
			$(document).ready(function() {
				$('[data-toggle=tooltip]').tooltip();
			});
		</script>
	
	</fieldset>

	<fieldset>
	
		<legend>
			<spring:message code="form.legend.geolocation"/>
		</legend>	
		
		<p>
			<spring:message code="form.label.typeLieu"/>
			<br/>
			<form:radiobuttons path="typeLieu" items="${placeTypeList}" id="typeLieu"/>
		</p>
		
		<form:select path="townCode" items="${townList}" data-place="2" class="form-control"></form:select>
		<form:select path="departmentCode" items="${departmentList}" data-place="3" class="form-control"></form:select>
		<form:select path="regionCode" items="${regionList}" data-place="4" class="form-control"></form:select>

	</fieldset>
	
	<fieldset>
	
		<legend>
			<spring:message code="form.legend.parameter"/>
		</legend>
	
		<div id="savedSearch-field"  title="<spring:message code="form.search.save.label"/>" data-toggle="tooltip" data-placement="top">
			<form:label path="savedSearch">
				<spring:message code="form.search.save"/>
			</form:label>
			<form:checkbox path="savedSearch" value="true" id="savedSearch"/>
		</div>
	
		<input type="submit" value="<spring:message code="form.submit.label"/>"/>
		<input type="reset" value="<spring:message code="form.reset.label"/>"/>
		
	</fieldset>

</form:form>
<script src="<%=request.getContextPath()%>/js/search.js"></script>
<jsp:directive.include file="includes/footer.jsp" />