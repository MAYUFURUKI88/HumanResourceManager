//
//package com.rapideact.local.humanresource.controller;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.validation.ObjectError;
//import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.mvc.support.RedirectAttributes;
//
//import com.rapideact.local.humanresource.common.Statics;
//import com.rapideact.local.humanresource.dto.EmployeesSearchDto;
//
///**
// * 検索画面コントローラクラス
// *
// */
//
//@Controller
//public class EmployeesSearchController {
//
//	/**
//	 * 検索画面に遷移する
//	 * @param model
//	 * @return view名
//	 */
//
//	@RequestMapping(value="/employeesSearch",method=RequestMethod.GET)
//	private String toSearch(Model model) {
//		model.addAttribute("employeesSearchDto", new EmployeesSearchDto());
//
//		return Statics.url_employees_search;
//	}
//	/**
//	 * このメソッドは応募者検索結果画面に遷移する
//	 * @param redirectAttributes リダイレクト
//	 * @param searchDto 検索情報
//	 * @param result BindingResult
//	 * @param model Model
//	 * @return view名
//	 */
//	@RequestMapping(value="/employeesSearch",method=RequestMethod.POST)
//	private String toSear(RedirectAttributes redirectAttributes,@Validated @ModelAttribute EmployeesSearchDto employeesSearchDto, BindingResult result) {
//		//入力値チェック
//
//		if (result.hasErrors()) {
//			List<String> errorList = new ArrayList<String>();
//			for (ObjectError error : result.getAllErrors()) {
//				errorList.add(error.getDefaultMessage());
//			}
//			//エラーがあった場合、検索画面にリダイレクトする
//			redirectAttributes.addFlashAttribute("validationError",errorList);
//
//			return "redirect:" + Statics.url_employees_search;
//		}
//		return Statics.url_employees_search;
//	}
//}
