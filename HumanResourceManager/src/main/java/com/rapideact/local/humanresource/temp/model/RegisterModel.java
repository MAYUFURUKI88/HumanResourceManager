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
//import com.rapideact.local.humanresource.dto.RegisterDto;
//import com.rapideact.local.humanresource.mybatis.condition.ApplicantCondition;
//import com.rapideact.local.humanresource.mybatis.domain.ApplicantDomain;
//import com.rapideact.local.humanresource.mybatis.domain.CodeDomain;
//import com.rapideact.local.humanresource.services.ApplicantService;
//import com.rapideact.local.humanresource.services.CodeService;
//
//import lombok.Data;
//
//@Data
//@Component
//public class RegisterModel {
//
//	@Autowired
//	private ApplicantService applicantService;
//
//	@Autowired
//	private CodeService codeService;
//
//	/**
//	 * 選考状況をmapに渡すロジック
//	 * @return 選考状況のプルダウン項目
//	 */
//	public Map<String, String> selectionCode() {
//		return pulldown(Code.SELECTION_CODE);
//
//	}
//
//	/**
//	 * 希望職種をmapに渡すロジック
//	 * @return 希望職種のプルダウン項目
//	 */
//	public Map<String, String> hopeJobCode() {
//		return pulldown(Code.HOPE_JOB_CODE);
//
//	}
//
//	/**
//	 * 応募媒体をmapに渡すロジック
//	 * @return 応募媒体のプルダウン項目
//	 */
//	public Map<String, String> mediumCode() {
//		return pulldown(Code.MEDIUM_CODE);
//	}
//
//	/**
//	 * 実務経験をmapに渡すロジック
//	 * @return 実務経験のプルダウン項目
//	 */
//	public Map<String, String> experienceCode() {
//		return pulldown(Code.EXPERIENCE_CODE);
//	}
//
//	/**
//	 * メールアドレスをmapに渡すロジック
//	 * @return メールアドレスのプルダウン項目
//	 */
//	public Map<String, String> mailCode() {
//		return pulldown(Code.MAIL_CODE);
//	}
//
//	/**
//	 * プルダウンを取得するロジック
//	 * @param code
//	 * @return 選考状況のプルダウン項目
//	 */
//	public Map<String, String> pulldown(String code) {
//		List<CodeDomain> codeDomain = codeService.pullSearch(code);
//		Map<String, String> pulldownMap = new LinkedHashMap<String, String>();
//		if (codeDomain != null) {
//			for (CodeDomain user : codeDomain) {
//
//				pulldownMap.put(user.getItemId() + user.getCodeId(), user.getCodeName());
//			}
//		}
//		return pulldownMap;
//	}
//
//	/**
//	 * 入力応募者をサービスクラスに渡し情報をDBに登録する。(同姓同名なら登録失敗させる）
//	 * @param registerDto 登録情報Dto(入力値を受け取るためのDto)
//	 * @return 登録成否（登録されたらtrue,失敗したらfalse)
//	 */
//	public boolean createApplicant(RegisterDto registerDto) {
//		//同姓同名チェックし登録の一連の流れがこのメソッド
//
//		ApplicantCondition param = new ApplicantCondition();
//		if (this.isSameNameWithout(registerDto, param)) {
//			//パラメーターをコンディションにセットしてサービスに渡す
//			registerApplicant(param, registerDto);
//			return true;//登録成功
//		}
//		return false;
//	}
//
//	/**
//	 * チェックをせず強制的に
//	 * 入力応募者をサービスクラスに渡し情報をDBに登録する。
//	 * @param registerDto 登録情報Dto(入力値を受け取るためのDto)
//	 */
//	public void registerForcibly(RegisterDto registerDto) {
//		ApplicantCondition condition = new ApplicantCondition();
//		this.registerApplicant(condition, registerDto);
//	}
//
//	/**
//	 * 入力された応募者をサービスクラスに渡し情報をDBに登録する。
//	 * @param condition サービスへ渡す条件インスタンス
//	 * @param registerDto 入力された登録情報のDto
//	 */
//	private void registerApplicant(ApplicantCondition condition, RegisterDto registerDto) {
//		//登録の実際の実装はこのメソッド
//
//		condition.setSeiKj(registerDto.getSeiKj());
//		condition.setMeiKj(registerDto.getMeiKj());
//		condition.setSeiKana(registerDto.getSeiKana());
//		condition.setMeiKana(registerDto.getMeiKana());
//		condition.setName(registerDto.getName());
//		condition.setBirthday(registerDto.getBirthday());
//		condition.setRemarks(registerDto.getRemarks());
//		condition.setAge(registerDto.getAge());
//		condition.setPhoneNumber(registerDto.getPhoneNumber());
//		condition.setMailCode(registerDto.getMailCode());
//		condition.setAddress(registerDto.getAddress());
//		condition.setSelectionCode(registerDto.getSelectionCode());
//		condition.setHopeJobCode(registerDto.getHopeJobCode());
//		condition.setMediumCode(registerDto.getMediumCode());
//		condition.setGender(registerDto.getGender());
//		condition.setExperienceCode(registerDto.getExperienceCode());
//		condition.setCareer(registerDto.getCareer());
//		applicantService.userCreate(condition);//ユーザー情報をDBに登録
//	}
//
//	/**
//	 * 同姓同名がいないか判定する(ふりがなの姓と名の一致で判別）
//	 * @param registerDto 入力された登録情報のDto
//	 * @param condition サービスへ渡す条件インスタンス
//	 * @return 同姓同名がいないかどうか(いないならtrue)
//	 */
//	private boolean isSameNameWithout(RegisterDto registerDto, ApplicantCondition condition) {
//		List<ApplicantDomain> userlist; //ユーザーのリスト
//		userlist = applicantService.userSearch(condition);
//
//		for (int i = 0; i < userlist.size(); i++) {
//			ApplicantDomain user = userlist.get(i); //ユーザ
//			if (user.getSeiKana().equals(registerDto.getSeiKana())
//					&& user.getMeiKana().equals(registerDto.getMeiKana())) {
//				return false;//同姓同名がいる
//			}
//		}
//		return true;//同姓同名がいない
//	}
//
//}
