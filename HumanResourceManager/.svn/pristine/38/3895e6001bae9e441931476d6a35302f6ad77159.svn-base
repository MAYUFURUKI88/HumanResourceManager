//package com.rapideact.local.humanresource.model;
//
//import java.io.File;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.ss.usermodel.WorkbookFactory;
//import org.json.JSONException;
//import org.json.JSONObject;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import org.springframework.web.multipart.MultipartFile;
//
//import com.rapideact.local.humanresource.dto.EmployeesAttendanceDto;
//import com.rapideact.local.humanresource.dto.EmployeesRegisterDto;
//import com.rapideact.local.humanresource.dto.EmployeesSearchDto;
//import com.rapideact.local.humanresource.mybatis.condition.EmployeesAttendanceCondition;
//import com.rapideact.local.humanresource.mybatis.condition.EmployeesCondition;
//import com.rapideact.local.humanresource.mybatis.domain.EmployeesDomain;
//import com.rapideact.local.humanresource.services.EmployeesService;
//
//
//@Component
//public class EmployeesAttendanceModel {
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
////		param.setDate(employeesRegisterDto.getDate());
////		param.setSeiKj(employeesRegisterDto.getSeiKj());
////		param.setMeiKj(employeesRegisterDto.getMeiKj());
////		param.setSeiKana(employeesRegisterDto.getSeiKana());
////		param.setMeiKana(employeesRegisterDto.getMeiKana());
////		param.setGender(employeesRegisterDto.getGender());
////		param.setBirthday(employeesRegisterDto.getBirthday());
////		param.setPhoneNumber(employeesRegisterDto.getPhoneNumber());
////		param.setAddress(employeesRegisterDto.getAddress());
////		param.setEmployment(employeesRegisterDto.getEmployment());
////		param.setDivision(employeesRegisterDto.getDivision());
////		param.setDateOfJoining(employeesRegisterDto.getDateOfJoining());
////		param.setRemarks(employeesRegisterDto.getRemarks());
//		employeesService.userCreate(param);
//
//	}
//
//
//	public void userAttendanceCreate(EmployeesAttendanceDto employeesAttendanceDto, MultipartFile multipartFile) throws IOException, JSONException {
//		System.out.println("************START************");
//	    System.out.println(multipartFile.getOriginalFilename());
//	    String orgFileName = multipartFile.getOriginalFilename();
//	    int beginningIndex = multipartFile.getOriginalFilename().indexOf("_");
//	    int lastIndex = multipartFile.getOriginalFilename().lastIndexOf("_");
//	    int extentionIndex = multipartFile.getOriginalFilename().lastIndexOf(".");
//
//	    //名前の取得
//	    String stuffName = orgFileName.substring(beginningIndex+1, lastIndex);
//	    //年月取得
//	    String editMonth = orgFileName.substring(lastIndex + 1, extentionIndex);
//
//
//		/** file UPLOADしたEXCELを保存 **/
//	    InputStream in = multipartFile.getInputStream();
//	    File currDir = new File(".");
//	    String path = currDir.getAbsolutePath();
//	    //UPLOADフォルダを格納するPATHを作成する
//	    String savePath = path.substring(0, path.length() - 1) + "excelTmp\\" + multipartFile.getOriginalFilename();
//
//	    FileOutputStream f = new FileOutputStream(savePath);
//
//	    int ch = 0;
//	    while ((ch = in.read()) != -1) {
//	        f.write(ch);
//	    }
//	    f.flush();
//	    f.close();
////	    model.addAttribute("message", "File: " + multipartFile.getOriginalFilename()
////	      + " has been uploaded successfully!");
//
//
//	    Workbook excel = WorkbookFactory.create(new File(savePath));
//	    // シート名がわかっている場合
//	    Sheet sheet = excel.getSheet("勤務実績表");
//
//
//	    //定数
//	    int TIME_INIT_ROW = 7;
//	    int TIME_COUNT_ROW = 31;
//	    int ATTENDANCE = 2;
//	    int START_TIME_COLUMN = 3;
//	    int END_TIME_COLUMN = 4;
//	    int BREAK_TIME_COLUMN = 5;
//	    int NOTE_COLUMN = 9;
//
//	    JSONObject attendanceObject = new JSONObject();
//
//	    //プロジェクト名 取得
//	    String projectName = (getCell(sheet, 3, 8)).getStringCellValue();
//
//	    //作業場所 取得
//	    String workPlace = (getCell(sheet, 4, 8)).getStringCellValue();
//
//
//	    for(int i=0; i < TIME_COUNT_ROW; i++) {
//		    JSONObject dataObject = new JSONObject();
//
//
//		    //勤怠
//	    	Cell timeIndex1 = getCell(sheet, i + TIME_INIT_ROW, ATTENDANCE);
//		    String attendanceType = timeIndex1.getStringCellValue();
//		    if(attendanceType != null) {
//		    	dataObject.put("attendance", attendanceType);
//		    }
//		    else {
//		    	dataObject.put("attendance", "");
//		    }
//
//		    //始業
//	    	Cell timeIndex2 = getCell(sheet, i + TIME_INIT_ROW, START_TIME_COLUMN);
//		    Date timeTmp1 = timeIndex2.getDateCellValue();
//		    if(timeTmp1 != null) {
//		    	String startTime = (timeTmp1.toString()).substring(11,16);
//		    	dataObject.put("startTime", startTime);
//		    }
//		    else {
//		    	dataObject.put("startTime", "0:00");
//		    }
//
//		    //終業
//	    	Cell timeIndex3 = getCell(sheet, i + TIME_INIT_ROW, END_TIME_COLUMN);
//		    Date timeTmp2 = timeIndex3.getDateCellValue();
//		    if(timeTmp2 != null) {
//		    	String endTime = (timeTmp2.toString()).substring(11,16);
//		    	dataObject.put("endTime", endTime);
//		    }
//		    else {
//		    	dataObject.put("endTime", "0:00");
//		    }
//
//	    	//休憩時間
//	    	Cell timeIndex4 = getCell(sheet, i + TIME_INIT_ROW, BREAK_TIME_COLUMN);
//		    Date timeTmp3 = timeIndex4.getDateCellValue();
//		    if(timeTmp3 != null) {
//		    	String breakTime = (timeTmp3.toString()).substring(11,16);
//		    	dataObject.put("breakTime", breakTime);
//		    }
//		    else {
//		    	dataObject.put("breakTime", "0:00");
//		    }
//
//		    //備考
//	    	Cell timeIndex5 = getCell(sheet, i + TIME_INIT_ROW, NOTE_COLUMN);
//		    String note = timeIndex5.getStringCellValue();
//		    if(note != null) {
//		    	dataObject.put("note", note);
//		    }
//		    else {
//		    	dataObject.put("note", "");
//		    }
//
//		    //JSONに格納
//		    int date_tmp = i+1;
//		    String date = String.valueOf(date_tmp);
//		    attendanceObject.put(date, dataObject);
//
//	    }
//
//	    //TODO:for 以外の処理にする
//	    List<EmployeesDomain> employeesDomainList = employeesService.userEmployeesIdSearch(stuffName);
//
//	    Integer employeesNumber = null;
//	    for (EmployeesDomain user : employeesDomainList) {
//			EmployeesAttendanceDto userresult = new EmployeesAttendanceDto();
//
//			userresult.setEmployeesId(user.getEmployeesId());
//
//			employeesNumber = user.getEmployeesId();
//		}
//
//
//
//	    /* 社員の勤怠情報をDBに登録する */
//	    for(int i = 0; i < TIME_COUNT_ROW; i++) {
//			String index = String.valueOf(i+1);
//			Object object = attendanceObject.get(index);
//			JSONObject dataObject = (JSONObject)object;
//			int date = i+1;
//			dataObject.put("date", date);
//
//			EmployeesAttendanceCondition param = new EmployeesAttendanceCondition();
//			param.setEmployeesId(employeesNumber);
//			param.setAttendanceYm(editMonth);
//			param.setAttendanceDate(dataObject.get("date"));
//			param.setAttendance(dataObject.get("attendance"));
//			param.setStartTime(dataObject.get("startTime"));
//			param.setEndTime(dataObject.get("endTime"));
//			param.setBreakTime(dataObject.get("breakTime"));
//			param.setRemark(dataObject.get("note"));
//
//			employeesService.userAttendanceCreate(param);
//
//	    }
//
//	}
//
//
//	public void delete(String[] delete_ids) {
//	// TODO 自動生成されたメソッド・スタブ
//
//	}
//
//	public List<EmployeesAttendanceDto> employeesSearch(EmployeesSearchDto employeesSearchDto) {
//		EmployeesCondition param = new EmployeesCondition();
//		param.setName(employeesSearchDto.getName());
//		param.setBirthdayFrom(employeesSearchDto.getBirthdayFrom());
//		param.setBirthdayTo(employeesSearchDto.getBirthdayTo());
//
//		List<EmployeesDomain> employeesDomainList = employeesService.userSearch(param);
//
//		List<EmployeesAttendanceDto> resultDtoList = new ArrayList<EmployeesAttendanceDto>();
//
//		if (employeesDomainList != null) {
//			for (EmployeesDomain user : employeesDomainList) {
//
//				// ユーザーの情報を詰め替えるための変数を用意する
//				EmployeesAttendanceDto userresult = new EmployeesAttendanceDto();
//
//				// ユーザーの情報を詰め替える
//				userresult.setEmployeesId(user.getEmployeesId());
//				userresult.setDate(user.getDate());
//				userresult.setSeiKj(user.getSeiKj());
//				userresult.setMeiKj(user.getMeiKj());
//				userresult.setEmployment(user.getEmployment());
//				userresult.setDivision(user.getDivision());
//				userresult.setJobTitle(user.getJobTitle());
//				userresult.setRemarks(user.getRemarks());
//
//
//				resultDtoList.add(userresult);
//			}
//		}
//		return resultDtoList;
//	}
//
//	public File multipartToFile(MultipartFile multipart) throws IllegalStateException, IOException
//    {
//        File convFile = new File( multipart.getOriginalFilename());
//        multipart.transferTo(convFile);
//        return convFile;
//    }
//
//	// セルの値を取得するメソッド && nullをチェックする
//	//                         シート        横列          縦列
//	public static Cell getCell(Sheet sheet, int rowIndex, int columnIndex) {
//		Row row = sheet.getRow(rowIndex);
//		if (row != null) {
//			Cell cell = row.getCell(columnIndex);
//			if(cell != null){
//				return cell;
//			}
//			return null;
//		}
//		return null;
//	}
//
//
//
//}
