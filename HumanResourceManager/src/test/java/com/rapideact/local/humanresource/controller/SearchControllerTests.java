//
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
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//import org.springframework.validation.BindException;
//import org.springframework.validation.BindingResult;
//import org.springframework.validation.Validator;
//import org.springframework.web.servlet.view.InternalResourceViewResolver;
//
//import com.rapideact.local.humanresource.dto.SearchDto;
//
///**
// * Searchコントローラーのテスト
// */
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest
//public class SearchControllerTests {
//
//	private MockMvc mockMvc;
//
//	private SearchDto testDto = new SearchDto();
//	private BindingResult bindingResult = new BindException(testDto, "SearchDto");
//
//	@Autowired
//	Validator validator;
//
//	@Autowired
//	SearchController target;
//
//	@Before
//	public void setup() {
//		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
//		resolver.setPrefix("/templates/");
//		resolver.setSuffix(".html");
//		mockMvc = MockMvcBuilders.standaloneSetup(target).setViewResolvers(resolver).build();
//
//	}
//
//	/**
//	 * search.htmlに遷移するかテストする
//	 */
//	@Test
//	public void test1() throws Exception {
//		mockMvc.perform(get("/search")).andExpect(view().name("search"));
//	}
//	/**
//	 * バリデーション通過した時のテスト
//	 */
//	@Test
//	public void test2()throws Exception  {
//
//		testDto.setName("Java");
//		testDto.setApplicationDateFrom("PHP");
//		testDto.setApplicationDateTo("1950,01,01");
//		testDto.setSelectionCode("採用");
//		testDto.setHopeJobCode("事務");
//		testDto.setMediumCode("マイナビ");
//		validator.validate(testDto, bindingResult);
//		assertThat(bindingResult.getFieldError(), is(nullValue()));
//	}
//	/**
//	 * 名前が20文字以上の時のテスト
//	 */
//	@Test
//	public void test3() throws Exception {
//		testDto.setName("ああああああああああああああああああああああ");
//		testDto.setApplicationDateFrom("PHP");
//		testDto.setApplicationDateTo("1950,01,01");
//		testDto.setSelectionCode("採用");
//		testDto.setHopeJobCode("事務");
//		testDto.setMediumCode("マイナビ");
//
//		validator.validate(testDto, bindingResult);
//		assertThat(bindingResult.getFieldError().getField(), is("name"));
//		assertThat(bindingResult.getFieldError().getDefaultMessage(), is("名前は20文字以内で入力してください。"));
//
//	}
//	/**
//	 * プルダウン項目を選択したときのテスト
//	 */
//	@Test
//	public void test4() throws Exception {
//
//		testDto.setSelectionCode("採用");
//
//		String searchDto = null;
//		mockMvc.perform((post("/search")).flashAttr("searchDto",testDto))
//		.andExpect(view().name("result"))
//		.andExpect(model().attribute("result", searchDto))
//		.andExpect(model().attribute("getMessage",searchDto));
//	}
//	/**
//	 * プルダウン項目を選択したときのテスト
//	 */
//	@Test
//	public void test5() throws Exception {
//
//		testDto.setHopeJobCode("技術者");
//
//		String searchDto = null;
//		mockMvc.perform((post("/search")).flashAttr("searchDto",testDto))
//		.andExpect(view().name("result"))
//		.andExpect(model().attribute("result", searchDto))
//		.andExpect(model().attribute("getMessage",searchDto));
//	}
//
//
//	/**
//	 * プルダウン項目を選択したときのテスト
//	 */
//	@Test
//	public void test6() throws Exception {
//
//		testDto.setMediumCode("リクルート");
//
//		String searchDto = null;
//		mockMvc.perform((post("/search")).flashAttr("searchDto",testDto))
//		.andExpect(view().name("result"))
//		.andExpect(model().attribute("result", searchDto))
//		.andExpect(model().attribute("getMessage",searchDto));
//	}
//}
//
//
//
