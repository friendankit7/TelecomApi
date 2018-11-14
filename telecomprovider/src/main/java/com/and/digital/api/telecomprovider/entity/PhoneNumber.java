package com.and.digital.api.telecomprovider.entity;

import java.io.Serializable;

/**
 *
 * @author ankit goyal
 *
 */
public class PhoneNumber implements Serializable {
	 
	private static final long serialVersionUID = 1L;

	private String phoneNumber;
	
	private String circleCode;
	
	private String operatorName;
	
	private String status;
	
	private Customer customer;

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getCircleCode() {
		return circleCode;
	}

	public void setCircleCode(String circleCode) {
		this.circleCode = circleCode;
	}

	public String getOperatorName() {
		return operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
}
