package com.and.digital.api.telecomprovider.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.and.digital.api.telecomprovider.dto.PhoneNumberDTO;

@Service
public class PhoneNumberServiceImpl implements PhoneNumberService {

	@Override
	public List<PhoneNumberDTO> getAllPhoneNumbers() {
		return null;
	}

	@Override
	public List<PhoneNumberDTO> getCustomerPhoneNumbers(int customerId) {
		return null;
	}

	@Override
	public PhoneNumberDTO activatePhoneNumber(String phoneNumber) {
		return null;
	}

}
