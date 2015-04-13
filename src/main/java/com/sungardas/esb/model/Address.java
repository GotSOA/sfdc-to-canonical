package com.sungardas.esb.model;

import java.util.List;

public class Address {
	private String address1;
	private String address2;
	private String city;
	private String county;
	private String state;
	private String zip;
	private String country;
	private List<Phone> phone;
	private Phone phone2;
	private Phone fax;
	private String email;
	
	
	class Phone {
		private String type;
		private int countryCode;
		private String phoneNumber;

		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public int getCountryCode() {
			return countryCode;
		}
		public void setCountryCode(int countryCode) {
			this.countryCode = countryCode;
		}
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		
	}


	public String getAddress1() {
		return address1;
	}


	public void setAddress1(String address1) {
		this.address1 = address1;
	}


	public String getAddress2() {
		return address2;
	}


	public void setAddress2(String address2) {
		this.address2 = address2;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getCounty() {
		return county;
	}


	public void setCounty(String county) {
		this.county = county;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getZip() {
		return zip;
	}


	public void setZip(String zip) {
		this.zip = zip;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public List<Phone> getPhone() {
		return phone;
	}


	public void setPhone(List<Phone> phone) {
		this.phone = phone;
	}


	public Phone getPhone2() {
		return phone2;
	}


	public void setPhone2(Phone phone2) {
		this.phone2 = phone2;
	}


	public Phone getFax() {
		return fax;
	}


	public void setFax(Phone fax) {
		this.fax = fax;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
