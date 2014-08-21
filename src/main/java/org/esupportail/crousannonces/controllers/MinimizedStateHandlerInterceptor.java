package org.esupportail.crousannonces.controllers;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.WindowState;

import org.springframework.web.portlet.handler.HandlerInterceptorAdapter;

public class MinimizedStateHandlerInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandleRender(RenderRequest req, RenderResponse res, Object handler) throws Exception {
		if(WindowState.MINIMIZED.equals(req.getWindowState())) {
			return false;
		}
		return true;
	}
	
}
