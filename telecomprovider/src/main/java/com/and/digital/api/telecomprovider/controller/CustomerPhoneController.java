package com.and.digital.api.telecomprovider.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.and.digital.api.telecomprovider.dto.PhoneNumberDTO;
import com.and.digital.api.telecomprovider.service.PhoneNumberService;

@RestController
@RequestMapping("api/")
public class CustomerPhoneController {

	@Autowired
	private PhoneNumberService phoneNumberService;
	
	public CustomerPhoneController(PhoneNumberService phoneNumberService) {
		this.phoneNumberService =  phoneNumberService;
	}
	
	@GetMapping("/phoneNumbers")
	public List<PhoneNumberDTO> getAllPhoneNumbers() {
		return phoneNumberService.getAllPhoneNumbers();
	}

	@GetMapping("/phoneNumbers/{customerId}")
	public List<PhoneNumberDTO> getCustomerPhoneNumbers(@PathVariable int customerId) {
		return phoneNumberService.getCustomerPhoneNumbers(customerId);
	}

	@PostMapping("/activatePhoneNumber/")
	public PhoneNumberDTO activatePhoneNumber(@RequestBody String phoneNumber) {
		return phoneNumberService.activatePhoneNumber(phoneNumber);
	}
}
