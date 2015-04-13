package com.sungardas.esb.model;

import java.util.List;

public class BillingAccount {
	private long accountId;
	private String currency;
	private CustomerContact billingContact;
	private Address billingAddress;
	private List<Usage> usage;
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public CustomerContact getBillingContact() {
		return billingContact;
	}
	public void setBillingContact(CustomerContact billingContact) {
		this.billingContact = billingContact;
	}
	public Address getBillingAddress() {
		return billingAddress;
	}
	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}
	public List<Usage> getUsage() {
		return usage;
	}
	public void setUsage(List<Usage> usage) {
		this.usage = usage;
	}

	
	
}
