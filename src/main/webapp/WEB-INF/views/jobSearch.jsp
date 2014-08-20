<jsp:directive.include file="includes/header.jsp" />
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<jsp:directive.include file="includes/goBackHome.jsp" />

<portlet:actionURL name="jobSearch" var="formSubmitAction"/>
<form:form method="post" action="${formSubmitAction}" role="form">

	<fieldset>
		<legend>
			<spring:message code="form.legend.field"/>
		</legend>
		
		<form:select path="domaine" id="domaine">
			<form:options items="${domaineList}"/>
		</form:select>
		
		<br/>
		
		<form:select path="aideADomicile" items="${aideADomicileList}" data-domaine="4"></form:select>
		<form:select path="animation" items="${animationList}" data-domaine="2"></form:select>
		<form:select path="autres" items="${autresList}" data-domaine="1"></form:select>
		<form:select path="bureau" items="${bureauList}" data-domaine="5"></form:select>
		<form:select path="hotellerie" items="${hotellerieList}" data-domaine="3"></form:select>
		<form:select path="vente" items="${venteList}" data-domaine="6"></form:select>
		
	</fieldset>

	<fieldset>
		<legend>
			<spring:message code="form.legend.infos"/>
		</legend>
	
		<form:checkboxes items="${contratList}" path="contrat" element="li"/>
		
		<form:label path="teletravail">
			<spring:message code="form.label.remoteJob"/>
		</form:label>
		<form:checkbox path="teletravail" value="1" id="teletravail"/>
	
	</fieldset>

	<fieldset>
	
		<legend>
			<spring:message code="form.legend.geolocation"/>
		</legend>	

		<form:radiobuttons element="li" path="typeLieu" items="${placeTypeList}" id="typeLieu"/>

			<br><br>

		<form:select path="townCode" items="${townList}" data-place="2"></form:select>
		
		<br><br>
		
		<form:select path="departmentCode" items="${departmentList}" data-place="3"></form:select>
		
		
		<br><br>
		
		<form:select path="regionCode" items="${regionList}" data-place="4"></form:select>

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