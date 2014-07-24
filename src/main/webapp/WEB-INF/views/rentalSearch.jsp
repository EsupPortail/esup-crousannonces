<jsp:directive.include file="includes/header.jsp" />
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<portlet:actionURL name="rentalSearch" var="formSubmitAction"/>

<form:form method="post" action="${formSubmitAction}" role="form">

	<fieldset>
		<legend>
			<spring:message code="form.new.search"/>	
		</legend>
		
		<p>
			Situation :
		</p>
		<ul class="clearfix">
			<form:checkboxes element="li" path="situation" items="${situationList}"></form:checkboxes>
		</ul>
		
		<p>
			Type de logement : 
		</p>
		<ul class="clearfix">
			<form:checkboxes element="li" path="type" items="${typeList}"></form:checkboxes>
		</ul>
		
		<p>
			Intérieur : 
		</p>
		<ul class="clearfix">
			<form:checkboxes element="li" path="contrat" items="${contractTypeList}"></form:checkboxes>
		</ul>
				
		<br>
		
		PMR :  
		<form:checkbox path="isPMR" value="1"/>
			
			<br>
				
		Label
		<form:checkbox path="isLabel" value="1"/>		
		
	</fieldset>

	<fieldset>
	
		<legend>Localisation de la recherche</legend>	

		<form:radiobuttons element="li" path="typeLieu" items="${placeTypeList}"/>

			<br><br>

		<form:select path="townCode" items="${townList}"></form:select>
		
		<br><br>
		
		<form:select path="departmentCode" items="${departmentList}"></form:select>
		
		<br><br>
		
		<form:select path="regionCode" items="${regionList}"></form:select>

	</fieldset>
	
	<fieldset>
	
		Sauvegarder cette recherche : 
		<form:checkbox path="savedSearch" value="true"/>
		
		<br/>
	
		<input type="submit" value="Lancer la Recherche"/>
		<input type="reset" value="Remettre à zéro"/>
		
	</fieldset>

</form:form>

<jsp:directive.include file="includes/footer.jsp" />