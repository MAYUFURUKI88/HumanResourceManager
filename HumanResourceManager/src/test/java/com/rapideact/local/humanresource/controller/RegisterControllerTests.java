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
//import com.rapideact.local.humanresource.dto.RegisterDto;
//
///**
// * Registerコントローラーのテスト
// */
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest
//@TestExecutionListeners({
//    DependencyInjectionTestExecutionListener.class,
//    TransactionalTestExecutionListener.class,
//    DbUnitTestExecutionListener.class
//})
//@Transactional
//public class RegisterControllerTests {
//
//	private MockMvc mockMvc;
//
//	private RegisterDto testDto = new RegisterDto();
//	private BindingResult bindingResult = new BindException(testDto, "RegisterDto");
//
//	@Autowired
//	Validator validator;
//
//	@Autowired
//	RegisterController target;
//
//	@Before
//	public void setup() {
//	    InternalResourceViewResolver resolver = new InternalResourceViewResolver();
//	    resolver.setPrefix("/templates/");
//	    resolver.setSuffix(".html");
//		mockMvc = MockMvcBuilders.standaloneSetup(target).setViewResolvers(resolver).build();
//
//	}
//	/**
//	 * regster.htmlに遷移するかテストする
//	 */
//    @Test
//    public void test1() throws Exception {
//    	mockMvc.perform(get("/register")).andExpect(view().name("register"));
//    }
//    /**
//	 * Postの処理が成功した時のテスト
//	 */
//
//    @Test
//    public void test2() throws Exception{
//
//    	testDto.setApplicationDate("2020-12-22");
//    	testDto.setSeiKj("山田");
//    	testDto.setMeiKj("孝之");
//    	testDto.setSeiKana("やまだ");
//    	testDto.setMeiKana("たかゆき");
//    	testDto.setBirthday("2020-12-22");
//    	testDto.setAge("18");
//    	testDto.setPhoneNumber("000-0000-0000");
//    	testDto.setGender("0");
//    	testDto.setSelectionCode("採用");
//    	testDto.setHopeJobCode("技術者");
//    	testDto.setMediumCode("ハローワーク");
//    	testDto.setAddress("福岡県福岡市");
//    	testDto.setMailCode("aaaaaaa@icloud.com");
//    	testDto.setCareer("0");
//    	testDto.setRemarks("111");
//
//    	String registerDto = null;
//    	mockMvc.perform((post("/register")).flashAttr("registerDto",testDto))
//    	.andExpect(view().name("redirect:register"))
//    	.andExpect(model().attribute("result",registerDto))
//    	.andExpect(model().attribute("getMessage",registerDto));
//    }
//
//    /**
//	 * Postの処理でバリデーションが発生した時のテスト
//	 */
//	@Test
//	public void test3() throws Exception {
//		testDto.setApplicationDate("2020-12-22");
//    	testDto.setSeiKj("");
//    	testDto.setMeiKj("孝之");
//    	testDto.setSeiKana("");
//    	testDto.setMeiKana("たかゆき");
//    	testDto.setBirthday("2020-12-22");
//    	testDto.setAge("18");
//      	testDto.setPhoneNumber("000-0000-0000");
//      	testDto.setAddress("福岡県福岡市");
//      	testDto.setMailCode("aaaaaaa@icloud.com");
//      	testDto.setSelectionCode("採用");
//      	testDto.setMediumCode("ハローワーク");
//      	testDto.setHopeJobCode("技術者");
//      	testDto.setGender("男性");
//      	testDto.setCareer("有");
//      	testDto.setRemarks("111");
//
//    	String registerDto = null;
//		mockMvc.perform((post("/register")).flashAttr("registerDto",testDto))
//    	.andExpect(view().name("redirect:register"))
//    	.andExpect(model().attribute("result",registerDto))
//    	.andExpect(model().attribute("getMessage",registerDto));
//	}
//
//	/**
//	 * バリデーションが通過した時のテスト
//	 */
//	@Test
//	public void test4() {
//		testDto.setApplicationDate("2020-12-22");
//    	testDto.setSeiKj("山田");
//    	testDto.setMeiKj("孝之");
//    	testDto.setSeiKana("やまだ");
//    	testDto.setMeiKana("たかゆき");
//    	testDto.setBirthday("2020-12-22");
//    	testDto.setAge("18");
//      	testDto.setPhoneNumber("000-0000-0000");
//      	testDto.setAddress("福岡県福岡市");
//      	testDto.setMailCode("aaaaaaa@icloud.com");
//      	testDto.setSelectionCode("採用");
//      	testDto.setMediumCode("ハローワーク");
//      	testDto.setHopeJobCode("技術者");
//      	testDto.setGender("男性");
//      	testDto.setCareer("有");
//      	testDto.setRemarks("111");
//
//		validator.validate(testDto, bindingResult);
//		assertThat(bindingResult.getFieldError(), is(nullValue()));
//	}
//
//	/**
//	 * 苗字がNULLの時のテスト
//	 */
//	@Test
//	public void test5() {
//		testDto.setApplicationDate("2020-12-22");
//    	testDto.setSeiKj(null);
//    	testDto.setMeiKj("孝之");
//    	testDto.setSeiKana("やまだ");
//    	testDto.setMeiKana("たかゆき");
//    	testDto.setBirthday("2020-12-22");
//    	testDto.setAge("18");
//      	testDto.setPhoneNumber("000-0000-0000");
//      	testDto.setAddress("福岡県福岡市");
//      	testDto.setMailCode("aaaaaaa@icloud.com");
//      	testDto.setSelectionCode("採用");
//      	testDto.setMediumCode("ハローワーク");
//      	testDto.setHopeJobCode("技術者");
//      	testDto.setGender("男性");
//      	testDto.setCareer("有");
//      	testDto.setRemarks("111");
//
//
//		validator.validate(testDto, bindingResult);
//		assertThat(bindingResult.getFieldError().getField(), is("seiKj"));
//		assertThat(bindingResult.getFieldError().getDefaultMessage(), is("名前は必須です。"));
//	}
//	/**
//	 * 苗字が空白の時のテスト
//	 */
//	@Test
//	public void test6() {
//		testDto.setApplicationDate("2020-12-22");
//    	testDto.setSeiKj("");
//    	testDto.setMeiKj("孝之");
//    	testDto.setSeiKana("やまだ");
//    	testDto.setMeiKana("たかゆき");
//    	testDto.setBirthday("2020-12-22");
//    	testDto.setAge("18");
//        testDto.setPhoneNumber("000-0000-0000");
//      	testDto.setAddress("福岡県福岡市");
//      	testDto.setMailCode("aaaaaaa@icloud.com");
//      	testDto.setSelectionCode("採用");
//      	testDto.setMediumCode("ハローワーク");
//      	testDto.setHopeJobCode("技術者");
//      	testDto.setGender("男性");
//      	testDto.setCareer("有");
//      	testDto.setRemarks("111");
//
//		validator.validate(testDto, bindingResult);
//		assertThat(bindingResult.getFieldError().getField(), is("seiKj"));
//		assertThat(bindingResult.getFieldError().getDefaultMessage(), is("名前は必須です。"));
//	}
//	/**
//	 * 苗字が20文字以上の時のテスト
//	 */
//	@Test
//	public void test7() {
//		testDto.setApplicationDate("2020-12-22");
//    	testDto.setSeiKj("あいうえおかきくけこさしすせそたちつてとな");
//    	testDto.setMeiKj("孝之");
//    	testDto.setSeiKana("やまだ");
//    	testDto.setMeiKana("たかゆき");
//    	testDto.setBirthday("2020-12-22");
//    	testDto.setAge("18");
//      	testDto.setPhoneNumber("000-0000-0000");
//      	testDto.setAddress("福岡県福岡市");
//      	testDto.setMailCode("aaaaaaa@icloud.com");
//      	testDto.setSelectionCode("採用");
//      	testDto.setMediumCode("ハローワーク");
//      	testDto.setHopeJobCode("技術者");
//      	testDto.setGender("男性");
//      	testDto.setCareer("有");
//      	testDto.setRemarks("111");
//
//		validator.validate(testDto, bindingResult);
//		assertThat(bindingResult.getFieldError().getField(), is("seiKj"));
//		assertThat(bindingResult.getFieldError().getDefaultMessage(), is("名前は20文字以内で入力してください。"));
//	}
//
//	/**
//	 * 名前がNULLの時のテスト
//	 */
//	@Test
//	public void test8() {
//		testDto.setApplicationDate("2020-12-22");
//    	testDto.setSeiKj("山田");
//    	testDto.setMeiKj(null);
//    	testDto.setSeiKana("やまだ");
//    	testDto.setMeiKana("たかゆき");
//    	testDto.setBirthday("2020-12-22");
//    	testDto.setAge("18");
//      	testDto.setPhoneNumber("000-0000-0000");
//      	testDto.setAddress("福岡県福岡市");
//      	testDto.setMailCode("aaaaaaa@icloud.com");
//      	testDto.setSelectionCode("採用");
//      	testDto.setMediumCode("ハローワーク");
//      	testDto.setHopeJobCode("技術者");
//      	testDto.setGender("男性");
//      	testDto.setCareer("有");
//      	testDto.setRemarks("111");
//
//		validator.validate(testDto, bindingResult);
//		assertThat(bindingResult.getFieldError().getField(), is("meiKj"));
//		assertThat(bindingResult.getFieldError().getDefaultMessage(), is("名前は必須です。"));
//	}
//	/**
//	 * 名前が空白の時のテスト
//	 */
//	@Test
//	public void test9() {
//		testDto.setApplicationDate("2020-12-22");
//    	testDto.setSeiKj("山田");
//    	testDto.setMeiKj("");
//    	testDto.setSeiKana("やまだ");
//    	testDto.setMeiKana("たかゆき");
//    	testDto.setBirthday("2020-12-22");
//    	testDto.setAge("18");
//      	testDto.setPhoneNumber("000-0000-0000");
//      	testDto.setAddress("福岡県福岡市");
//      	testDto.setMailCode("aaaaaaa@icloud.com");
//      	testDto.setSelectionCode("採用");
//      	testDto.setMediumCode("ハローワーク");
//      	testDto.setHopeJobCode("技術者");
//      	testDto.setGender("男性");
//      	testDto.setCareer("有");
//      	testDto.setRemarks("111");
//
//
//		validator.validate(testDto, bindingResult);
//		assertThat(bindingResult.getFieldError().getField(), is("meiKj"));
//		assertThat(bindingResult.getFieldError().getDefaultMessage(), is("名前は必須です。"));
//	}
//	/**
//	 * 名前が20文字以上の時のテスト
//	 */
//	@Test
//	public void test10() {
//		testDto.setApplicationDate("2020-12-22");
//    	testDto.setSeiKj("山田");
//    	testDto.setMeiKj("あいうえおかきくけこさしすせそたちつてとな");
//    	testDto.setSeiKana("やまだ");
//    	testDto.setMeiKana("たかゆき");
//    	testDto.setBirthday("2020-12-22");
//        testDto.setAge("18");
//    	testDto.setPhoneNumber("000-0000-0000");
//    	testDto.setAddress("福岡県福岡市");
//    	testDto.setMailCode("aaaaaaa@icloud.com");
//    	testDto.setSelectionCode("採用");
//    	testDto.setMediumCode("ハローワーク");
//    	testDto.setHopeJobCode("技術者");
//    	testDto.setGender("男性");
//    	testDto.setCareer("有");
//    	testDto.setRemarks("111");
//
//		validator.validate(testDto, bindingResult);
//		assertThat(bindingResult.getFieldError().getField(), is("meiKj"));
//		assertThat(bindingResult.getFieldError().getDefaultMessage(), is("名前は20文字以内で入力してください。"));
//	}
//
//	/**
//	 * 苗字(ひらがな)がNULLの時のテスト
//	 */
//	@Test
//	public void tes11() {
//		testDto.setApplicationDate("2020-12-22");
//    	testDto.setSeiKj("山田");
//    	testDto.setMeiKj("孝之");
//    	testDto.setSeiKana(null);
//    	testDto.setMeiKana("たかゆき");
//    	testDto.setBirthday("2020-12-22");
//    	testDto.setAge("18");
//      	testDto.setPhoneNumber("000-0000-0000");
//      	testDto.setAddress("福岡県福岡市");
//      	testDto.setMailCode("aaaaaaa@icloud.com");
//      	testDto.setSelectionCode("採用");
//      	testDto.setMediumCode("ハローワーク");
//      	testDto.setHopeJobCode("技術者");
//      	testDto.setGender("男性");
//      	testDto.setCareer("有");
//      	testDto.setRemarks("111");
//
//
//		validator.validate(testDto, bindingResult);
//		assertThat(bindingResult.getFieldError().getField(), is("seiKana"));
//		assertThat(bindingResult.getFieldError().getDefaultMessage(), is("名前は必須です。"));
//	}
//	/**
//	 * 苗字(ひらがな)が空白の時のテスト
//	 */
//	@Test
//	public void test12() {
//		testDto.setApplicationDate("2020-12-22");
//    	testDto.setSeiKj("山田");
//    	testDto.setMeiKj("孝之");
//    	testDto.setSeiKana("");
//    	testDto.setMeiKana("たかゆき");
//    	testDto.setBirthday("2020-12-22");
//    	testDto.setAge("18");
//      	testDto.setPhoneNumber("000-0000-0000");
//      	testDto.setAddress("福岡県福岡市");
//      	testDto.setMailCode("aaaaaaa@icloud.com");
//      	testDto.setSelectionCode("採用");
//      	testDto.setMediumCode("ハローワーク");
//      	testDto.setHopeJobCode("技術者");
//      	testDto.setGender("男性");
//      	testDto.setCareer("有");
//      	testDto.setRemarks("111");
//
//
//		validator.validate(testDto, bindingResult);
//		assertThat(bindingResult.getFieldError().getField(), is("seiKana"));
//		assertThat(bindingResult.getFieldError().getDefaultMessage(), is("名前は必須です。"));
//	}
//	/**
//	 * 苗字(ひらがな)が20文字以上の時のテスト
//	 */
//	@Test
//	public void test13() {
//		testDto.setApplicationDate("2020-12-22");
//    	testDto.setSeiKj("山田");
//    	testDto.setMeiKj("孝之");
//    	testDto.setSeiKana("あいうえおかきくけこさしすせそたちつてとな");
//    	testDto.setMeiKana("たかゆき");
//    	testDto.setBirthday("2020-12-22");
//    	testDto.setAge("18");
//      	testDto.setPhoneNumber("000-0000-0000");
//      	testDto.setAddress("福岡県福岡市");
//      	testDto.setMailCode("aaaaaaa@icloud.com");
//      	testDto.setSelectionCode("採用");
//      	testDto.setMediumCode("ハローワーク");
//      	testDto.setHopeJobCode("技術者");
//      	testDto.setGender("男性");
//      	testDto.setCareer("有");
//      	testDto.setRemarks("111");
//
//
//		validator.validate(testDto, bindingResult);
//		assertThat(bindingResult.getFieldError().getField(), is("seiKana"));
//		assertThat(bindingResult.getFieldError().getDefaultMessage(), is("名前は20文字以内で入力してください。"));
//	}
//
//	/**
//	 * 名前(ひらがな)がNULLの時のテスト
//	 */
//	@Test
//	public void test14() {
//		testDto.setApplicationDate("2020-12-22");
//    	testDto.setSeiKj("山田");
//    	testDto.setMeiKj("孝之");
//    	testDto.setSeiKana("やまだ");
//    	testDto.setMeiKana(null);
//    	testDto.setBirthday("2020-12-22");
//        testDto.setAge("18");
//      	testDto.setPhoneNumber("000-0000-0000");
//      	testDto.setAddress("福岡県福岡市");
//      	testDto.setMailCode("aaaaaaa@icloud.com");
//      	testDto.setSelectionCode("採用");
//      	testDto.setMediumCode("ハローワーク");
//      	testDto.setHopeJobCode("技術者");
//      	testDto.setGender("男性");
//      	testDto.setCareer("有");
//      	testDto.setRemarks("111");
//
//		validator.validate(testDto, bindingResult);
//		assertThat(bindingResult.getFieldError().getField(), is("meiKana"));
//		assertThat(bindingResult.getFieldError().getDefaultMessage(), is("名前は必須です。"));
//	}
//	/**
//	 * 名前(ひらがな)が空白の時のテスト
//	 */
//	@Test
//	public void test15() {
//		testDto.setApplicationDate("2020-12-22");
//    	testDto.setSeiKj("山田");
//    	testDto.setMeiKj("孝之");
//    	testDto.setSeiKana("やまだ");
//    	testDto.setMeiKana("");
//    	testDto.setBirthday("2020-12-22");
//    	testDto.setAge("18");
//      	testDto.setPhoneNumber("000-0000-0000");
//      	testDto.setAddress("福岡県福岡市");
//      	testDto.setMailCode("aaaaaaa@icloud.com");
//      	testDto.setSelectionCode("採用");
//      	testDto.setMediumCode("ハローワーク");
//      	testDto.setHopeJobCode("技術者");
//      	testDto.setGender("男性");
//      	testDto.setCareer("有");
//      	testDto.setRemarks("111");
//
//		validator.validate(testDto, bindingResult);
//		assertThat(bindingResult.getFieldError().getField(), is("meiKana"));
//		assertThat(bindingResult.getFieldError().getDefaultMessage(), is("名前は必須です。"));
//	}
//	/**
//	 * 名前(ひらがな)が20文字以上の時のテスト
//	 */
//	@Test
//	public void test16() {
//		testDto.setApplicationDate("2020-12-22");
//    	testDto.setSeiKj("山田");
//    	testDto.setMeiKj("孝之");
//    	testDto.setSeiKana("やまだ");
//    	testDto.setMeiKana("あいうえおかきくけこさしすせそたちつてとなに");
//    	testDto.setBirthday("2020-12-22");
//    	testDto.setAge("18");
//      	testDto.setPhoneNumber("000-0000-0000");
//      	testDto.setAddress("福岡県福岡市");
//      	testDto.setMailCode("aaaaaaa@icloud.com");
//      	testDto.setSelectionCode("採用");
//      	testDto.setMediumCode("ハローワーク");
//      	testDto.setHopeJobCode("技術者");
//      	testDto.setGender("男性");
//      	testDto.setCareer("有");
//      	testDto.setRemarks("111");
//
//		validator.validate(testDto, bindingResult);
//		assertThat(bindingResult.getFieldError().getField(), is("meiKana"));
//		assertThat(bindingResult.getFieldError().getDefaultMessage(), is("名前は20文字以内で入力してください。"));
//	}
//
//	/**
//	 * 備考が200文字以上の時のテスト
//	 */
//	@Test
//	public void test17() {
//		testDto.setApplicationDate("2020-12-22");
//    	testDto.setSeiKj("山田");
//    	testDto.setMeiKj("孝之");
//    	testDto.setSeiKana("やまだ");
//    	testDto.setMeiKana("たかゆき");
//    	testDto.setBirthday("2020-12-22");
//    	testDto.setAge("18");
//      	testDto.setPhoneNumber("000-0000-0000");
//      	testDto.setAddress("福岡県福岡市");
//      	testDto.setMailCode("aaaaaaa@icloud.com");
//      	testDto.setSelectionCode("採用");
//      	testDto.setMediumCode("ハローワーク");
//      	testDto.setHopeJobCode("技術者");
//      	testDto.setGender("男性");
//      	testDto.setCareer("有");
//		testDto.setRemarks("1111111111222222222233333333334444444444555555555566666666667777777777888888888899999999990000000000"
//						 + "11111111112222222222333333333344444444445555555555666666666677777777778888888888999999999900000000001");
//
//		validator.validate(testDto, bindingResult);
//		assertThat(bindingResult.getFieldError().getField(), is("remarks"));
//		assertThat(bindingResult.getFieldError().getDefaultMessage(), is("備考は200文字以内で入力してください。"));
//	}
//}
//
//
