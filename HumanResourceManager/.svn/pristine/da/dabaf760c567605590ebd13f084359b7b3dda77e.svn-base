//
//package com.rapideact.local.humanresource.model;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import com.rapideact.local.humanresource.dto.EmployeesResultDto;
//import com.rapideact.local.humanresource.dto.EmployeesSearchDto;
//import com.rapideact.local.humanresource.mybatis.condition.EmployeesCondition;
//import com.rapideact.local.humanresource.mybatis.domain.EmployeesDomain;
//import com.rapideact.local.humanresource.services.EmployeesService;
//
//import lombok.Data;
//
//@Data
//@Component
//public class EmployeesResultModel {
//	@Autowired
//	private EmployeesService employeesService;
//
//	/**
//	 * 検索業務ロジック
//	 * @param searchDto
//	 * @return 検索結果searchResultDto
//	 */
//	public List<EmployeesResultDto> search(EmployeesSearchDto employeesSearchDto) {
//
//		EmployeesCondition param = new EmployeesCondition();
//		param.setName(employeesSearchDto.getName());
//		param.setBirthdayFrom(employeesSearchDto.getBirthdayFrom());
//		param.setBirthdayTo(employeesSearchDto.getBirthdayTo());
//
//		List<EmployeesDomain> employeesDomainList = employeesService.userSearch(param);
//
//		List<EmployeesResultDto> resultDtoList = new ArrayList<EmployeesResultDto>();
//
//		if (employeesDomainList != null) {
//			for (EmployeesDomain user : employeesDomainList) {
//
//				// ユーザーの情報を詰め替えるための変数を用意する
//				EmployeesResultDto userresult = new EmployeesResultDto();
//
//				// ユーザーの情報を詰め替える
//				userresult.setEmployeesId(user.getEmployeesId());
//				userresult.setDate(user.getDate());
//				userresult.setSeiKj(user.getSeiKj());
//				userresult.setMeiKj(user.getMeiKj());
//				userresult.setSeiKana(user.getSeiKana());
//				userresult.setMeiKana(user.getMeiKana());
//				userresult.setBirthday(user.getBirthday());
//				userresult.setRemarks(user.getRemarks());
//
//
//				resultDtoList.add(userresult);
//			}
//		}
//		return resultDtoList ;
//
//	}
//
//
//
//	/**
//	 * 削除機能
//	 * @param delete_ids
//	 */
//	public void delete(String[] delete_ids) {
//		EmployeesCondition param = new EmployeesCondition();
//		if (delete_ids.length > 0) {
//			for (int i = 0; i < delete_ids.length; i++) {
//				param.setEmployeesId(Integer.parseInt(delete_ids[i]));
//
//				/*param.setDate(deleteuser.getDate());
//				param.setName(deleteuser.getName());
//				param.setBirthday(deleteuser.getBirthday());
//				param.setRemarks(deleteuser.getRemarks());*/
//
//				employeesService.userDelete(param);
//			}
//		}
//	}
//}
