//package com.rapideact.local.humanresource.controller;
//
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
//import org.springframework.web.servlet.view.InternalResourceViewResolver;
//
//import com.github.springtestdbunit.DbUnitTestExecutionListener;
//import com.rapideact.local.humanresource.controller.UserdeleteController;
//
///**
// * Userコントローラーのテスト
// */
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest
//@TestExecutionListeners({
//	DependencyInjectionTestExecutionListener.class,
//	TransactionalTestExecutionListener.class,
//	DbUnitTestExecutionListener.class
//})
//public class UserdeleteControllerTests {
//
//	private MockMvc mockMvc;
//
//	@Autowired
//	UserdeleteController target;
//
//	@Before
//	public void setup() {
//		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
//		resolver.setPrefix("/templates/");
//		resolver.setSuffix(".html");
//		mockMvc = MockMvcBuilders.standaloneSetup(target).setViewResolvers(resolver).build();
//
//	}
//	/**
//	 * userdelete.htmlに遷移するかテストする
//	 */
//	@Test
//	public void test1() throws Exception {
//		mockMvc.perform(get("/userdelete")).andExpect(view().name("userdelete"));
//	}
//
//	/**
//	 *削除機能のテストする
//	 */
//
//	@Test
//	public void test2()throws Exception{
//		String[]delete_ids=new String[1];
//		delete_ids[0]="";
//
//		mockMvc.perform((post("/delete")).param("delete_ids",delete_ids)).andExpect(view().name("redirect:userdelete"));
//	}
//}
//
//
