//package com.rapideact.local.humanresource.mapper;
//
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
//import com.rapideact.local.humanresource.mybatis.condition.ApplicantCondition;
//import com.rapideact.local.humanresource.mybatis.domain.ApplicantDomain;
//import com.rapideact.local.humanresource.mybatis.mapper.ApplicantMapper;
//
//
///**
// * Applicantマッパーのテスト
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
//public class ApplicantMapperTests {
//
//	private ApplicantCondition applicantCondition= new ApplicantCondition();
//
//	private final String SETUP_PATH = "/com/rapideact/local/humanresource/testApplicantMapper/";
//	private final String EXPECTED_PATH = "/com/rapideact/local/humanresource/testApplicantResult/";
//
//	private final String SETUP_PATH2 = "/com/rapideact/local/humanresource/testApplicantMapper2/";
//
//	private final String SETUP_PATH3="/com/rapideact/local/humanresource/testApplicantMapper3/";
//	private final String EXPECTED_PATH3 = "/com/rapideact/local/humanresource/testApplicantResult3/";
//
//	private final String SETUP_PATH4="/com/rapideact/local/humanresource/testApplicantMapper4/";
//	private final String EXPECTED_PATH4 = "/com/rapideact/local/humanresource/testApplicantResult4/";
//
//
//
//	@Autowired
//	ApplicantMapper target;
//	/**
//	 * DBに登録可能かテスト
//	 */
//	@Test
//	@DatabaseSetup(value = SETUP_PATH)
//	public void test1() throws Exception {
//
//		applicantCondition.setApplicationDate("2011-11-11");
//		applicantCondition.setSeiKj("一");
//		applicantCondition.setMeiKj("二");
//		applicantCondition.setSeiKana("いち");
//		applicantCondition.setMeiKana("に");
//		applicantCondition.setAge("18");
//		applicantCondition.setPhoneNumber("000-0000-0000");
//		applicantCondition.setGender("0");
//		applicantCondition.setSelectionCode("採用");
//		applicantCondition.setHopeJobCode("技術者");
//		applicantCondition.setMediumCode("ハローワーク");
//		applicantCondition.setAddress("福岡県福岡市");
//		applicantCondition.setMailCode("aaaaaaa@icloud.com");
//		applicantCondition.setCareer("0");
//		applicantCondition.setRemarks("あいう");
//
//		target.userCreate(applicantCondition);
//
//	}
//
//	/**
//	 * 登録後、テーブルに追加されているかテスト
//	 */
//	@Test
//	@DatabaseSetup(value = SETUP_PATH)
//	@ExpectedDatabase(value = EXPECTED_PATH, assertionMode = DatabaseAssertionMode.NON_STRICT)
//	public void test2() throws Exception {
//
//		applicantCondition.setApplicationDate("2022-12-22");
//		applicantCondition.setSeiKj("苗字");
//		applicantCondition.setMeiKj("名前");
//		applicantCondition.setSeiKana("みょうじ");
//		applicantCondition.setMeiKana("なまえ");
//		applicantCondition.setAge("19");
//		applicantCondition.setPhoneNumber("111-1111-1111");
//		applicantCondition.setGender("1");
//		applicantCondition.setSelectionCode("不採用");
//		applicantCondition.setHopeJobCode("営業");
//		applicantCondition.setMediumCode("マイナビ");
//		applicantCondition.setAddress("福岡県北九州市");
//		applicantCondition.setMailCode("bbbbbbbb@icloud.com");
//		applicantCondition.setCareer("1");
//		applicantCondition.setRemarks("えお");
//
//		target.userCreate(applicantCondition);
//	}
//
//	/*
//	 * ==========================
//	 *
//	 * 検索結果画面のテスト
//	 *
//	 * ==========================
//	 */
//	@Test
//	@DatabaseSetup(value = SETUP_PATH2)
//	public void test3() throws Exception {
//
//		List<ApplicantDomain> applicantDomainList=target.userSearch(applicantCondition);
//		assertThat(applicantDomainList.size(),is(5));
//	}
//
//	/*
//	 * nullの場合
//	 */
//
//	@Test
//	@DatabaseSetup(value = SETUP_PATH2)
//	public void test4() throws Exception {
//
//		applicantCondition.setName(null);
//		applicantCondition.setApplicationDateFrom(null);
//		applicantCondition.setApplicationDateTo(null);
//		applicantCondition.setSelectionCode(null);
//		applicantCondition.setHopeJobCode(null);
//		applicantCondition.setMediumCode(null);
//		List<ApplicantDomain> applicantDomainList=target.userSearch(applicantCondition);
//		assertThat(applicantDomainList.size(),is(5));
//	}
//
//	/*
//	 * nullではない場合
//	 */
//
//	@Test
//	@DatabaseSetup(value = SETUP_PATH2)
//	public void test5() throws Exception {
//
//		applicantCondition.setName("B");
//		applicantCondition.setApplicationDateFrom("2011-11-11");
//		applicantCondition.setApplicationDateTo("2011-12-11");
//		applicantCondition.setSelectionCode("採用");
//		applicantCondition.setHopeJobCode("技術者");
//		applicantCondition.setMediumCode("ハローワーク");
//		List<ApplicantDomain> applicantDomainList=target.userSearch(applicantCondition);
//		assertThat(applicantDomainList.size(),is(1));
//		assertThat(applicantDomainList.get(0).getId(),is(2));
//
//	}
//
//	/*
//	 * 名前のみの入力の場合
//	 */
//
//	@Test
//	@DatabaseSetup(value = SETUP_PATH2)
//	public void test6() throws Exception {
//
//		applicantCondition.setName("A");
//		applicantCondition.setApplicationDateFrom(null);
//		applicantCondition.setApplicationDateTo(null);
//		applicantCondition.setSelectionCode(null);
//		applicantCondition.setHopeJobCode(null);
//		applicantCondition.setMediumCode(null);
//		List<ApplicantDomain> applicantDomainList=target.userSearch(applicantCondition);
//		assertThat(applicantDomainList.size(),is(1));
//		assertThat(applicantDomainList.get(0).getId(),is(4));
//
//	}
//
//	/*
//	 * 発行日時のみの入力の場合○○～
//	 */
//
//	@Test
//	@DatabaseSetup(value = SETUP_PATH2)
//	public void test7() throws Exception {
//
//		applicantCondition.setName(null);
//		applicantCondition.setApplicationDateFrom("2011-11-11");
//		applicantCondition.setApplicationDateTo(null);
//		applicantCondition.setSelectionCode(null);
//		applicantCondition.setHopeJobCode(null);
//		applicantCondition.setMediumCode(null);
//		List<ApplicantDomain> applicantDomainList=target.userSearch(applicantCondition);
//		assertThat(applicantDomainList.size(),is(5));
//		assertThat(applicantDomainList.get(0).getId(),is(1));
//		assertThat(applicantDomainList.get(1).getId(),is(2));
//		assertThat(applicantDomainList.get(2).getId(),is(3));
//		assertThat(applicantDomainList.get(3).getId(),is(4));
//		assertThat(applicantDomainList.get(4).getId(),is(5));
//	}
//
//	/*
//	 * 発行日時のみの入力の場合～○○
//	 */
//
//	@Test
//	@DatabaseSetup(value = SETUP_PATH2)
//	public void test8() throws Exception {
//
//		applicantCondition.setName(null);
//		applicantCondition.setApplicationDateFrom(null);
//		applicantCondition.setApplicationDateTo("2020-6-20");
//		applicantCondition.setSelectionCode(null);
//		applicantCondition.setHopeJobCode(null);
//		applicantCondition.setMediumCode(null);
//		List<ApplicantDomain> applicantDomainList=target.userSearch(applicantCondition);
//		assertThat(applicantDomainList.size(),is(3));
//		assertThat(applicantDomainList.get(0).getId(),is(1));
//
//	}
//
//	/*
//	 * 採用状況のみの入力の場合
//	 */
//
//	@Test
//	@DatabaseSetup(value = SETUP_PATH2)
//	public void test9() throws Exception {
//
//		applicantCondition.setName(null);
//		applicantCondition.setApplicationDateFrom(null);
//		applicantCondition.setApplicationDateTo(null);
//		applicantCondition.setSelectionCode("不採用");
//		applicantCondition.setHopeJobCode(null);
//		applicantCondition.setMediumCode(null);
//		List<ApplicantDomain> applicantDomainList=target.userSearch(applicantCondition);
//		assertThat(applicantDomainList.size(),is(1));
//		assertThat(applicantDomainList.get(0).getId(),is(5));
//
//	}
//
//	/*
//	 * 希望職種のみの入力の場合
//	 */
//
//	@Test
//	@DatabaseSetup(value = SETUP_PATH2)
//	public void test10() throws Exception {
//
//		applicantCondition.setName(null);
//		applicantCondition.setApplicationDateFrom(null);
//		applicantCondition.setApplicationDateTo(null);
//		applicantCondition.setSelectionCode(null);
//		applicantCondition.setHopeJobCode("営業");
//		applicantCondition.setMediumCode(null);
//		List<ApplicantDomain> applicantDomainList=target.userSearch(applicantCondition);
//		assertThat(applicantDomainList.size(),is(2));
//		assertThat(applicantDomainList.get(0).getId(),is(3));
//
//	}
//
//	/*
//	 * 応募媒体のみの入力の場合
//	 */
//
//	@Test
//	@DatabaseSetup(value = SETUP_PATH2)
//	public void test11() throws Exception {
//
//		applicantCondition.setName(null);
//		applicantCondition.setApplicationDateFrom(null);
//		applicantCondition.setApplicationDateTo(null);
//		applicantCondition.setSelectionCode(null);
//		applicantCondition.setHopeJobCode(null);
//		applicantCondition.setMediumCode("ハローワーク");
//		List<ApplicantDomain> applicantDomainList=target.userSearch(applicantCondition);
//		assertThat(applicantDomainList.size(),is(2));
//		assertThat(applicantDomainList.get(0).getId(),is(2));
//
//	}
//
//
//	@Test
//	@DatabaseSetup(value=SETUP_PATH3)
//	@ExpectedDatabase(value = EXPECTED_PATH3, assertionMode = DatabaseAssertionMode.NON_STRICT)
//	public void test12() throws Exception {
//
//		applicantCondition.setId(1);
//		target.userDelete(applicantCondition);
//	}
//
//	/*
//	 * ==========================
//	 *
//	 * 修正画面のテスト
//	 *
//	 * ==========================
//	 */
//	@Test
//	@DatabaseSetup(value=SETUP_PATH4)
//	public void test13() throws Exception {
//
//		applicantCondition.setId(1);
//		ApplicantDomain applicantDomain=target.userShow(applicantCondition);
//
//		assertEquals("2011-11-11",applicantDomain.getApplicationDate());
//		assertEquals("一",applicantDomain.getSeiKj());
//		assertEquals("二",applicantDomain.getMeiKj());
//		assertEquals("いち",applicantDomain.getSeiKana());
//		assertEquals("に",applicantDomain.getMeiKana());
//		assertEquals("18",applicantDomain.getAge());
//		assertEquals("000-0000-0000",applicantDomain.getPhoneNumber());
//		assertEquals("0",applicantDomain.getGender());
//		assertEquals("採用",applicantDomain.getSelectionCode());
//		assertEquals("技術者",applicantDomain.getHopeJobCode());
//		assertEquals("ハローワーク",applicantDomain.getMediumCode());
//		assertEquals("福岡県福岡市",applicantDomain.getAddress());
//		assertEquals("aaaaaaa@icloud.com",applicantDomain.getMailCode());
//		assertEquals("0",applicantDomain.getCareer());
//		assertEquals("あいう",applicantDomain.getRemarks());
//
//	}
//
//	@Test
//	@DatabaseSetup(value = SETUP_PATH4)
//	@ExpectedDatabase(value = EXPECTED_PATH4,assertionMode = DatabaseAssertionMode.NON_STRICT)
//	public void test14() throws Exception {
//		applicantCondition.setId(2);
//		applicantCondition.setApplicationDate("2222-12-22");
//		applicantCondition.setSeiKj("苗字1");
//		applicantCondition.setMeiKj("名前1");
//		applicantCondition.setSeiKana("みょうじ1");
//		applicantCondition.setMeiKana("なまえ1");
//		applicantCondition.setAge("19");
//		applicantCondition.setPhoneNumber("111-1111-2222");
//		applicantCondition.setGender("1");
//		applicantCondition.setSelectionCode("不採用");
//		applicantCondition.setHopeJobCode("営業");
//		applicantCondition.setMediumCode("マイナビ");
//		applicantCondition.setAddress("福岡県太宰府");
//		applicantCondition.setMailCode("ccccccc@icloud.com");
//		applicantCondition.setCareer("1");
//		applicantCondition.setRemarks("変更完了");
//		target.userDetail(applicantCondition);
//
//	}
//}