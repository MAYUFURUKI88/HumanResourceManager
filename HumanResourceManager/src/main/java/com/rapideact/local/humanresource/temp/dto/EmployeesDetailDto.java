//package com.rapideact.local.humanresource.dto;
//
//import javax.validation.constraints.NotEmpty;
//import javax.validation.constraints.Size;
//
//import lombok.Data;
//
///**
// * DetailDtoクラス
// * データを一つにまとめ、格納・読み出しのためのメソッドを定義したオブジェクト。
// */
//@Data
//public class EmployeesDetailDto {
//	/**
//	 * ID
//	 */
//	private int employeesId;
//	/**
//	 * 日付
//	 */
//	private String date;
//	/**
//	 * 苗字_漢字
//	 */
//	@NotEmpty(message="名前は必須です。")
//	@Size(max=20,message="名前は20文字以内で入力してください。")
//    private String seiKj;
//	/**
//	 * 名前_漢字
//	 */
//	@NotEmpty(message="名前は必須です。")
//	@Size(max=20,message="名前は20文字以内で入力してください。")
//    private String meiKj;
//	/**
//	 * 苗字_ひらがな
//	 */
//	@NotEmpty(message="名前は必須です。")
//	@Size(max=20,message="名前は20文字以内で入力してください。")
//    private String seiKana;
//	/**
//	 * 名前_ひらがな
//	 */
//	@NotEmpty(message="名前は必須です。")
//	@Size(max=20,message="名前は20文字以内で入力してください。")
//    private String meiKana;
//	/**
//	 * 性別
//	 */
//	private String gender;
//	/**
//	 * 電話番号
//	 */
//	private String phoneNumber;
//	/**
//	 * 住所
//	 */
//	private String address;
//	/**
//	 * 誕生日
//	 */
//	private String birthday;
//	/**
//	 * 雇用形態
//	 */
//	private String employment;
//	/**
//	 * 部署名
//	 */
//	private String division;
//	/**
//	 * 役職名
//	 */
//	private String jobTitle;
//	/**
//	 * 入社日
//	 */
//	private String dateOfJoining;
//	/**
//	 * 退職日
//	 */
//	private String dateOfRetirement;
//	/**
//	 * 備考
//	 */
//	@Size(max=200,message="備考は200字以内で入力してください。")
//	private String remarks;
//
//}
