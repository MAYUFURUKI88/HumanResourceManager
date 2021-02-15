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
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.mvc.support.RedirectAttributes;
//
//import com.rapideact.local.humanresource.common.Statics;
//import com.rapideact.local.humanresource.dto.EmployeesDetailDto;
//import com.rapideact.local.humanresource.model.EmployeesDetailModel;
//
///**
// * Detailコントローラクラス
// * 応募者の情報を修正する
// */
//@Controller
//public class EmployeesDetailController {
//
//	//Modelの操作も可能になる
//	@Autowired
//	EmployeesDetailModel employeesDetailModel;
//
//	/**
//	 * 情報修正画面表示メソッド
//	 * 情報修正画面(employeesDetail.html)を表示するメソッド
//	 * @param detail_id  result.htmlか、この画面から応募者のIDを取得
//	 * @param model EmployeesDetailDto
//	 * @return view名
//	 */
//	@RequestMapping(value = "/employeesDetail/{detail_id}", method = RequestMethod.GET)
//	private String show(@PathVariable Integer detail_id, Model model) {
//
//			//IDからそのほかの情報を取得する
//			EmployeesDetailDto result = employeesDetailModel.show(detail_id);
//			//resultに保存
//			model.addAttribute("result", result);
//
//		return Statics.url_employees_detail;
//	}
//
//	/**
//	 * 応募者情報更新メソッド
//	 * @param
//Dto ユーザー情報をDtoに渡す
//	 * @param model EmployeesDetailDto
//	 * @return リダイレクト
//	 */
//	@RequestMapping(value = "/employeesDetail", method = RequestMethod.POST)
//	//"@ModelAttribute"で上のメソッドから"result"を持ってくる
//	private String create(RedirectAttributes redirectAttributes, @Validated @ModelAttribute EmployeesDetailDto result,
//			BindingResult binding, Model model) {
//		//バリデーションチェック
//		if (binding.hasErrors()) {
//			List<String> errorList = new ArrayList<String>();
//			for (ObjectError error : binding.getAllErrors()) {
//				errorList.add(error.getDefaultMessage());
//			}
//			model.addAttribute("validationError",errorList);
//			model.addAttribute("result", result);
//
//			return Statics.url_employees_detail;
//		}
//		//入力された応募者情報に更新
//		employeesDetailModel.create(result);
//		//応募者情報を画面に表示
//		model.addAttribute("result", result);
//		//更新処理後メッセージ表示
//		model.addAttribute("getMessage","修正完了しました。");
//
//		return Statics.url_employees_detail;
//	}
//
//}
