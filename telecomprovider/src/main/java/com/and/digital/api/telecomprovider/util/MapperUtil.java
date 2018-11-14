package com.and.digital.api.telecomprovider.util;

import com.and.digital.api.telecomprovider.dto.PhoneNumberDTO;
import com.and.digital.api.telecomprovider.entity.PhoneNumber;

public class MapperUtil {
	
	public static PhoneNumberDTO mapEntityToDTO(PhoneNumber phoneNumber) {
		PhoneNumberDTO phoneNumberDTO = new PhoneNumberDTO();
		phoneNumberDTO.setCircleCode(phoneNumber.getCircleCode());
		phoneNumberDTO.setCustomerName(phoneNumber.getCustomer().getName());
		phoneNumberDTO.setOperatorName(phoneNumber.getOperatorName());
		phoneNumberDTO.setPhoneNumber(phoneNumber.getPhoneNumber());
		phoneNumberDTO.setStatus(phoneNumber.getStatus());
		return phoneNumberDTO;
	}

}
