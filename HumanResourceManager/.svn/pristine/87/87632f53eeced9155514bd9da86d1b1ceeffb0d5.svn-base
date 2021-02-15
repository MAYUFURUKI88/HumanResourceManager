//package com.rapideact.local.humanresource.model;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import com.rapideact.local.humanresource.dto.EmployeesDetailDto;
//import com.rapideact.local.humanresource.mybatis.condition.EmployeesCondition;
//import com.rapideact.local.humanresource.mybatis.domain.EmployeesDomain;
//import com.rapideact.local.humanresource.services.EmployeesService;
//
//import lombok.Data;
//
///**
// * Registerモデルクラス
// * 処理の中核、データやDBに対する処理。
// */
//@Data
//@Component
//public class EmployeesDetailModel {
//
//	//Serviceの操作も可能になる
//	@Autowired
//	private EmployeesService employeesService;
//
//	/**
//	 * ユーザー情報表示メソッド
//	 * @param detail_id 指定されたユーザーのID
//	 * @return ユーザー情報
//	 */
//	public EmployeesDetailDto show(int detail_id) {
//
//		EmployeesCondition param = new EmployeesCondition();
//		//IDからその他のユーザー情報を割り当てる
//		param.setEmployeesId((detail_id));
//
//		EmployeesDomain user = employeesService.userShow(param);
//		EmployeesDetailDto employeesDetailDto = new EmployeesDetailDto();
//		employeesDetailDto.setEmployeesId(user.getEmployeesId());
//		employeesDetailDto.setDate(user.getDate());
//		employeesDetailDto.setSeiKj(user.getSeiKj());
//		employeesDetailDto.setMeiKj(user.getMeiKj());
//		employeesDetailDto.setSeiKana(user.getSeiKana());
//		employeesDetailDto.setMeiKana(user.getMeiKana());
//		employeesDetailDto.setGender(user.getGender());
//		employeesDetailDto.setBirthday(user.getBirthday());
//		employeesDetailDto.setPhoneNumber(user.getPhoneNumber());
//		employeesDetailDto.setAddress(user.getAddress());
//		employeesDetailDto.setEmployment(user.getEmployment());
//		employeesDetailDto.setDivision(user.getDivision());
//		employeesDetailDto.setDateOfJoining(user.getDateOfJoining());
//		employeesDetailDto.setDateOfRetirement(user.getDateOfRetirement());
//		employeesDetailDto.setRemarks(user.getRemarks());
//		return employeesDetailDto;
//
//	}
//
//	/**
//	 * ユーザー情報更新メソッド
//	 * @param result 入力された引数
//	 */
//	public void create(EmployeesDetailDto employeesDetailDto) {
//
//		EmployeesCondition param = new EmployeesCondition();
//		param.setEmployeesId(employeesDetailDto.getEmployeesId());
//		param.setDate(employeesDetailDto.getDate());
//		param.setSeiKj(employeesDetailDto.getSeiKj());
//		param.setMeiKj(employeesDetailDto.getMeiKj());
//		param.setSeiKana(employeesDetailDto.getSeiKana());
//		param.setMeiKana(employeesDetailDto.getMeiKana());
//		param.setGender(employeesDetailDto.getGender());
//		param.setBirthday(employeesDetailDto.getBirthday());
//		param.setPhoneNumber(employeesDetailDto.getPhoneNumber());
//		param.setAddress(employeesDetailDto.getAddress());
//		param.setEmployment(employeesDetailDto.getEmployment());
//		param.setDivision(employeesDetailDto.getDivision());
//		param.setDateOfJoining(employeesDetailDto.getDateOfJoining());
//		param.setDateOfRetirement(employeesDetailDto.getDateOfRetirement());
//		param.setRemarks(employeesDetailDto.getRemarks());
//		//Serviceに送る
//		employeesService.userDetail(param);
//
//	}
//
//}