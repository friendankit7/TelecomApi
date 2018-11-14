package com.and.digital.api.telecomprovider.dto;

import java.io.Serializable;

/**
 *
 * @author ankit goyal
 *
 */
public class PhoneNumberDTO implements Serializable {
	 
	private static final long serialVersionUID = 1L;

	private String customerName;
	
	private String phoneNumber;
	
	private String circleCode;
	
	private String operatorName;
	
	private String status;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

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
	
}
