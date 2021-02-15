//package com.rapideact.local.humanresource.controller;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
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
//import com.rapideact.local.humanresource.dto.EmployeesRegisterDto;
//import com.rapideact.local.humanresource.model.EmployeesRegisterModel;
//
///**
// * Registerコントローラクラス
// */
//@Controller
//public class EmployeesReportControlloer {
//
//	@Autowired
//	EmployeesRegisterModel employeesRegisterModel;
//
//	/**
//	 * 登録画面に遷移する。
//	 * @param model 空白registerDto
//	 * @return view名
//	 */
//	@RequestMapping(value = "/employeesReport", method = RequestMethod.GET)
//	private String toRegister(Model model) {
//		model.addAttribute("employeesRegisterDto", new EmployeesRegisterDto());
//
//		return Statics.url_employees_report;
//	}
//
//	/**
//	 *
//	 * @param redirectAttributes リダイレクト
//	 * @param registerDto 入力情報を受け取る
//	 * @param result 入力情報チェック結果
//	 * @param model 入力情報を渡す
//	 * @return view名
//	 */
//
//	@RequestMapping(value = "/employeesReport", method = RequestMethod.POST)
//	private String create(RedirectAttributes redirectAttributes, @Validated @ModelAttribute EmployeesRegisterDto employeesRegisterDto,
//			BindingResult result, Model model) {
//		if (result.hasErrors()) {
//
//			List<String> errorList = new ArrayList<String>();
//			for (ObjectError error : result.getAllErrors()) {
//				errorList.add(error.getDefaultMessage());
//			}
//			model.addAttribute("validationError", errorList);
//			//register画面に戻る
//			return Statics.url_employees_report;
//		}
//
//		employeesRegisterModel.create(employeesRegisterDto);
//		//登録処理後メッセージ表示
//		redirectAttributes.addFlashAttribute("success_message", "登録完了しました。");
//
//		//register画面に遷移する
//		return "redirect:" + Statics.url_employees_report;
//
//	}
//
//}
