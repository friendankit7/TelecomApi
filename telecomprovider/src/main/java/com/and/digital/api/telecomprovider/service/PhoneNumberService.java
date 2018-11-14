package com.and.digital.api.telecomprovider.service;

import java.util.List;

import com.and.digital.api.telecomprovider.dto.PhoneNumberDTO;

public interface PhoneNumberService {

	List<PhoneNumberDTO> getAllPhoneNumbers();

	List<PhoneNumberDTO> getCustomerPhoneNumbers(int customerId);

	PhoneNumberDTO activatePhoneNumber(String phoneNumber);

}
