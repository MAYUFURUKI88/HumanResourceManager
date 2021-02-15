//
//
//package com.rapideact.local.humanresource.model;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import org.thymeleaf.util.StringUtils;
//
//import com.rapideact.local.humanresource.dto.ResultDto;
//import com.rapideact.local.humanresource.dto.SearchDto;
//import com.rapideact.local.humanresource.mybatis.condition.ApplicantCondition;
//import com.rapideact.local.humanresource.mybatis.domain.ApplicantDomain;
//import com.rapideact.local.humanresource.services.ApplicantService;
//
//import lombok.Data;
//
//@Data
//@Component
//public class ResultModel {
//	@Autowired
//	private ApplicantService applicantService;
//
//	/**
//	 * 検索業務ロジック
//	 * @param searchDto
//	 * @return 検索結果searchResultDto
//	 */
//	public List<ResultDto> search(SearchDto searchDto) {
//
//		ApplicantCondition param = new ApplicantCondition();
//		param.setName(searchDto.getName());
//		param.setBirthdayFrom(searchDto.getBirthdayFrom());
//		param.setBirthdayTo(searchDto.getBirthdayTo());
//
//		List<ApplicantDomain> applicantDomainList = applicantService.userSearch(param);
//
//		List<ResultDto> resultDtoList = new ArrayList<ResultDto>();
//
//		if (applicantDomainList != null) {
//			for (ApplicantDomain user : applicantDomainList) {
//
//				// ユーザーの情報を詰め替えるための変数を用意する
//				ResultDto userresult = new ResultDto();
//
//				// ユーザーの情報を詰め替える
//				userresult.setId(user.getId());
//				userresult.setApplicationDate(user.getApplicationDate());
//				userresult.setSeiKj(user.getSeiKj());
//				userresult.setMeiKj(user.getMeiKj());
//				userresult.setSeiKana(user.getSeiKana());
//				userresult.setMeiKana(user.getMeiKana());
//				userresult.setBirthday(user.getBirthday());
//				userresult.setRemarks(user.getRemarks());
//
//				//備考の文字数が10以上の場合、11文字目から省略
//				if(user.getRemarks().length()>10) {
//					userresult.setRemarksryak(StringUtils.abbreviate(user.getRemarks(),13));
//                //備考の文字数が10以内の場合
//				}else if(user.getRemarks().length()<=10) {
//					userresult.setRemarksryak(user.getRemarks());
//				}
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
//		ApplicantCondition param = new ApplicantCondition();
//		if (delete_ids.length > 0) {
//			for (int i = 0; i < delete_ids.length; i++) {
//				param.setId(Integer.parseInt(delete_ids[i]));
//
//				/*param.setDate(deleteuser.getDate());
//				param.setName(deleteuser.getName());
//				param.setBirthday(deleteuser.getBirthday());
//				param.setRemarks(deleteuser.getRemarks());*/
//
//				applicantService.userDelete(param);
//			}
//		}
//	}
//
//}