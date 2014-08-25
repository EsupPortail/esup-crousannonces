package org.esupportail.crousannonces.controllers;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletPreferences;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.esupportail.crousannonces.form.JobForm;
import org.esupportail.crousannonces.form.RentalForm;
import org.esupportail.crousannonces.model.RestResponse;
import org.esupportail.crousannonces.utils.URLUtils;
import org.esupportail.crousannonces.utils.constants.Area;
import org.esupportail.crousannonces.utils.constants.Job;
import org.esupportail.crousannonces.utils.constants.Rental;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.portlet.bind.annotation.ActionMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

import com.google.gson.Gson;

/**
 * Handles requests for the portlet view mode.
 */
@Controller
@RequestMapping("VIEW")
public class ViewController {
	
	private static final Logger logger = LoggerFactory.getLogger(ViewController.class);
	
	@Autowired private RestTemplate restTemplate;
	@Autowired private Gson gson;
	
	@Value("${lokaviz.rest.url}")        private String LOKAVIZ_URL;
	@Value("${jobaviz.rest.url}")        private String JOBAVIZ_URL;
	@Value("${rest.response.format}")    private String REST_RESPONSE_FORMAT;
	@Value("${rest.secret.code}")        private String REST_SECRET_CODE;
	@Value("${rest.default.place.type}") private String REST_DEFAULT_PLACE_TYPE;
	@Value("${rest.default.place.code}") private String REST_DEFAULT_PLACE_CODE;
	@Value("${activate.lokaviz}")        private boolean isLokavizActivate;
	@Value("${activate.jobaviz}")        private boolean isJobavizActivate;
	
	private HashMap<String, String> defaultQueryMap;

	public static final String LOKAVIZ_PREFERENCE_KEY = "lokavizQueryString";
	public static final String LOKAVIZ_PREFERENCE_DATA = "lokavizDataArray";
	public static final String JOBAVIZ_PREFERENCE_KEY = "jobavizQueryString";
	public static final String JOBAVIZ_PREFERENCE_DATA = "jobavizDataArray";
	
	@PostConstruct
	public void init() {		
		this.defaultQueryMap = new HashMap<String, String>();
		this.defaultQueryMap.put("code", this.REST_SECRET_CODE);
		this.defaultQueryMap.put("format", this.REST_RESPONSE_FORMAT);
	}
	
	@RenderMapping
	public String home(RenderRequest request, RenderResponse response, Model model) {	
		
		if(this.isLokavizActivate) {
			
			return rentalList(request, model, null);
		} else {
			
			return jobList(request, model, null);
		}
	}
	
	@RenderMapping(params = { "action=rentalList" })
	public String rentalList(RenderRequest request, Model model, 
							 @RequestParam ( value = "lokavizUrl", required = false) String lokavizUrl) {
		
		PortletPreferences prefs = request.getPreferences();
		
		// If no specific URL is given
		if(lokavizUrl == null) {
						
			String prefQueryString = prefs.getValue(this.LOKAVIZ_PREFERENCE_KEY, null);
			
			// We check if the user has a saved search
			// If so we display its search
			// otherwise we just go with the defaults
			
			if(prefQueryString != null) {
				
				lokavizUrl = this.LOKAVIZ_URL + prefQueryString;
				String preferences = prefs.getValue(this.LOKAVIZ_PREFERENCE_DATA, null);
				RentalForm rf = gson.fromJson(preferences, RentalForm.class);
				
				Map<Integer, String> placeMap = Area.PLACE_CODE.get(rf.getTypeLieu());
				model.addAttribute("placeLabel", "view.place." + rf.getTypeLieu());
				model.addAttribute("placeName", placeMap.get(rf.codeLieuDecoder(rf.getTypeLieu())));
				
			} else {
				
				Map<String, String> queryString = (HashMap) this.defaultQueryMap.clone();
				queryString.put("type_lieu", this.REST_DEFAULT_PLACE_TYPE);
				queryString.put("code_lieu", this.REST_DEFAULT_PLACE_CODE);
				
				Map<Integer, String> placeMap = Area.PLACE_CODE.get(new Integer(this.REST_DEFAULT_PLACE_TYPE));
				
				model.addAttribute("placeLabel", "view.place." + this.REST_DEFAULT_PLACE_TYPE);
				model.addAttribute("placeName", placeMap.get(new Integer(this.REST_DEFAULT_PLACE_CODE)));
				
				
				lokavizUrl = this.LOKAVIZ_URL + URLUtils.mapToString(queryString);
			}
		}
		
		try {
			RestResponse response = this.restTemplate.getForObject(lokavizUrl, RestResponse.class);
			model.addAttribute("response", response);
			model.addAttribute("activeView", "lokaviz");	
		} catch (Exception e) {
			// If nb_results == 0, results isn't an object but an array. 
			// Jackson mapper gets lost and throw a PortletException
			// This is a glitch in the REST API => #TOFIX
			
			return "emptyResult";
		}
		
		model.addAttribute("bothActive", this.isBothActive());
		
		return "home";
	}
	
