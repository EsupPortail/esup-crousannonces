package org.esupportail.crousannonces.controllers;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.esupportail.crousannonces.models.RestResponse;
import org.esupportail.crousannonces.utils.URLUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

/**
 * Handles requests for the portlet view mode.
 */
@Controller
@RequestMapping("VIEW")
public class ViewController {
	
	private static final Logger logger = LoggerFactory.getLogger(ViewController.class);
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${lokaviz.rest.url}")
	private String LOKAVIZ_URL;
	
	@Value("${jobaviz.rest.url}")
	private String JOBABIZ_URL;
	
	@Value("${rest.response.format}")
	private String REST_RESPONSE_FORMAT;
	
	@Value("${rest.secret.code}")
	private String REST_SECRET_CODE;
	
	@Value("${rest.default.place.type}")
	private String REST_DEFAULT_PLACE_TYPE;
	
	@Value("${rest.default.place.code}")
	private String REST_DEFAULT_PLACE_CODE;
	
	private HashMap<String, String> defaultQueryMap;
	
	@PostConstruct
	public void init() {		
		this.defaultQueryMap = new HashMap<String, String>();
		this.defaultQueryMap.put("code", this.REST_SECRET_CODE);
		this.defaultQueryMap.put("format", this.REST_RESPONSE_FORMAT);
	}
	
	@RenderMapping
	public String home(Model model, 
			@RequestParam( value = "jobavizUrl", required = false ) String jobavizUrl, 
			@RequestParam( value = "lokavizUrl", required = false ) String lokavizUrl) {	
				
		Map<String, String> queryString = (HashMap) this.defaultQueryMap.clone();
		queryString.put("type_lieu", this.REST_DEFAULT_PLACE_TYPE);
		queryString.put("code_lieu", this.REST_DEFAULT_PLACE_CODE);

		boolean lokavizActivated = true;
		boolean jobavizActivated = true;
		
		if(lokavizActivated) {
			
			if(lokavizUrl == null) {
				lokavizUrl = this.LOKAVIZ_URL + URLUtils.mapToString(queryString);
			}			
			RestResponse responseRental = this.restTemplate.getForObject(lokavizUrl, RestResponse.class);
			model.addAttribute("rental", responseRental);
		}
		
		if(jobavizActivated) {
			
			if(jobavizUrl == null) {
				jobavizUrl = this.LOKAVIZ_URL + URLUtils.mapToString(queryString);
			}
			RestResponse responseJob = this.restTemplate.getForObject(jobavizUrl, RestResponse.class);
			model.addAttribute("jobs", responseJob);
		}

		return "home";
	}
}
