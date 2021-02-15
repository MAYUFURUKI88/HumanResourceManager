package com.rapideact.local.humanresource.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rapideact.local.humanresource.models.DevModel;
import com.rapideact.local.humanresource.services.DevService;

@Controller
public class DevController {

	@Autowired
	private DevService devService;
	
	@RequestMapping(value = "/dev/frame", method = RequestMethod.GET)
	private String renderDevFrame() {
		return "pages/dev/frame";
	}

	@RequestMapping(value = "/dev/mybatis", method = RequestMethod.GET)
	private String renderDevMabatis(Model model) {
		System.out.println("called controller");
		String ret = devService.test();
		System.out.println("ret = " + ret);
		model.addAttribute("ret", ret);
		return "pages/dev/mybatis";
	}
	
	@RequestMapping(value = "/dev/toastr", method = RequestMethod.GET)
	private String renderDevToastr() {
		return "pages/dev/toastr";
	}
	
	@RequestMapping(value = "/dev/sweetalert2", method = RequestMethod.GET)
	private String renderDevSweetalert2() {
		return "pages/dev/sweetalert2";
	}
	
	@RequestMapping(value = "/dev/datatables", method = RequestMethod.GET)
	private String renderDevDatatables() {
		return "pages/dev/datatables";
	}
	
	@ResponseBody
	@RequestMapping(value = "/api/dev/datatables", method = RequestMethod.GET)
	private DevModel apiDevDatatables(DevModel devModel) {	
		System.out.println("searchName = " + devModel.getSearchName());
		System.out.println("searchGender = " + devModel.getSearchGender());
		
		devModel.setOrder();
		devModel.setRecordsTotal(devService.getDemoCount());
		devModel.setRecordsFiltered(devService.getDemoCount());
		devModel.setData(devService.getDemoData(devModel));
		return devModel;
	}
	
	@RequestMapping(value = "/dev/springSecurity", method = RequestMethod.GET)
	private String renderDevSpringSecurity() {
		return "pages/dev/springSecurity";
	}
	
	@RequestMapping(value = "/dev/springSecurityAdmin", method = RequestMethod.GET)
	private String renderDevSpringSecurityAdmin() {
		return "pages/dev/springSecurity";
	}
}
