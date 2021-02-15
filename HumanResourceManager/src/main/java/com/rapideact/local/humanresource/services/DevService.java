package com.rapideact.local.humanresource.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rapideact.local.humanresource.mappers.DevMapper;
import com.rapideact.local.humanresource.models.DevModel;

@Service
public class DevService {

	@Autowired
	private DevMapper devMapper;

	public String test() {
		System.out.println("called service");
		Integer ret = devMapper.test();
		System.out.println("service ret = " + ret);
		return ret.toString();
	}
	
	public Integer getDemoCount() {
		System.out.println(devMapper.getDemoCount());
		return devMapper.getDemoCount();
	}
	
	public List<HashMap<String, String>> getDemoData(DevModel devModel) {
		System.out.println(devMapper.getDemoData(devModel));
		return devMapper.getDemoData(devModel);
	}
}
