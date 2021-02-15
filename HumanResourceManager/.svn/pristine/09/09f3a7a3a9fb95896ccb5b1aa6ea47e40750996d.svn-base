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
// * Resultコントローラーのテスト
// */
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest
//public class ResultControllerTests {
//
//
//
//	private MockMvc mockMvc;
//
//	@Autowired
//	ResultController target;
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
//	 * result.htmlに遷移するかテストする
//	 */
//    @Test
//    public void test1() throws Exception {
//		mockMvc.perform(get("/result/1")).andExpect(view().name("result"));
//    }
//
//    /**
//     *削除機能のテストする
//     */
//
//    @Test
//    public void test2()throws Exception{
//    	String[]delete_ids=new String[1];
//    	delete_ids[0]="";
//
//    	mockMvc.perform((post("/result")).param("delete_ids",delete_ids)).andExpect(view().name("redirect:/result/1"));
//    }
//}
