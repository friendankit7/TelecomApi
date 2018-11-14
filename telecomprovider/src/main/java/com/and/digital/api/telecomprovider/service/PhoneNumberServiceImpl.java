package com.and.digital.api.telecomprovider.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.and.digital.api.telecomprovider.dao.PhoneNumberRepository;
import com.and.digital.api.telecomprovider.dto.PhoneNumberDTO;
import com.and.digital.api.telecomprovider.entity.PhoneNumber;
import com.and.digital.api.telecomprovider.util.MapperUtil;

@Service
public class PhoneNumberServiceImpl implements PhoneNumberService {

	PhoneNumberRepository phoneNumberRepository;
	
	@Override
	public List<PhoneNumberDTO> getAllPhoneNumbers() {
		List<PhoneNumber> phoneNumbers = phoneNumberRepository.getAllPhoneNumbers();
		List<PhoneNumberDTO> phoneNumberDTOList = new ArrayList<PhoneNumberDTO>();
		phoneNumbers.stream().forEach(phoneNumber -> phoneNumberDTOList.add(MapperUtil.mapEntityToDTO(phoneNumber)));
		return phoneNumberDTOList;
	}

	@Override
	public List<PhoneNumberDTO> getCustomerPhoneNumbers(int customerId) {
		List<PhoneNumber> phoneNumbers = phoneNumberRepository.getCustomerPhoneNumbers(customerId);
		List<PhoneNumberDTO> phoneNumberDTOList = new ArrayList<PhoneNumberDTO>();
		phoneNumbers.stream().forEach(phoneNumber -> phoneNumberDTOList.add(MapperUtil.mapEntityToDTO(phoneNumber)));
		return phoneNumberDTOList;
	}

	@Override
	public PhoneNumberDTO activatePhoneNumber(String phoneNumber) {
		return phoneNumberRepository.activatePhoneNumber(phoneNumber);
	}

}
