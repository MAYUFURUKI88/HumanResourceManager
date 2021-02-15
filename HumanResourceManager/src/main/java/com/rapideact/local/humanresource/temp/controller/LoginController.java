//package com.rapideact.local.humanresource.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import com.rapideact.local.humanresource.common.Statics;
//import com.rapideact.local.humanresource.dto.LoginDto;
//import com.rapideact.local.humanresource.model.RegisterModel;
//
///**
// * Loginコントローラクラス
// */
//@Controller
//public class LoginController {
//
//	@Autowired
//	RegisterModel registerModel;
//
//	/**
//	 * ログイン画面に遷移する。
//	 * @return view名
//	 */
//	@RequestMapping(value = "/login", method = RequestMethod.GET)
//	private String toLogin(Model model) {
//
//		model.addAttribute("loginDto", new LoginDto());
//		return Statics.url_login;
//	}
//
//	/**
//	 * ログイン処理
//	 */
//	@RequestMapping(value = "/login", method = RequestMethod.POST)
//	private String doLogin(@ModelAttribute LoginDto loginDto, Model model) {
//		return Statics.url_top;
//	}
//
//}
