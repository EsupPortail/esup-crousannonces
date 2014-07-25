<jsp:directive.include file="includes/header.jsp" />
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<jsp:directive.include file="includes/goBackHome.jsp" />

<portlet:actionURL name="jobSearch" var="formSubmitAction"/>
<form:form method="post" action="${formSubmitAction}" role="form">

	<fieldset>
		<legend>
			Domaine emploi	
		</legend>
		
		<form:select path="domaine" id="domaine">
			<form:option value="0" label="-- Choisir un domaine"/>
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
			Informations complémentaires
		</legend>
	
		<form:checkboxes items="${contratList}" path="contrat" element="li"/>
		
		<form:label path="teletravail">
			Teletravail: 
		</form:label>
		<form:checkbox path="teletravail" value="1" id="teletravail"/>
	
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
	
		<div id="savedSearch-field" title="Cette recherche vous sera affiché par défaut si vous cochez cette case." data-toggle="tooltip" data-placement="top">
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