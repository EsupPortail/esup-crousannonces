<jsp:directive.include file="includes/header.jsp" />
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<jsp:directive.include file="includes/goBackHome.jsp" />

<portlet:actionURL name="jobSearch" var="formSubmitAction"/>
<form:form method="post" action="${formSubmitAction}" role="form">

	<fieldset>
		<legend>
			<spring:message code="form.legend.field"/>
		</legend>
		
		<form:select path="domaine" id="domaine" class="form-control">
			<form:options items="${domaineList}"/>
		</form:select>
		
		<br/>
		
		<form:select path="aideADomicile" items="${aideADomicileList}" data-domaine="4" class="form-control"></form:select>
		<form:select path="animation" items="${animationList}" data-domaine="2" class="form-control"></form:select>
		<form:select path="autres" items="${autresList}" data-domaine="1" class="form-control"></form:select>
		<form:select path="bureau" items="${bureauList}" data-domaine="5" class="form-control"></form:select>
		<form:select path="hotellerie" items="${hotellerieList}" data-domaine="3" class="form-control"></form:select>
		<form:select path="vente" items="${venteList}" data-domaine="6" class="form-control"></form:select>
		
	</fieldset>

	<fieldset>
		<legend>
			<spring:message code="form.legend.infos"/>
		</legend>
	
		<p>
			<spring:message code="form.label.contractType"/>
			<br/>
			<form:checkboxes items="${contratList}" path="contrat"/>
		</p>
		
		<p>
			<form:label path="teletravail">
				<spring:message code="form.label.remoteJob"/>		
				<form:checkbox path="teletravail" value="1" id="teletravail"/>
			</form:label>		
		</p>

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
	
		<div id="savedSearch-field" title="<spring:message code="form.search.save.label"/>" data-toggle="tooltip" data-placement="top">
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