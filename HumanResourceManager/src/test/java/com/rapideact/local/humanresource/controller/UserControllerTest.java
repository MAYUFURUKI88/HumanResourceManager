//package com.rapideact.local.humanresource.controller;
//
//import static org.hamcrest.CoreMatchers.*;
//import static org.junit.Assert.*;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.TestExecutionListeners;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
//import org.springframework.test.context.transaction.TransactionalTestExecutionListener;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//import org.springframework.transaction.annotation.Transactional;
//import org.springframework.validation.BindException;
//import org.springframework.validation.BindingResult;
//import org.springframework.validation.Validator;
//import org.springframework.web.servlet.view.InternalResourceViewResolver;
//
//import com.github.springtestdbunit.DbUnitTestExecutionListener;
//import com.rapideact.local.humanresource.common.Statics;
//import com.rapideact.local.humanresource.dto.UserDto;
//
///**
// * Userコントローラーのテストクラス
// */
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest
//@TestExecutionListeners({
//		DependencyInjectionTestExecutionListener.class,
//		TransactionalTestExecutionListener.class,
//		DbUnitTestExecutionListener.class
//})
//@Transactional
//public class UserControllerTest {
//	private MockMvc mockMvc;
//
//	private UserDto testDto = new UserDto();
//	private BindingResult bindingResult = new BindException(testDto, "UserDto");
//
//	@Autowired
//	Validator validator;
//
//	@Autowired
//	UserController target;
//
//	@Before
//	public void setup() {
//		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
//		resolver.setPrefix("/templates/");
//		resolver.setSuffix(".html");
//		mockMvc = MockMvcBuilders.standaloneSetup(target).setViewResolvers(resolver).build();
//	}
//
//	/**
//	 * GETでリクエストされたとき
//	 * user.htmlに遷移するか
//	 */
//	@Test
//	public void test1() throws Exception {
//		mockMvc.perform(get("/user")).andExpect(view().name("user"));
//	}
//
//	/**
//	 *POSTでリダイレクトされたとき
//	 *user.htmlにリダイレクトするかテスト
//	 */
//	@Test
//	public void test2() throws Exception {
//
//		testDto.setMail("test@rapide-act.com");
//		testDto.setPassword("111");
//		testDto.setPrivilegeCode("001001");
//
//		mockMvc.perform((post("/user")).flashAttr("userDto", testDto)).andExpect(view().name("redirect:user"));
//	}
//
//	/**
//	 *リダイレクトされた時に、正しく登録された場合
//	 *「登録されました」というメッセージが
//	 */
//	@Test
//	public void test3() throws Exception {
//
//		testDto.setMail("est@rapide-act.com");
//		testDto.setPassword("111");
//		testDto.setPrivilegeCode("001001");
//
//		mockMvc.perform((post("/user")).flashAttr("userDto", testDto)).andExpect(view().name(Statics.url_user))
//		.andExpect(flash().attribute("success_message", "登録されました"));
//	}
//
//	/**
//	 *リダイレクトされた時に、既に登録されているユーザーだった場合メッセージが出るかテスト
//	 */
//	@Test
//	public void test4() throws Exception {
//		UserDto testDto = new UserDto();
//		testDto.setMail("test@rapide-act.com");
//		testDto.setPassword("111");
//		testDto.setPrivilegeCode("001001");
//
//		mockMvc.perform((post("/user")).flashAttr("userDto", testDto)).andExpect(view().name("redirect:user"))
//				.andExpect(flash().attribute("success_message", "既に登録されているユーザーです"));
//
//	}
//
//	/**
//	 * バリデーション通過した時のテスト
//	 */
//	@Test
//	public void test5() {
//		testDto.setMail("test@rapide-act.com");
//		testDto.setPassword("111");
//		testDto.setPrivilegeCode("001001");
//
//		validator.validate(testDto, bindingResult);
//		assertThat(bindingResult.getFieldError(), is(nullValue()));
//	}
//
//	/**
//	 * メールアドレスがNULLの時のテスト
//	 */
//	@Test
//	public void test6() {
//		testDto.setMail(null);
//		testDto.setPassword("111");
//		testDto.setPrivilegeCode("001001");
//
//		validator.validate(testDto, bindingResult);
//		assertThat(bindingResult.getFieldError().getField(), is("mail"));
//		assertThat(bindingResult.getFieldError().getDefaultMessage(), is("メールアドレスは必須です。"));
//
//	}
//
//	/**
//	 * パスワードがNULLの時のテスト
//	 */
//	@Test
//	public void test7() {
//		testDto.setMail("test@rapide-act.com");
//		testDto.setPassword(null);
//		testDto.setPrivilegeCode("001001");
//
//		validator.validate(testDto, bindingResult);
//		assertThat(bindingResult.getFieldError().getField(), is("password"));
//		assertThat(bindingResult.getFieldError().getDefaultMessage(), is("パスワードは必須です。"));
//
//	}
//
//	/**
//	 * メールアドレスが50文字以上の時のテスト
//	 */
//	@Test
//	public void test8() {
//
//		testDto.setMail("123456789@123456789@123456789@123456789@123456789@1");
//		testDto.setPassword("aaa");
//		testDto.setPrivilegeCode("001001");
//
//		validator.validate(testDto, bindingResult);
//		assertThat(bindingResult.getFieldError().getField(), is("mail"));
//		assertThat(bindingResult.getFieldError().getDefaultMessage(), is("メールアドレスは50文字以内で入力してください。"));
//	}
//
//	/**
//	 * パスワードが20文字以上の時のテスト
//	 */
//	@Test
//	public void test9() {
//
//		testDto.setMail("test@rapide-act.com");
//		testDto.setPassword("aaaaaaaaaaaaaaaaaaaaaa");
//		testDto.setPrivilegeCode("001001");
//
//		validator.validate(testDto, bindingResult);
//		assertThat(bindingResult.getFieldError().getField(), is("password"));
//		assertThat(bindingResult.getFieldError().getDefaultMessage(), is("パスワードは20文字以内で入力してください。"));
//	}
//
//	/**
//	 * メールアドレスが空文字の時のテスト
//	 */
//	@Test
//	public void test10() {
//
//		testDto.setMail("");
//		testDto.setPassword("password");
//		testDto.setPrivilegeCode("001001");
//
//		validator.validate(testDto, bindingResult);
//		assertThat(bindingResult.getFieldError().getField(), is("mail"));
//		assertThat(bindingResult.getFieldError().getDefaultMessage(), is("メールアドレスは必須です。"));
//	}
//
//	/**
//	 * パスワードが空文字の時のテスト
//	 */
//	@Test
//	public void test11() {
//
//		testDto.setMail("test@rapide-act.com");
//		testDto.setPassword("");
//		testDto.setPrivilegeCode("001001");
//
//		validator.validate(testDto, bindingResult);
//		assertThat(bindingResult.getFieldError().getField(), is("password"));
//		assertThat(bindingResult.getFieldError().getDefaultMessage(), is("パスワードは必須です。"));
//	}
//}