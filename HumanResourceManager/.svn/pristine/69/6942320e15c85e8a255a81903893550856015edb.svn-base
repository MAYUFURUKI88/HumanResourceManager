package com.rapideact.local.humanresource.controller.sample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SampleController {
	
	@RequestMapping(value="/sample/layout", method=RequestMethod.GET)
	private String renderSampleSplit(Model model) {
		model.addAttribute("message", "Hello Thymeleaf!!");
		return "pages/sample/simple";
	}
}