//
//package com.rapideact.local.humanresource.model;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import com.rapideact.local.humanresource.dto.UserdeleteDto;
//import com.rapideact.local.humanresource.mybatis.condition.UserCondition;
//import com.rapideact.local.humanresource.mybatis.domain.UserDomain;
//import com.rapideact.local.humanresource.services.UserService;
//
//import lombok.Data;
//
///**
// * 管理者削除画面のモデルクラス
// *
// */
//@Data
//@Component
//public class UserResultModel {
//	@Autowired
//	private UserService userService;
//
//	/**
//	 * 管理者全件検索
//	 * @return 結果searchuserdeleteDto
//	 */
//	public List<UserdeleteDto> search() {
//
//		List<UserDomain> userDomainList = userService.selectAll();
//
//		List<UserdeleteDto> userdeleteDtoList = new ArrayList<UserdeleteDto>();
//
//		if (userDomainList != null) {
//			for (UserDomain user : userDomainList) {
//
//				// ユーザーの情報を詰め替えるための変数を用意する
//				UserdeleteDto userResult = new UserdeleteDto();
//
//				// ユーザーの情報を詰め替える
//				userResult.setMail(user.getMail());
//				userResult.setPrivilege(user.getPrivilegeCode());
//				userResult.setDeletedFlg(user.getDeleteFlg());
//				userdeleteDtoList.add(userResult);
//			}
//		}
//
//		return userdeleteDtoList;
//	}
//
//	/**
//	 * 削除機能
//	 * @param delete_ids リクエストパラメータ
//	 */
//	public void userdelete(String[] delete_ids) {
//		UserCondition param = new UserCondition();
//		if (delete_ids.length > 0) {
//			for (int i = 0; i < delete_ids.length; i++) {
//				param.setMail(delete_ids[i]);
//
//				userService.userDelete(param);
//			}
//		}
//	}
//}