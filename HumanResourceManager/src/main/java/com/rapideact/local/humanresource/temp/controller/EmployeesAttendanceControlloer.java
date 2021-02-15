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
//import com.rapideact.local.humanresource.dto.EmployeesAttendanceDto;
//import com.rapideact.local.humanresource.dto.EmployeesSearchDto;
//import com.rapideact.local.humanresource.model.EmployeesAttendanceModel;
//
///**
// * Registerコントローラクラス
// *
// */
//// @Controller
//public class EmployeesAttendanceControlloer {
//
//	// @Autowired
//	EmployeesAttendanceModel employeesAttendanceModel;
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
//	@RequestMapping(value = "/employeesAttendance/{result_id}", method = RequestMethod.GET)
//	private String result(@ModelAttribute EmployeesSearchDto employeesSearchDto, Model model,
//			@PathVariable Integer result_id) {
//
//		List<EmployeesAttendanceDto> result = employeesAttendanceModel.employeesSearch(employeesSearchDto);
//		List<EmployeesAttendanceDto> onePageResult = new ArrayList<EmployeesAttendanceDto>();
//		List<Integer> pageNumber = new ArrayList<Integer>();
//
//		int count = result.size();
//		Integer number = new Integer(0);
//		int ago = 1;
//		int behind = 1;
//		int listNumber = 10;
//		int listNumberIndex = (result_id - 1) * 10;
//
//		//一覧に表示するデータが10件以下の場合は、除算して格納する数を決める
//		if (listNumberIndex + 10 > count) {
//			listNumber = count % 10;
//		}
//
//		//10件または除算した分のデータを格納
//		for (int i = 0; i < listNumber; i++) {
//			onePageResult.add(result.get(i + listNumberIndex));
//		}
//
//		int countFlg = 0;
//		//ページングの数を5つに制限
//		if (result_id <= 5) {
//			if (((count - 1) / 10) > 5) {
//				countFlg = 4;
//			} else {
//				countFlg = (count - 1) / 10;
//			}
//			for (int i = 0; i <= countFlg; i++) {
//				pageNumber.add(i + 1);
//			}
//		}
//
//		else if (result_id >= (count / 10) - 4) {
//			pageNumber.add((count / 10) - 3);
//			pageNumber.add((count / 10) - 2);
//			pageNumber.add((count / 10) - 1);
//			pageNumber.add((count / 10));
//			pageNumber.add((count / 10) + 1);
//		} else {
//			pageNumber.add(result_id - 2);
//			pageNumber.add(result_id - 1);
//			pageNumber.add(result_id);
//			pageNumber.add(result_id + 1);
//			pageNumber.add(result_id + 2);
//		}
//
//		//ページング前後処理
//		if ((result_id - 5) > 1) {
//			ago = result_id - 5;
//		}
//
//		if ((result_id + 5) < (count / 10)) {
//			behind = result_id + 5;
//		} else {
//			behind = ((count - 1) / 10) + 1;
//		}
//
//		//全体のページ数
//		int resultPageFrom = count / 10 + 1 | 0;
//
//		model.addAttribute("result", onePageResult);
//		model.addAttribute("count", count);
//		model.addAttribute("linkNumbers", pageNumber);
//		model.addAttribute("ago", ago);
//		model.addAttribute("behind", behind);
//		model.addAttribute("resultPageTo", result_id);
//		model.addAttribute("resultPageFrom", resultPageFrom);
//		return Statics.url_employees_attendance;
//	}
//
//	/**
//	 * 削除機能
//	 *
//	 * @param delete_ids リクエストパラメータ
//	 * @param model Model
//	 * @return result
//	 */
//	@RequestMapping(value = "/employeesAttendance"
//			+ "", method = RequestMethod.POST)
//	private String delete(RedirectAttributes redirectAttributes,
//			@RequestParam(name = "delete_ids", required = false) String[] delete_ids, Model model) {
//		if (delete_ids != null) {
//			employeesAttendanceModel.delete(delete_ids);
//			return "redirect:" + "/employeesAttendance/1";
//		}
//		//登録処理後メッセージ表示
//		redirectAttributes.addFlashAttribute("error_message", "削除する応募者を選択してください。");
//		return "redirect:" + "/employeesAttendance/1";
//	}
//
//}
