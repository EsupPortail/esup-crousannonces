package org.esupportail.crousannonces.controllers;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletPreferences;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.portlet.bind.annotation.ActionMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

@Controller
@RequestMapping("EDIT")
public class EditController {
	
	private static final Logger logger = LoggerFactory.getLogger(ViewController.class);
	
	@RenderMapping
	public String edit(Model model, @RequestParam( value = "deletePreferences", required = false) boolean deletePreferences) {
		
		if(deletePreferences) {
			model.addAttribute("deletePreferences", true);
		}
		return "edit";
	}

	@ActionMapping("deletePreferences")
	public void deletePreferences(ActionRequest request, ActionResponse response) {
		
		PortletPreferences prefs = request.getPreferences();
		try {
			prefs.setValue(ViewController.LOKAVIZ_PREFERENCE_KEY, null);
			prefs.setValue(ViewController.JOBAVIZ_PREFERENCE_KEY, null);
			prefs.store();
		} catch (Exception e) {}
		
		response.setRenderParameter("deletePrefences", "true");
	}
	
}
