//package com.rapideact.local.humanresource.dto;
//
//
//import java.io.Serializable;
//
//import javax.validation.constraints.NotEmpty;
//import javax.validation.constraints.Size;
//
//import lombok.Data;
//
///**
// * RegisterDtoクラス
// */
//@Data
//public class EmployeesRegisterDto implements Serializable {
//	/**
//	 * ID
//	 */
//	private Integer employeesId;
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
//    private String gender;
//	/**
//	 * 誕生日
//	 */
//    private String birthday;
//	/**
//	 * 電話番号
//	 */
//    private String phoneNumber;
//	/**
//	 * 住所
//	 */
//    private String address;
//	/**
//	 * 雇用形態
//	 */
//	@Size(max=20,message="雇用形態は20文字以内で入力してください。")
//    private String employment;
//	/**
//	 * 部署名
//	 */
//	@Size(max=20,message="雇用形態は20文字以内で入力してください。")
//    private String division;
//	/**
//	 * 役職名
//	 */
//    private String jobTitle;
//	/**
//	 * 入社日
//	 */
//	@Size(max=20,message="雇用形態は20文字以内で入力してください。")
//    private String dateOfJoining;
//	/**
//	 * 退職日
//	 */
//	private String dateOfRetirement;
//    /**
//     *備考
//     */
//    @Size(max=200,message="備考は200文字以内で入力してください。")
//    private String remarks;
//}