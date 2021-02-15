//package com.rapideact.local.humanresource.services;
//
//import java.util.List;
//
//import org.springframework.stereotype.Service;
//
//import com.rapideact.local.humanresource.mybatis.condition.EmployeesAttendanceCondition;
//import com.rapideact.local.humanresource.mybatis.condition.EmployeesCondition;
//import com.rapideact.local.humanresource.mybatis.domain.EmployeesDomain;
//
///**
// * Userサービスクラスのインターフェース
// *
// */
//@Service
//public interface EmployeesServiceInterface {
//
//	/**
//	 * @param param
//	 */
//	public void userCreate(EmployeesCondition param);
//
//
//	public void userAttendanceCreate(EmployeesAttendanceCondition param);
//
//	/**
//	 * 一名検索条件
//	 * @param param 検索条件
//	 * @return ユーザー情報
//	 */
//	public EmployeesDomain userShow(EmployeesCondition param);
//
//
//	public List<EmployeesDomain> userSearch(EmployeesCondition param);
//
//
//	public List<EmployeesDomain> userEmployeesSearch(EmployeesCondition param);
//
//	/**
//	 * 登録修正
//	 * @param param ユーザー情報
//	 */
//	public void userDetail(EmployeesCondition param);
//
//	public void userAttendanceCreate(EmployeesCondition param);
//
//	public List<EmployeesDomain> userEmployeesIdSearch(String stuffName);
//
//
//}
