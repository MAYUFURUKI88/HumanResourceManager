//package com.rapideact.local.humanresource.model;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import com.rapideact.local.humanresource.dto.FixDto;
//import com.rapideact.local.humanresource.mybatis.condition.ApplicantCondition;
//import com.rapideact.local.humanresource.mybatis.domain.ApplicantDomain;
//import com.rapideact.local.humanresource.services.ApplicantService;
//
//import lombok.Data;
//
///**
// * Registerモデルクラス
// * 処理の中核、データやDBに対する処理。
// */
//@Data
//@Component
//public class FixModel {
//
//	//Serviceの操作も可能になる
//	@Autowired
//	private ApplicantService applicantService;
//
//	/**
//	 * ユーザー情報表示メソッド
//	 * @param fix_id 指定されたユーザーのID
//	 * @return ユーザー情報
//	 */
//	public FixDto show(int fix_id) {
//
//		ApplicantCondition param = new ApplicantCondition();
//		//IDからその他のユーザー情報を割り当てる
//		param.setId((fix_id));
//
//		ApplicantDomain user = applicantService.userShow(param);
//		FixDto fixDto = new FixDto();
//		fixDto.setId(user.getId());
//		fixDto.setApplicationDate(user.getApplicationDate());
//		fixDto.setSeiKj(user.getSeiKj());
//		fixDto.setMeiKj(user.getMeiKj());
//		fixDto.setSeiKana(user.getSeiKana());
//		fixDto.setMeiKana(user.getMeiKana());
//		fixDto.setBirthday(user.getBirthday());
//		fixDto.setRemarks(user.getRemarks());
//		return fixDto;
//
//	}
//
//	/**
//	 * ユーザー情報更新メソッド
//	 * @param fixDto 入力された引数
//	 */
//	public void create(FixDto fixDto) {
//
//		ApplicantCondition param = new ApplicantCondition();
//		param.setId(fixDto.getId());
//		param.setApplicationDate(fixDto.getApplicationDate());
//		param.setSeiKj(fixDto.getSeiKj());
//		param.setMeiKj(fixDto.getMeiKj());
//		param.setSeiKana(fixDto.getSeiKana());
//		param.setMeiKana(fixDto.getMeiKana());
//		param.setBirthday(fixDto.getBirthday());
//		param.setRemarks(fixDto.getRemarks());
//		//Serviceに送る
//		applicantService.userFix(param);
//
//	}
//
//}
