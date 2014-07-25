<jsp:directive.include file="includes/header.jsp" />
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<jsp:directive.include file="includes/goBackHome.jsp" />

<portlet:actionURL name="rentalSearch" var="formSubmitAction"/>
<form:form method="post" action="${formSubmitAction}" role="form">

	<fieldset>
		<legend>
			Caractéristique
		</legend>
		
		<p>
			<form:label path="situation">
				Situation :			
			</form:label>
		</p>
		<ul class="clearfix">
			<form:checkboxes element="li" path="situation" items="${situationList}"></form:checkboxes>
		</ul>
		
		<p>
			<form:label path="type">		
				Type de logement :
			</form:label> 
		</p>
		<ul class="clearfix">
			<form:checkboxes element="li" path="type" items="${typeList}"></form:checkboxes>
		</ul>		
		
	</fieldset>
	
	<fieldset>
		
		<legend>Aménagement</legend>
	
		<p>
			<form:label path="contrat">	
				Intérieur : 
			</form:label>
		</p>
		<ul class="clearfix">
			<form:checkboxes element="li" path="contrat" items="${contractTypeList}"></form:checkboxes>
		</ul>
				
		<br>
		
		<form:label path="isPMR">
			PMR :  
		</form:label>
		<form:checkbox path="isPMR" value="1" id="isPMR"/>
			
			<br>
				
		<form:label path="isLabel">
			Label : 
		</form:label>
		<form:checkbox path="isLabel" value="1" id="isLabel"/>
	
	</fieldset>

	<fieldset>
	
		<legend>Localisation de la recherche</legend>	

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
			Paramètres
		</legend>
	
		<div id="savedSearch-field"  title="Cette recherche vous sera affiché par défaut si vous cochez cette case." data-toggle="tooltip" data-placement="top">
			<form:label path="savedSearch">
				Sauvegarder cette recherche : 
			</form:label>
			<form:checkbox path="savedSearch" value="true" id="savedSearch"/>
		</div>
	
		<input type="submit" value="Lancer la Recherche"/>
		<input type="reset" value="Remettre à zéro"/>
		
	</fieldset>

</form:form>
<script src="<%=request.getContextPath()%>/js/search.js"></script>
<jsp:directive.include file="includes/footer.jsp" />