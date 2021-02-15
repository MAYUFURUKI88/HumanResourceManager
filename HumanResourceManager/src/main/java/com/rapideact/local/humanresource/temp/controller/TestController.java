//package com.rapideact.local.humanresource.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import com.rapideact.local.humanresource.common.Statics;
//import com.rapideact.local.humanresource.dto.TestDto;
//import com.rapideact.local.humanresource.model.TestModel;
//
///**
// * テスト用のコントローラクラス
// */
//@Controller
//public class TestController {
//
//	@Autowired
//	private  TestModel testModel;
//
//	/**
//	 * テスト用の画面に遷移する。
//	 *
//	 * @param id リクエストパラメータ
//	 * @param model Model
//	 * @return view名
//	 */
//    @RequestMapping(value="/test")
//    private String hello(@RequestParam(defaultValue = "0") int id, Model model){
//
//    	TestDto result = testModel.search(id);
//    	model.addAttribute("result", result);
//        return Statics.url_test;
//    }
//}
