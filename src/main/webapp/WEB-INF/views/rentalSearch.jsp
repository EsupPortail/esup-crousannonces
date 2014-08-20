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
		</p>
		<ul class="clearfix">
			<form:checkboxes element="li" path="situation" items="${situationList}"></form:checkboxes>
		</ul>
		
		<p>
			<form:label path="type">
				<spring:message code="form.label.type"/>
			</form:label> 
		</p>
		<ul class="clearfix">
			<form:checkboxes element="li" path="type" items="${typeList}"></form:checkboxes>
		</ul>		
		
	</fieldset>
	
	<fieldset>
		
		<legend>
			<spring:message code="form.legend.roomfitting"/>
		</legend>
	
		<p>
			<form:label path="contrat">	
				<spring:message code="form.label.inside"/>
			</form:label>
		</p>
		<ul class="clearfix">
			<form:checkboxes element="li" path="contrat" items="${contractTypeList}"></form:checkboxes>
		</ul>
				
		<br>
		
		<form:label path="isPMR">
			<spring:message code="form.label.pmr"/>
		</form:label>
		<form:checkbox path="isPMR" value="1" id="isPMR"/>
			
			<br>
				
		<form:label path="isLabel">
			<spring:message code="form.label.label"/>
		</form:label>
		<form:checkbox path="isLabel" value="1" id="isLabel"/>
	
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