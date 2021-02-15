//package com.rapideact.local.humanresource.services;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.rapideact.local.humanresource.mybatis.condition.TestCondition;
//import com.rapideact.local.humanresource.mybatis.domain.TestDomain;
//import com.rapideact.local.humanresource.mybatis.mapper.TestMapper;
//
///**
// * テスト用のサービスクラス
// */
//@Service
//public class TestService implements TestServiceInterface {
//
//	@Autowired
//	TestMapper testMapper;
//
//	/**
//	 * 検索処理
//	 * @param param Test検索条件クラス
//	 * @return Test検索結果
//	 */
//	public  TestDomain testSearch(TestCondition param) {
//		return testMapper.testSearch(param);
//	};
//}
