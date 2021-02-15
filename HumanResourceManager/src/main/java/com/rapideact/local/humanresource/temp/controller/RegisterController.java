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
//import com.rapideact.local.humanresource.dto.RegisterDto;
//import com.rapideact.local.humanresource.model.RegisterModel;
//
///**
// * Registerコントローラクラス
// */
//
//@Controller
//public class RegisterController {
//
//	@Autowired
//	RegisterModel registerModel;
//
//	/**
//	 * 登録画面に遷移する。
//	 * @param model 空白registerDto
//	 * @return view名
//	 */
//
//	@RequestMapping(value = "/register", method = RequestMethod.GET)
//	private String toRegister(@RequestParam(name = "message", required = false) String message, Model model) {
//		Map<String, String> selectionCodeMap = registerModel.selectionCode();
//		Map<String, String> hopeJobCodeMap = registerModel.hopeJobCode();
//		Map<String, String> mediumCodeMap = registerModel.mediumCode();
//		Map<String, String> experienceCodeMap = registerModel.experienceCode();
//		Map<String, String> mailCodeMap = registerModel.mailCode();
//		model.addAttribute("message", message);
//		if (!model.containsAttribute("registerDto")) {
//			model.addAttribute("registerDto", new RegisterDto());
//		}
//		model.addAttribute("selectionCodeMap", selectionCodeMap);
//		model.addAttribute("hopeJobCodeMap", hopeJobCodeMap);
//		model.addAttribute("mediumCodeMap", mediumCodeMap);
//		model.addAttribute("experienceCodeMap", experienceCodeMap);
//		model.addAttribute("mailCodeMap", mailCodeMap);
//
//		return Statics.url_register;
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
//	@RequestMapping(value = "/register", method = RequestMethod.POST)
//	private String userCreate(RedirectAttributes redirectAttributes, @Validated @ModelAttribute RegisterDto registerDto,
//			@RequestParam(name = "flg", required = false) String flg,
//			BindingResult result, Model model) {
//
//		if (result.hasErrors()) {
//			List<String> errorList = new ArrayList<String>();
//			for (ObjectError error : result.getAllErrors()) {
//				errorList.add(error.getDefaultMessage());
//			}
//
//			redirectAttributes.addAttribute("validationError", errorList);
//			Map<String, String> selectionCodeMap = registerModel.selectionCode();
//			Map<String, String> hopeJobCodeMap = registerModel.hopeJobCode();
//			Map<String, String> mediumCodeMap = registerModel.mediumCode();
//			Map<String, String> experienceCodeMap = registerModel.experienceCode();
//			Map<String, String> mailCodeMap = registerModel.mailCode();
//
//			model.addAttribute("result", result);
//			model.addAttribute("registerDto", new RegisterDto());
//			model.addAttribute("selectionCodeMap", selectionCodeMap);
//			model.addAttribute("hopeJobCodeMap", hopeJobCodeMap);
//			model.addAttribute("mediumCodeMap", mediumCodeMap);
//			model.addAttribute("experienceCodeMap", experienceCodeMap);
//			model.addAttribute("mailCodeMap", mailCodeMap);
//			//register画面に戻る
//			return "redirect:" + Statics.url_register;
//		}
//
////		if(registerDto.isSameNamePermited()) { //todo dtoから許可フラグをもらい判定
////			registerModel.registerForcibly(registerDto);
////			redirectAttributes.addAttribute("success_flg", "0");
////			redirectAttributes.addAttribute("success_message", "登録が完了しました");
////			return "redirect:" + Statics.url_register;
////		}
//
//		//登録処理後メッセージ表示
//		if(registerModel.createApplicant(registerDto)) {
//			redirectAttributes.addAttribute("success_flg", "0");
//			redirectAttributes.addAttribute("success_message", "登録が完了しました");
//		} else {
//			//redirectAttributes.addAttribute("success_message", "既に登録されているユーザーです");
//			redirectAttributes.addAttribute("success_flg", "1");
//			redirectAttributes.addAttribute("success_message", "既に同姓同名のユーザーが登録されています。登録しますか。");
//			redirectAttributes.addFlashAttribute("registerDto",registerDto);
//		}
//
//		//register画面に遷移する
//		return "redirect:" + Statics.url_register;
//	}
//
//}
