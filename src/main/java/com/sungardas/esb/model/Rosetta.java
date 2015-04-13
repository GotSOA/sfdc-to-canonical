package com.sungardas.esb.model;

import java.util.HashMap;
import java.util.Map;

public class Rosetta {
	
	private String key;
	private String value;
	private String sgid;
	
	public Map<String, String> translateFromSungardId(String sgid) {
		
		Map<String, String> map = new HashMap<String, String>();
		map.put(key, value);
		return map;
	}
	
	public String translateFromSungardId(String sgid, String value) {
		return key;
	}
	
	public String translateToSungardId(String key, String value) {
		return key;
	}
	
	// getter - setters
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getSgid() {
		return sgid;
	}
	public void setSgid(String sgid) {
		this.sgid = sgid;
	}
	
}