	@RenderMapping(params = { "action=jobList" })
	public String jobList(RenderRequest request, Model model,
						  @RequestParam ( value = "jobavizUrl", required = false) String jobavizUrl) {
		
		PortletPreferences prefs = request.getPreferences();
		
		// If no specific URL is given
		if(jobavizUrl == null) {
			
			String prefQueryString = prefs.getValue(this.JOBAVIZ_PREFERENCE_KEY, null);
			
			// We check if the user has a saved search
			// If so we display its search
			// otherwise we just go with the defaults
			
			if(prefQueryString != null) {
				
				jobavizUrl = this.JOBAVIZ_URL + prefQueryString;
				
				String preferences = prefs.getValue(this.LOKAVIZ_PREFERENCE_DATA, null);
				JobForm jf = gson.fromJson(preferences, JobForm.class);
				
				Map<Integer, String> placeMap = Area.PLACE_CODE.get(jf.getTypeLieu());
				model.addAttribute("placeLabel", "view.place." + jf.getTypeLieu());
				model.addAttribute("placeName", placeMap.get(jf.codeLieuDecoder(jf.getTypeLieu())));
			} else {
				
				Map<String, String> queryString = (HashMap) this.defaultQueryMap.clone();
				queryString.put("type_lieu", this.REST_DEFAULT_PLACE_TYPE);
				queryString.put("code_lieu", this.REST_DEFAULT_PLACE_CODE);
				
				Map<Integer, String> placeMap = Area.PLACE_CODE.get(new Integer(this.REST_DEFAULT_PLACE_TYPE));
				model.addAttribute("placeLabel", "view.place." + this.REST_DEFAULT_PLACE_TYPE);
				model.addAttribute("placeName", placeMap.get(new Integer(this.REST_DEFAULT_PLACE_CODE)));
				
				jobavizUrl = this.JOBAVIZ_URL + URLUtils.mapToString(queryString);				
			}
			
		}
		
		RestResponse response = this.restTemplate.getForObject(jobavizUrl, RestResponse.class);
		model.addAttribute("response", response);
		model.addAttribute("activeView", "jobaviz");
		model.addAttribute("bothActive", this.isBothActive());
				
		return "home";
	}
 	
	@RenderMapping(params = { "action=jobSearch" })
	public String jobSearch(Model model) {
		
		model.addAttribute("command", new JobForm());
		model.addAttribute("domaineList", Job.FIELD); 
		model.addAttribute("aideADomicileList", Job.TYPE_AIDE_A_DOMICILE); 
		model.addAttribute("animationList", Job.TYPE_ANIMATION); 
		model.addAttribute("autresList", Job.TYPE_AUTRES); 
		model.addAttribute("bureauList", Job.TYPE_BUREAU); 
		model.addAttribute("hotellerieList", Job.TYPE_HOTELLERIE); 
		model.addAttribute("venteList", Job.TYPE_VENTE);
		model.addAttribute("contratList", Job.CONTRACT_TYPE);
		model.addAttribute("placeTypeList", Rental.PLACE_TYPE); 
		model.addAttribute("townList", Area.TOWN_CODE); 
		model.addAttribute("departmentList", Area.DEPARTMENT_CODE); 
		model.addAttribute("regionList", Area.REGION_CODE); 
		return "jobSearch";
	}

	@ActionMapping("jobSearch")
	public void onJobSubmit(ActionRequest request, ActionResponse response, @ModelAttribute("jobForm") JobForm jobForm, BindingResult result) {
		
		Map<String, String> defaults = (HashMap) this.defaultQueryMap.clone();
		String queryString = jobForm.buildQueryString(defaults);
		
		if(jobForm.isSavedSearch()) {
			
			PortletPreferences prefs = request.getPreferences();
			try {
				prefs.setValue(this.JOBAVIZ_PREFERENCE_KEY, queryString);
				prefs.setValue(this.JOBAVIZ_PREFERENCE_DATA, gson.toJson(jobForm));
				prefs.store();
			} catch (Exception e) {}
		}

		response.setRenderParameter("action", "jobList");
		response.setRenderParameter("jobavizUrl", this.JOBAVIZ_URL + queryString);
	}
	
	@RenderMapping(params = { "action=rentalSearch" })
	public String rentalSearch(Model model) {
		
		model.addAttribute("command", new RentalForm());
		model.addAttribute("situationList", Rental.SITUATION);
		model.addAttribute("typeList", Rental.RENTAL_TYPE);
		model.addAttribute("contractTypeList", Rental.CONTRACT_TYPE);
		model.addAttribute("placeCodeList", Rental.PLACE_CODE);
		model.addAttribute("placeTypeList", Rental.PLACE_TYPE);
		model.addAttribute("townList", Area.TOWN_CODE);
		model.addAttribute("departmentList", Area.DEPARTMENT_CODE);
		model.addAttribute("regionList", Area.REGION_CODE);
		
		return "rentalSearch";
	}
	
	@ActionMapping("rentalSearch")
	public void onRentalSubmit(ActionRequest request, ActionResponse response, @ModelAttribute("rentalForm") RentalForm rentalForm, BindingResult result) {
		
		Map<String, String> defaults = (HashMap) this.defaultQueryMap.clone();
		String queryString = rentalForm.buildQueryString(defaults);
		
		if(rentalForm.isSavedSearch()) {
			PortletPreferences pref = request.getPreferences();
			try {
				
				pref.setValue(this.LOKAVIZ_PREFERENCE_KEY, queryString);
				pref.setValue(this.LOKAVIZ_PREFERENCE_DATA, gson.toJson(rentalForm));
				pref.store();
			} catch (Exception e) {}
		}		
		response.setRenderParameter("action", "rentalList");
		response.setRenderParameter("lokavizUrl", this.LOKAVIZ_URL + queryString);
	}
	
	private boolean isBothActive() {
		if(this.isJobavizActivate && this.isLokavizActivate) {
			return true;
		}
		return false;
	}
	
}