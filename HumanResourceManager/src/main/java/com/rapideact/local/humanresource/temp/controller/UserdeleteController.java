//
//package com.rapideact.local.humanresource.controller;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.mvc.support.RedirectAttributes;
//
//import com.rapideact.local.humanresource.common.Statics;
//import com.rapideact.local.humanresource.dto.UserdeleteDto;
//import com.rapideact.local.humanresource.model.UserResultModel;
//
///**
// * 管理者削除画面コントローラクラス
// */
//@Controller
//public class UserdeleteController {
//	//画面確認用コントローラ 完成したら消す
//	//	@RequestMapping(value = "/userdelete", method = RequestMethod.GET)
//	//	private String userDelete() {
//	//		return Statics.url_userdelete;
//	//	}
//
//	@Autowired
//	UserResultModel userResultModel;
//
//	/**
//	 * 管理者削除画面に遷移する
//	 * @param model model
//	 * @return view名
//	 */
//	@RequestMapping(value = "/userdelete/{userdelete_id}", method = RequestMethod.GET)
//	private String userDelete(@ModelAttribute UserdeleteDto userdeleteDto, Model model,
//			@PathVariable Integer userdelete_id) {
//
//		List<UserdeleteDto> userdelete = userResultModel.search();
//
//		int userResultCount = userdelete.size();
//		int listNumber = 10;
//		int listNumberIndex = (userdelete_id - 1) * 10;
//		//一覧に表示するデータが10件以下の場合は、除算して格納する数を決める
//		if (listNumberIndex + 10 > userResultCount) {
//			listNumber = userResultCount % 10;
//		}
//
//		List<UserdeleteDto> onePageResult = new ArrayList<UserdeleteDto>();
//		//10件または除算した分のデータを格納
//		for (int i = 0; i < listNumber; i++) {
//			onePageResult.add(userdelete.get(i + listNumberIndex));
//		}
//
//		int countFlg = 0;
//		List<Integer> pageNumber = new ArrayList<Integer>();
//		//ページングの数を5つに制限
//		if (userdelete_id <= 5) {
//			if (((userResultCount - 1) / 10) > 5) {
//				countFlg = 4;
//			} else {
//				countFlg = (userResultCount - 1) / 10;
//			}
//			for (int i = 0; i <= countFlg; i++) {
//				pageNumber.add(i + 1);
//			}
//		}
//
//		else if (userdelete_id >= (userResultCount / 10) - 4) {
//			pageNumber.add((userResultCount / 10) - 3);
//			pageNumber.add((userResultCount / 10) - 2);
//			pageNumber.add((userResultCount / 10) - 1);
//			pageNumber.add((userResultCount / 10));
//			pageNumber.add((userResultCount / 10) + 1);
//		} else {
//			pageNumber.add(userdelete_id - 2);
//			pageNumber.add(userdelete_id - 1);
//			pageNumber.add(userdelete_id);
//			pageNumber.add(userdelete_id + 1);
//			pageNumber.add(userdelete_id + 2);
//		}
//
//		int ago = 1;
//		//ページング前後処理
//		if ((userdelete_id - 5) > 1) {
//			ago = userdelete_id - 5;
//		} 
//		
//		int behind = 1;
//		if ((userdelete_id + 5) < (userResultCount / 10)) {
//			behind = userdelete_id + 5;
//		} else {
//			behind = ((userResultCount - 1) / 10) + 1;
//		}
//
//		//全体のページ数
//		int userdeletePageFrom = userResultCount / 10 + 1 | 0;
//		//htmlに渡す
//		model.addAttribute("userdelete", onePageResult);
//		model.addAttribute("count", userResultCount);
//		model.addAttribute("linkNumbers", pageNumber);
//		model.addAttribute("ago", ago);
//		model.addAttribute("behind", behind);
//		model.addAttribute("userdeletePageTo", userdelete_id);
//		model.addAttribute("userdeletePageFrom", userdeletePageFrom);
//		return Statics.url_userdelete;
//	}
//
//	/**
//	 * 削除機能
//	 * @param delete_ids リクエストパラメータ
//	 * @param model 削除するユーザーを渡す
//	 * @return view名
//	 */
//	@RequestMapping(value = "/userdelete", method = RequestMethod.POST)
//	private String delete(RedirectAttributes redirectAttributes,
//			@RequestParam(name = "delete_ids", required = false) String[] delete_ids, Model model) {
//		if (delete_ids != null) {
//			//チェック入れたユーザーを削除する
//			userResultModel.userdelete(delete_ids);
//			return "redirect:/userdelete/1";
//		}
//		//登録処理後メッセージ表示
//		redirectAttributes.addFlashAttribute("error_message", "削除する管理者を選択してください。");
//		return "redirect:/userdelete/1";
//	}
//}
