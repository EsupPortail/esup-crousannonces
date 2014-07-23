package org.esupportail.crousannonces.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.ActionMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

@Controller
@RequestMapping("EDIT")
public class EditController {
	
	private static final Logger logger = LoggerFactory.getLogger(ViewController.class);
	
	@RenderMapping
	public String edit(Model model) {
		return "edit";
	}
	
}
