//package com.rapideact.local.humanresource.model;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import com.rapideact.local.humanresource.dto.TestDto;
//import com.rapideact.local.humanresource.mybatis.condition.TestCondition;
//import com.rapideact.local.humanresource.mybatis.domain.TestDomain;
//import com.rapideact.local.humanresource.services.TestService;
//
//import lombok.Data;
//
///**
// * テスト用のモデルクラス
// */
//@Data
//@Component
//public class TestModel {
//
//	@Autowired
//	private TestService testService;
//
//	/**
//	 * 検索業務ロジック
//	 * @param id リクエストパラメータ
//	 * @return testEntity 結果保持クラス
//	 */
//	public TestDto search(int id) {
//
//		TestCondition param = new TestCondition();
//		param.setId(id);
//
//		TestDomain testDomain = testService.testSearch(param);
//		TestDto testDto = new TestDto();
//		if(testDomain != null) {
//			testDto.setName(testDomain.getName());
//		}
//		return testDto;
//	}
//
//}
//
