package com.and.digital.api.telecomprovider.entity;

import java.io.Serializable;
import java.util.List;

public class Customer implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private String name;
	
	private String address;
	
	private int age;
	
	private List<PhoneNumber> phoneNumbers;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<PhoneNumber> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

}
