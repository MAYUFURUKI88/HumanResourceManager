package com.rapideact.local.humanresource.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminController {
	@RequestMapping(value="/admin", method=RequestMethod.GET)
	private String renderAdmin() {
		return "pages/admin/index";
	}

	@RequestMapping(value="/admin/create", method=RequestMethod.GET)
	private String renderAdminCreate() {
		return "pages/admin/detail";
	}
}