package com.rapideact.local.humanresource.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import lombok.Data;
import lombok.Getter;

@Data
public class DevModel {
	
	DevModel() {
		this.manualColumns = new ArrayList<>(Arrays.asList("d.name", "gender"));
	}
	
	// input value
	private Integer draw;
	private Integer start;
	private Integer length;
	private List<HashMap<String, String>> order;
  
	// output value
	private Integer recordsTotal;
	private Integer recordsFiltered;
	private List<HashMap<String, String>> data;
	
	// generate value
	private List<String> manualColumns;
	private String orderColumnName;
	private String orderDir;
	
	// search value
	private String searchName;
	private String searchGender;
	
	public void setSearchName(String searchName) {
		if (searchName.equals("")) {
			this.searchName = null;
		} else {
			this.searchName = searchName;
		}
	}
	
	public void setSearchGender(String searchGender) {
		if (searchGender.equals("")) {
			this.searchGender = null;
		} else {
			this.searchGender = searchGender;
		}
	}
	
	public void setOrderColumnName(){
		Integer OrderColumnIndex = new Integer(this.order.get(0).get("column"));
		this.orderColumnName = this.manualColumns.get(OrderColumnIndex);
	}
	
	public void setOrderDir(){
		this.orderDir = this.order.get(0).get("dir");
	}

	public void setOrder() {
		setOrderColumnName();
		setOrderDir();
	}
}