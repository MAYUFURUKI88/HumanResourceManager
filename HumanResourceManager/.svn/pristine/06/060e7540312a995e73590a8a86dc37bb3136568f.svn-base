package com.rapideact.local.humanresource.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ApplicantController {
	@RequestMapping(value = "/applicant", method = RequestMethod.GET)
	private String renderApplicant() {
		return "pages/applicant/index";
	}
	
	@RequestMapping(value = "/applicant/create", method = RequestMethod.GET)
	private String renderApplicantCreate() {
		return "pages/applicant/detail";
	}
}