package com.and.digital.api.telecomprovider.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.and.digital.api.telecomprovider.dto.PhoneNumberDTO;

@RestController
@RequestMapping("api/")
public class CustomerPhoneController {

	
	@GetMapping("/phoneNumbers")
	public List<PhoneNumberDTO> getAllPhoneNumbers() {
		return null;
	}

	@GetMapping("/phoneNumbers/{customerId}")
	public List<PhoneNumberDTO> getCustomerPhoneNumbers(@PathVariable int customerId) {
		return null;
	}

	@PostMapping("/activatePhoneNumber/{phoneNumber}")
	public PhoneNumberDTO activatePhoneNumber(@PathVariable String phoneNumber) {
		return null;
	}
}
