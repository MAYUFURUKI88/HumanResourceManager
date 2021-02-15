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
//	DbUnitTestExecutionListener.class
//})
//@ActiveProfiles("test")
//@DbUnitConfiguration(dataSetLoader = CsvDataSetLoader.class)
//@Transactional
//
//public class UserMapperTests {
//
//	private final String SETUP_PATH = "/com/rapideact/local/humanresource/userMapper/";
//	private final String EXPECTED_PATH = "/com/rapideact/local/humanresource/userMapperResult/";
//	@Autowired
//	UserMapper target;
//
//	/**
//	 *登録されたデータが検索して取得できているかテスト
//	 */
//	@Test
//	@DatabaseSetup(value = SETUP_PATH)
//	public void test1() throws Exception{
//		List<UserDomain> userlist;//ユーザーを格納するリスト
//		userlist = target.selectAll();
//
//		assertThat(userlist.get(0).getMail(),is("test@rapide-act.com"));
//		assertThat(userlist.get(0).getPassword(),is("2222"));
//		assertThat(userlist.get(0).getPrivilegeCode(),is("001001"));
//	}
//
//
//
//	/**
//	 *登録したパラメータが登録されているかテスト
//	 */
//	@Test
//	@DatabaseSetup(value = SETUP_PATH)
//	@ExpectedDatabase(value = EXPECTED_PATH, assertionMode = DatabaseAssertionMode.NON_STRICT)
//	public void test2() throws Exception {
//		UserCondition param = new UserCondition();
//
//		param.setMail("test2@rapide-act.com");//登録するユーザーを取得
//		param.setPassword("2222");
//		param.setPrivilegeCode("001001");
//		target.userCreate(param);//ユーザーを登録
//	}
//}