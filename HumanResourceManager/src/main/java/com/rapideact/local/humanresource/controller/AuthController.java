package com.rapideact.local.humanresource.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AuthController {
	@RequestMapping(value="/login", method=RequestMethod.GET)
	private String renderLogin() {
		return "pages/auth/login";
	}
	
	@RequestMapping(value="/denied", method=RequestMethod.GET)
	private String renderDenied() {
		return "pages/auth/denied";
	}
}
