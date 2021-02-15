//
//package com.rapideact.local.humanresource.mapper;
//
//import static org.hamcrest.CoreMatchers.*;
//import static org.junit.Assert.*;
//
//import java.util.List;
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
//import com.rapideact.local.humanresource.mybatis.condition.UserCondition;
//import com.rapideact.local.humanresource.mybatis.domain.UserDomain;
//import com.rapideact.local.humanresource.mybatis.mapper.UserMapper;
//
///**
// * ユーザーテストマッパーのテスト
// */
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest
//@TestExecutionListeners({
//	DependencyInjectionTestExecutionListener.class,
//	TransactionalTestExecutionListener.class,
//	DbUnitTestExecutionListener.class,
//})
//@ActiveProfiles("test")
//@DbUnitConfiguration(dataSetLoader = CsvDataSetLoader.class)
//@Transactional
//
//public class UserdeleteMapperTests {
//
//	private final String SETUP_PATH2 = "/com/rapideact/local/humanresource/userdeleteMapper2/";
//
//	private final String SETUP_PATH3="/com/rapideact/local/humanresource/userdeleteMapperResult3/";
//	private final String EXPECTED_PATH3= "/com/rapideact/local/humanresource/userdeleteMapperResult3/";
//
//
//
//	@Autowired
//	UserMapper target;
//
//	@Test
//	@DatabaseSetup(value = SETUP_PATH2)
//	public void test1() throws Exception {
//
//		List<UserDomain> userDomainList=target.selectAll();
//		assertThat(userDomainList.size(),is(1));
//		assertThat(userDomainList.get(0).getId(),is(1));
//	}
//
//	/**
//	 *登録したパラメータが削除されているかテスト
//	 */
//	@Test
//	@DatabaseSetup(value = SETUP_PATH3)
//	@ExpectedDatabase(value = EXPECTED_PATH3, assertionMode = DatabaseAssertionMode.NON_STRICT)
//	public void test2() throws Exception {
//		UserCondition param = new UserCondition();
//
//		param.setId(1);//削除対象者を設定
//		target.userDelete(param);//ユーザーを削除
//	}
//
//}