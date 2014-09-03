/**
 * Licensed to ESUP-Portail under one or more contributor license
 * agreements. See the NOTICE file distributed with this work for
 * additional information regarding copyright ownership.
 *
 * ESUP-Portail licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.esupportail.crousannonces.controllers;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletPreferences;
import javax.portlet.RenderRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
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
	@Value("${activate.lokaviz}") private boolean isLokavizActivate;
	@Value("${activate.jobaviz}") private boolean isJobavizActivate;
	
	@RenderMapping
	public String edit(RenderRequest request, Model model, @RequestParam( value = "isDeleted", required = false) String isDeleted) {

		PortletPreferences prefs = request.getPreferences();
		try {
			model.addAttribute("lokavizPrefs", prefs.getValue(ViewController.LOKAVIZ_PREFERENCE_KEY, null));
			model.addAttribute("jobavizPrefs", prefs.getValue(ViewController.JOBAVIZ_PREFERENCE_KEY, null));
		} catch (Exception e) {
			// We can't fetch preferences
		}
		
		model.addAttribute("lokaviz", isLokavizActivate);
		model.addAttribute("jobaviz", isJobavizActivate);
		
		if(isDeleted != null && isDeleted.length() > 0) {
			model.addAttribute("isDeleted", true);
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
		
		response.setRenderParameter("isDeleted", "true");
	}
	
}