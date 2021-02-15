//package com.rapideact.local.humanresource.controller;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
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
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.mvc.support.RedirectAttributes;
//
//import com.rapideact.local.humanresource.common.Statics;
//import com.rapideact.local.humanresource.dto.UserDto;
//import com.rapideact.local.humanresource.model.UserRegisterModel;
//
///**
// Registerコントローラクラス
// */
//
//@Controller
//public class UserController {
//
//	@Autowired
//	UserRegisterModel userRegisterModel;
//
//	/**
//	 * 登録画面に遷移する
//	 * @param model モデル
//	 * @param message 登録可否メッセージ
//	 * @return view名
//	 */
//	@RequestMapping(value = "/user", method = RequestMethod.GET)
//	private String toUser(@RequestParam(name = "message", required = false) String message, Model model) {
//		//htmlにオブジェクトを渡す。
//		Map<String, String> privilegeCodeMap = userRegisterModel.privilegeCode();
//		model.addAttribute("message", message);
//		model.addAttribute("userdto", new UserDto());
//		model.addAttribute("privilegeCodeMap", privilegeCodeMap);
//		return Statics.url_user;
//	}
//
//	/**
//	 * 入力した情報を処理し/user(今のページ)にリダイレクする
//	 * @param redirectAttributes リダイレクト
//	 * @param userdto ユーザー情報
//	 * @param model Model
//	 * @param result BindingResult
//	 * @return view名
//	 */
//	@RequestMapping(value = "/user", method = RequestMethod.POST)
//	private String userCreate(RedirectAttributes redirectAttributes, @Validated @ModelAttribute UserDto userdto,
//			BindingResult result, Model model) {
//		//入力値チェック
//		if (result.hasErrors()) {
//			List<String> erroList = new ArrayList<String>();
//			for (ObjectError error : result.getAllErrors()) {
//				erroList.add(error.getDefaultMessage());
//			}
//			//エラーがあった場合、登録画面にリダイレクトする
//			redirectAttributes.addFlashAttribute("validationError", erroList);
//			return "redirect:" + Statics.url_user;
//		}
//		//入力したユーザーを登録し、登録成功かどうかで表示分岐
//		if (userRegisterModel.userCreate(userdto)) {
//
//			redirectAttributes.addFlashAttribute("success_message", "登録されました");
//
//		} else {
//
//			redirectAttributes.addFlashAttribute("success_message", "既に登録されているユーザーです");
//		}
//
//		return "redirect:" + Statics.url_user;
//
//	}
//}