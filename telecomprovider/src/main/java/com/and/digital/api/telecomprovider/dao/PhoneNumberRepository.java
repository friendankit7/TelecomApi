package com.and.digital.api.telecomprovider.dao;

import java.util.List;

import com.and.digital.api.telecomprovider.dto.PhoneNumberDTO;
import com.and.digital.api.telecomprovider.entity.PhoneNumber;

public interface PhoneNumberRepository {

	List<PhoneNumber> getAllPhoneNumbers();

	List<PhoneNumber> getCustomerPhoneNumbers(int customerId);

	PhoneNumberDTO activatePhoneNumber(String phoneNumber);

}
