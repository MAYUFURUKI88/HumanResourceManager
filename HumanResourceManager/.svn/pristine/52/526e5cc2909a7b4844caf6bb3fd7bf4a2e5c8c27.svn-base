//
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
//import org.springframework.web.servlet.mvc.support.RedirectAttributes;
//
//import com.rapideact.local.humanresource.common.Statics;
//import com.rapideact.local.humanresource.dto.SearchDto;
//import com.rapideact.local.humanresource.model.ResultModel;
//
///**
// * 検索画面コントローラクラス
// *
// */
//
//@Controller
//public class SearchController {
//	@Autowired
//	ResultModel resultModel;
//	/**
//	 * 検索画面に遷移する
//	 * @param model
//	 * @param selectionMap
//	 * @return view名
//	 *
//	 */
//
//	@RequestMapping(value="/search",method=RequestMethod.GET)
//
//	private String toSearch(Model model, Object selection1Map) {
//
////		Map<String,String> selectionCodeMap = resultModel.selectionCode();
////		Map<String,String> hopeJobCodeMap = resultModel.hopeJobCode();
////		Map<String,String> mediumCodeMap = resultModel.mediumCode();
//
////		model.addAttribute("searchDto", new SearchDto());
////		model.addAttribute("selectionCodeMap",selectionCodeMap);
////		model.addAttribute("hopeJobCodeMap",hopeJobCodeMap);
////		model.addAttribute("mediumCodeMap",mediumCodeMap);
//
//		return Statics.url_search;
//	}
//	/**
//	 * このメソッドは応募者検索結果画面に遷移する
//	 * @param redirectAttributes リダイレクト
//	 * @param searchDto 検索情報
//	 * @param result BindingResult
//	 * @param model Model
//	 * @return view名
//	 */
//	@RequestMapping(value="/search",method=RequestMethod.POST)
//	private String toSear(RedirectAttributes redirectAttributes,@Validated @ModelAttribute SearchDto searchDto, BindingResult result) {
//		//入力値チェック
//
//		if (result.hasErrors()) {
//			List<String> errorList = new ArrayList<String>();
//			for (ObjectError error : result.getAllErrors()) {
//				errorList.add(error.getDefaultMessage());
//			}
//
//
//			//register画面に戻る
//
//			//エラーがあった場合、検索画面にリダイレクトする
//			redirectAttributes.addFlashAttribute("validationError",errorList);
//
//			return "redirect:" + Statics.url_search;
//		}
//		return Statics.url_result;
//	}
//}
