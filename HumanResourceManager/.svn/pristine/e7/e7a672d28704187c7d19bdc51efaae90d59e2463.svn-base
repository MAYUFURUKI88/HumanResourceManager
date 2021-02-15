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
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.mvc.support.RedirectAttributes;
//
//import com.rapideact.local.humanresource.common.Statics;
//import com.rapideact.local.humanresource.dto.DetailDto;
//import com.rapideact.local.humanresource.model.DetailModel;
//
///**
// * Detailコントローラクラス
// * 応募者の情報を修正する
// */
//@Controller
//public class DetailController {
//
//	//Modelの操作も可能になる
//	@Autowired
//	DetailModel detailModel;
//
//	/**
//	 * 情報修正画面表示メソッド
//	 * 情報修正画面(fix.html)を表示するメソッド
//	 * @param fix_id  result.htmlか、この画面から応募者のIDを取得
//	 * @param model fixDto
//	 * @return view名
//	 */
//	@RequestMapping(value = "/detail/{detail_id}", method = RequestMethod.GET)
//	private String show(@PathVariable Integer detail_id, Model model) {
//
//		//IDからそのほかの情報を取得する
//		DetailDto result = detailModel.show(detail_id);
//
//		Map<String, String> selectionCodeMap = detailModel.selectionCode();
//		Map<String, String> hopeJobCodeMap = detailModel.hopeJobCode();
//		Map<String, String> mediumCodeMap = detailModel.mediumCode();
//		Map<String, String> experienceCodeMap = detailModel.experienceCode();
//		Map<String, String> mailCodeMap = detailModel.mailCode();
//
//		//resultに保存
//		model.addAttribute("result", result);
//		model.addAttribute("detailDto", new DetailDto());
//		model.addAttribute("selectionCodeMap", selectionCodeMap);
//		model.addAttribute("hopeJobCodeMap", hopeJobCodeMap);
//		model.addAttribute("mediumCodeMap", mediumCodeMap);
//		model.addAttribute("experienceCodeMap", experienceCodeMap);
//		model.addAttribute("mailCodeMap", mailCodeMap);
//		return Statics.url_detail;
//	}
//
//	/**
//	 * 応募者情報更新メソッド
//	 * @param fixDto ユーザー情報をDtoに渡す
//	 * @param model fixDto
//	 * @return リダイレクト
//	 */
//	@RequestMapping(value = "/detail", method = RequestMethod.POST)
//	//"@ModelAttribute"で上のメソッドから"result"を持ってくる
//	private String create(RedirectAttributes redirectAttributes, @Validated @ModelAttribute DetailDto result,
//			BindingResult binding, Model model) {
//		//バリデーションチェック
//		if (binding.hasErrors()) {
//			List<String> errorList = new ArrayList<String>();
//			for (ObjectError error : binding.getAllErrors()) {
//				errorList.add(error.getDefaultMessage());
//
//			}
//			model.addAttribute("validationError", errorList);
//			Map<String, String> selectionCodeMap = detailModel.selectionCode();
//			Map<String, String> hopeJobCodeMap = detailModel.hopeJobCode();
//			Map<String, String> mediumCodeMap = detailModel.mediumCode();
//			Map<String, String> experienceCodeMap = detailModel.experienceCode();
//			Map<String, String> mailCodeMap = detailModel.mailCode();
//
//			model.addAttribute("result", result);
//			model.addAttribute("detailDto", new DetailDto());
//			model.addAttribute("selectionCodeMap", selectionCodeMap);
//			model.addAttribute("hopeJobCodeMap", hopeJobCodeMap);
//			model.addAttribute("mediumCodeMap", mediumCodeMap);
//			model.addAttribute("experienceCodeMap", experienceCodeMap);
//			model.addAttribute("mailCodeMap", mailCodeMap);
//			return Statics.url_detail;
//		}
//		//入力された応募者情報に更新
//		detailModel.create(result);
//		//応募者情報を画面に表示
//		model.addAttribute("result", result);
//		Map<String, String> selectionCodeMap = detailModel.selectionCode();
//		Map<String, String> hopeJobCodeMap = detailModel.hopeJobCode();
//		Map<String, String> mediumCodeMap = detailModel.mediumCode();
//		Map<String, String> experienceCodeMap = detailModel.experienceCode();
//		Map<String, String> mailCodeMap = detailModel.mailCode();
//
//		model.addAttribute("result", result);
//		model.addAttribute("detailDto", new DetailDto());
//		model.addAttribute("selectionCodeMap", selectionCodeMap);
//		model.addAttribute("hopeJobCodeMap", hopeJobCodeMap);
//		model.addAttribute("mediumCodeMap", mediumCodeMap);
//		model.addAttribute("experienceCodeMap", experienceCodeMap);
//		model.addAttribute("mailCodeMap", mailCodeMap);
//		//更新処理後メッセージ表示
//		model.addAttribute("getMessage", "修正完了しました。");
//
//		return Statics.url_detail;
//	}
//
//}
