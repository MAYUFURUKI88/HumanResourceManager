//package com.rapideact.local.humanresource.model;
//
//import java.util.LinkedHashMap;
//import java.util.List;
//import java.util.Map;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import com.rapideact.local.humanresource.common.Code;
//import com.rapideact.local.humanresource.dto.DetailDto;
//import com.rapideact.local.humanresource.mybatis.condition.ApplicantCondition;
//import com.rapideact.local.humanresource.mybatis.domain.ApplicantDomain;
//import com.rapideact.local.humanresource.mybatis.domain.CodeDomain;
//import com.rapideact.local.humanresource.services.ApplicantService;
//import com.rapideact.local.humanresource.services.CodeService;
//
//import lombok.Data;
//
///**
// * Registerモデルクラス
// * 処理の中核、データやDBに対する処理。
// */
//@Data
//@Component
//public class DetailModel {
//
//	//Serviceの操作も可能になる
//	@Autowired
//	private ApplicantService applicantService;
//	@Autowired
//	private CodeService codeService;
//
//
//	/**
//	 * 選考状況をmapに渡すロジック
//	 * @return 選考状況のプルダウン項目
//	 */
//	public Map<String,String> selectionCode() {
//		return pulldown(Code.SELECTION_CODE);
//
//	}
//	/**
//	 * 希望職種をmapに渡すロジック
//	 * @return 希望職種のプルダウン項目
//	 */
//	public Map<String,String> hopeJobCode() {
//		return pulldown(Code.HOPE_JOB_CODE);
//
//	}
//	/**
//	 * 応募媒体をmapに渡すロジック
//	 * @return 応募媒体のプルダウン項目
//	 */
//	public Map<String,String> mediumCode() {
//		return pulldown(Code.MEDIUM_CODE);
//	}
//	/**
//	 * 実務経験をmapに渡すロジック
//	 * @return 実務経験のプルダウン項目
//	 */
//	public Map<String,String> experienceCode() {
//		return pulldown(Code.EXPERIENCE_CODE);
//	}
//
//	/**
//	 * メールアドレスをmapに渡すロジック
//	 * @return メールアドレスのプルダウン項目
//	 */
//	public Map<String,String> mailCode() {
//		return pulldown(Code.MAIL_CODE);
//	}
///**
// * プルダウンを取得するロジック
// * @param code
// * @return 選考状況のプルダウン項目
// */
//
//	public Map<String,String>pulldown(String code){
//		List<CodeDomain> codeDomain = codeService.pullSearch(code);
//		Map<String,String> pulldownMap = new LinkedHashMap<String,String>();
//		if (codeDomain != null) {
//			for (CodeDomain user : codeDomain) {
//
//				pulldownMap.put(user.getItemId()+user.getCodeId(),user.getCodeName());
//			}
//		}
//
//		return pulldownMap;
//
//	}
//
//	/**
//	 * ユーザー情報表示メソッド
//	 * @param detail_id 指定されたユーザーのID
//	 * @return ユーザー情報
//	 */
//	public DetailDto show(int detail_id) {
//
//		ApplicantCondition param = new ApplicantCondition();
//		//IDからその他のユーザー情報を割り当てる
//		param.setId((detail_id));
//
//		ApplicantDomain user = applicantService.userShow(param);
//		DetailDto detailDto = new DetailDto();
//		detailDto.setId(user.getId());
//		detailDto.setApplicationDate(user.getApplicationDate());
//		detailDto.setSeiKj(user.getSeiKj());
//		detailDto.setMeiKj(user.getMeiKj());
//		detailDto.setSeiKana(user.getSeiKana());
//		detailDto.setMeiKana(user.getMeiKana());
//		detailDto.setBirthday(user.getBirthday());
//		detailDto.setRemarks(user.getRemarks());
//		detailDto.setAge(user.getAge());
//		detailDto.setPhoneNumber(user.getPhoneNumber());
//		detailDto.setMailCode(user.getMailCode());
//		detailDto.setAddress(user.getAddress());
//		detailDto.setSelectionCode(user.getSelectionCode());
//		detailDto.setMediumCode(user.getMediumCode());
//		detailDto.setHopeJobCode(user.getHopeJobCode());
//		detailDto.setGender(user.getGender());
//		detailDto.setExperienceCode(user.getExperienceCode());
//		detailDto.setCareer(user.getCareer());
//		return detailDto;
//
//	}
//
//	/**
//	 * ユーザー情報更新メソッド
//	 * @param detailDto 入力された引数
//	 */
//	public void create(DetailDto detailDto) {
//
//		ApplicantCondition param = new ApplicantCondition();
//		param.setId(detailDto.getId());
//		param.setApplicationDate(detailDto.getApplicationDate());
//		param.setSeiKj(detailDto.getSeiKj());
//		param.setMeiKj(detailDto.getMeiKj());
//		param.setSeiKana(detailDto.getSeiKana());
//		param.setMeiKana(detailDto.getMeiKana());
//		param.setBirthday(detailDto.getBirthday());
//		param.setRemarks(detailDto.getRemarks());
//		param.setAge(detailDto.getAge());
//		param.setPhoneNumber(detailDto.getPhoneNumber());
//		param.setMailCode(detailDto.getMailCode());
//		param.setAddress(detailDto.getAddress());
//		param.setSelectionCode(detailDto.getSelectionCode());
//		param.setMediumCode(detailDto.getMediumCode());
//		param.setHopeJobCode(detailDto.getHopeJobCode());
//		param.setGender(detailDto.getGender());
//		param.setExperienceCode(detailDto.getExperienceCode());
//		param.setCareer(detailDto.getCareer());
//
//		//Serviceに送る
//		applicantService.userDetail(param);
//
//	}
//
//}