package com.sungardas.esb.model;

import java.util.List;

public class Customer {
	private String sgid;
	private String parentId;
	private String companyName;
	private String companyDomain;
	private Address address;
	private List<CustomerContact> customerContact;
	private List<SgasContact> sgasContact;
	private List<BillingAccount> billingAccount;
	private List<Order> order;
	private String customerType;

	public String getSgid() {
		return sgid;
	}

	public void setSgid(String sgid) {
		this.sgid = sgid;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyDomain() {
		return companyDomain;
	}

	public void setCompanyDomain(String companyDomain) {
		this.companyDomain = companyDomain;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<CustomerContact> getCustomerContact() {
		return customerContact;
	}

	public void setCustomerContact(List<CustomerContact> customerContact) {
		this.customerContact = customerContact;
	}

	public List<SgasContact> getSgasContact() {
		return sgasContact;
	}

	public void setSgasContact(List<SgasContact> sgasContact) {
		this.sgasContact = sgasContact;
	}

	public List<BillingAccount> getBillingAccount() {
		return billingAccount;
	}

	public void setBillingAccount(List<BillingAccount> billingAccount) {
		this.billingAccount = billingAccount;
	}

	public List<Order> getOrder() {
		return order;
	}

	public void setOrder(List<Order> order) {
		this.order = order;
	}

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	
}
