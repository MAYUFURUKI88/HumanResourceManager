//package com.rapideact.local.humanresource.model;
//
//import java.util.LinkedHashMap;
//import java.util.List;
//import java.util.Map;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Component;
//
//import com.rapideact.local.humanresource.common.Code;
//import com.rapideact.local.humanresource.dto.UserDto;
//import com.rapideact.local.humanresource.mybatis.condition.UserCondition;
//import com.rapideact.local.humanresource.mybatis.domain.CodeDomain;
//import com.rapideact.local.humanresource.mybatis.domain.UserDomain;
//import com.rapideact.local.humanresource.services.CodeService;
//import com.rapideact.local.humanresource.services.UserService;
//
//import lombok.Data;
//
///**
// *管理者登録画面のモデルクラス
// */
//@Component
//@Data
//public class UserRegisterModel {
//
//	@Autowired
//	private UserService userSearvice;
//	@Autowired
//	private CodeService codeService;
//	@Autowired
//	PasswordEncoder passwordEncoder;
//
//	/**
//	 * 入力したユーザーを登録する
//	 * (同じパスワードで既に登録されてるならば登録失敗する）
//	 * @param userDto ユーザー登録情報
//	 * @return ユーザーの登録成否
//	 */
//	public boolean userCreate(UserDto userDto) {
//		UserCondition userCondition = new UserCondition();
//
//		List<UserDomain> userlist; //ユーザーのリスト
//		userlist = userSearvice.selectAll();
//
//		for (int i = 0; i < userlist.size(); i++) {
//			UserDomain registeredUser = userlist.get(i); //ユーザー
//			if (registeredUser.getMail().equals(userDto.getMail())) {
//				return false;//登録失敗
//			}
//		}
//
//		//パラメーターをコンディションにセットしてサービスに渡す
//		userCondition.setMail(userDto.getMail());
//		userCondition.setPassword(passwordEncoder.encode(userDto.getPassword()));// パスワードを暗号化する
//		userCondition.setPrivilegeCode(userDto.getPrivilegeCode());
//
//		userSearvice.userCreate(userCondition);//ユーザー情報をDBに登録
//
//		return true;//登録成功
//	}
//
//	/**
//	 * 管理権限(画面でのプルダウン項目)と実際のDB登録データのマップを作製
//	 * @return プルダウン項目、
//	 */
//	public Map<String, String> privilegeCode() {
//		return pulldown(Code.PRIVILEGE_CODE);
//	}
//
//	/**
//	 * プルダウン項目とDBへの登録データの紐づけを行う
//	 * @param code プルダウン項目名
//	 * @return プルダウン項目(DBへの実際の登録データ,プルダウン項目のmap）
//	 */
//	private Map<String, String> pulldown(String code) {
//		List<CodeDomain> codeDomain = codeService.pullSearch(code);
//		Map<String, String> pulldownMap = new LinkedHashMap<String, String>();
//		if (codeDomain != null) {
//			for (CodeDomain user : codeDomain) {
//				pulldownMap.put(user.getItemId() + user.getCodeId(), user.getCodeName());
//			}
//		}
//		return pulldownMap;
//	}
//
//}
