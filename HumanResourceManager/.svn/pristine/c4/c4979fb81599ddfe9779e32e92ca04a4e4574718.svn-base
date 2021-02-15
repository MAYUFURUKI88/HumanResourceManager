//package com.rapideact.local.humanresource.mapper;
//
//import static org.junit.Assert.*;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.ActiveProfiles;
//import org.springframework.test.context.TestExecutionListeners;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
//import org.springframework.test.context.transaction.TransactionalTestExecutionListener;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.github.springtestdbunit.DbUnitTestExecutionListener;
//import com.github.springtestdbunit.annotation.DatabaseSetup;
//import com.github.springtestdbunit.annotation.DbUnitConfiguration;
//import com.github.springtestdbunit.annotation.ExpectedDatabase;
//import com.github.springtestdbunit.assertion.DatabaseAssertionMode;
//import com.rapideact.local.humanresource.CsvDataSetLoader;
//import com.rapideact.local.humanresource.mybatis.condition.TestCondition;
//import com.rapideact.local.humanresource.mybatis.domain.TestDomain;
//import com.rapideact.local.humanresource.mybatis.mapper.TestMapper;
//
///**
// * テストマッパーのテスト
// */
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest
//@TestExecutionListeners({
//    DependencyInjectionTestExecutionListener.class,
//    TransactionalTestExecutionListener.class,
//    DbUnitTestExecutionListener.class
//})
//@DbUnitConfiguration(dataSetLoader = CsvDataSetLoader.class)
//@ActiveProfiles("test")
//@Transactional
//public class TestMapperTests {
//
//	private final String SETUP_PATH = "/com/rapideact/local/humanresource/testMapper/";
//	private final String EXPECTED_PATH = "/com/rapideact/local/humanresource/testMapperResult/";
//
//	@Autowired
//	TestMapper target;
//
//    @Test
//    @DatabaseSetup(value = SETUP_PATH)
//    public void test1() throws Exception {
//    	TestCondition testCondition= new TestCondition();
//    	testCondition.setId(1);
//    	TestDomain testDomain = target.testSearch(testCondition);
//    	assertEquals("テスト", testDomain.getName());
//    }
//
//    @Test
//    @DatabaseSetup(value = SETUP_PATH)
//    public void test2() throws Exception {
//    	TestCondition testCondition= new TestCondition();
//    	testCondition.setId(0);
//    	TestDomain testDomain = target.testSearch(testCondition);
//    	assertEquals(null, testDomain);
//    }
//
//    @Test
//    @DatabaseSetup(value = SETUP_PATH)
//    @ExpectedDatabase(value = EXPECTED_PATH, assertionMode = DatabaseAssertionMode.NON_STRICT)
//    public void test3() throws Exception {
//    	TestCondition testCondition= new TestCondition();
//    	testCondition.setId(1);
//    	target.testSearch(testCondition);
//    }
//}
