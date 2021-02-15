//package com.rapideact.local.humanresource.mybatis.mapper;
//
//import java.util.List;
//
//import org.apache.ibatis.annotations.Mapper;
//import org.springframework.stereotype.Component;
//
//import com.rapideact.local.humanresource.mybatis.condition.EmployeesAttendanceCondition;
//import com.rapideact.local.humanresource.mybatis.condition.EmployeesCondition;
//import com.rapideact.local.humanresource.mybatis.domain.EmployeesDomain;
//
///**
// * 登録用マッパークラス
// *  ApplicantMapper.xmlにマッピングする
// *
// */
//@Mapper
//@Component
//public interface EmployeesMapper {
//	/**
//	 *登録
//	 * @param param 登録条件クラス
//	 */
//	public void userCreate(EmployeesCondition param);
//
//	/**
//	 * 検索
//	 * @param param 検索条件クラス
//	 */
//	public List<EmployeesDomain> userSearch(EmployeesCondition param);
//
//	/**
//	 * 社員検索
//	 * @param param 検索条件クラス
//	 */
//	public List<EmployeesDomain> userEmployeesSearch(EmployeesCondition param);
//
//	/**
//	 * 社員検索
//	 * @param param 検索条件クラス
//	 */
//
//	public void userEmployeesSearch();
//	/**
//	 * 削除
//	 * @param param 登録削除クラス
//	 */
//	public void userDelete(EmployeesCondition param);
//
//	/**
//	 * 一名検索
//	 * @param param 検索条件クラス
//	 * @return ユーザー情報
//	 */
//	public EmployeesDomain userShow(EmployeesCondition param);
//
//	/**
//	 * 更新
//	 * @param param 更新条件クラス
//	 */
//	public void userDetail(EmployeesCondition param);
//
//	 /**
//	 *
//	 *
//	 */
//	public void userAttendanceCreate(EmployeesAttendanceCondition param);
//
//	 /**
//	 * @return
//	 *
//	 *
//	 */
//	public List<EmployeesDomain> userEmployeesIdSearch(String stuffName);
//
//
//}
