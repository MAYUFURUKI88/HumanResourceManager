//package com.rapideact.local.humanresource.model;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import com.rapideact.local.humanresource.dto.EmployeesRegisterDto;
//import com.rapideact.local.humanresource.mybatis.condition.EmployeesCondition;
//import com.rapideact.local.humanresource.services.EmployeesService;
//
//import lombok.Data;
//
//@Data
//@Component
//public class EmployeesRegisterModel {
//
//	@Autowired
//	private EmployeesService employeesService;
///**
// * 登録業務ロジック
// * @param employeesRegisterDto
// */
//	public void create(EmployeesRegisterDto employeesRegisterDto) {
//
//		EmployeesCondition param = new EmployeesCondition();
//		param.setEmployeesId(employeesRegisterDto.getEmployeesId());
//		param.setDate(employeesRegisterDto.getDate());
//		param.setSeiKj(employeesRegisterDto.getSeiKj());
//		param.setMeiKj(employeesRegisterDto.getMeiKj());
//		param.setSeiKana(employeesRegisterDto.getSeiKana());
//		param.setMeiKana(employeesRegisterDto.getMeiKana());
//		param.setGender(employeesRegisterDto.getGender());
//		param.setBirthday(employeesRegisterDto.getBirthday());
//		param.setPhoneNumber(employeesRegisterDto.getPhoneNumber());
//		param.setAddress(employeesRegisterDto.getAddress());
//		param.setEmployment(employeesRegisterDto.getEmployment());
//		param.setDivision(employeesRegisterDto.getDivision());
//		param.setJobTitle(employeesRegisterDto.getJobTitle());
//		param.setDateOfJoining(employeesRegisterDto.getDateOfJoining());
//		param.setRemarks(employeesRegisterDto.getRemarks());
//		employeesService.userCreate(param);
//
//	}
//
//
//}
//
