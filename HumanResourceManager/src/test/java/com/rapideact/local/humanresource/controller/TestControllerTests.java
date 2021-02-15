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
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//import org.springframework.web.servlet.view.InternalResourceViewResolver;
//
///**
// * テストコントローラーのテスト
// */
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest
//public class TestControllerTests {
//
//	private MockMvc mockMvc;
//
//	@Autowired
//	TestController target;
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
//	 * test.htmlに遷移するかテストする
//	 */
//    @Test
//    public void test1() throws Exception {
//    	mockMvc.perform(get("/test")).andExpect(view().name("test"));
//    }
//
//}
