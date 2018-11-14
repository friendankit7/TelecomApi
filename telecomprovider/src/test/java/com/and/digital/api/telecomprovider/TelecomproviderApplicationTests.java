package com.and.digital.api.telecomprovider;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.and.digital.api.telecomprovider.controller.CustomerPhoneController;
import com.and.digital.api.telecomprovider.dto.PhoneNumberDTO;
import com.and.digital.api.telecomprovider.service.PhoneNumberService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TelecomproviderApplicationTests {

	@InjectMocks
	CustomerPhoneController controller;
	
	@Mock
	PhoneNumberService phoneNumberService;
	
	@Before
	public void init() {
		controller = new CustomerPhoneController(phoneNumberService);
		
		List<PhoneNumberDTO> phoneNumbers = new ArrayList<PhoneNumberDTO>();
		PhoneNumberDTO phoneNumber= new PhoneNumberDTO();
		phoneNumber.setCircleCode("Andy");
		phoneNumber.setCircleCode("London");
		phoneNumber.setOperatorName("Vodafone");
		phoneNumber.setPhoneNumber("+448989989");
		phoneNumber.setStatus("InActive");
		
		PhoneNumberDTO otherPhoneNumber= new PhoneNumberDTO();
		otherPhoneNumber.setCircleCode("Andy");
		otherPhoneNumber.setCircleCode("London");
		otherPhoneNumber.setOperatorName("Vodafone");
		otherPhoneNumber.setPhoneNumber("+2132090090");
		otherPhoneNumber.setStatus("Active");
		phoneNumbers.add(otherPhoneNumber);
		when(phoneNumberService.getAllPhoneNumbers()).thenReturn(phoneNumbers);
		
		when(phoneNumberService.getCustomerPhoneNumbers(100)).thenReturn(phoneNumbers);
		when(phoneNumberService.getCustomerPhoneNumbers(101)).thenReturn(new ArrayList<PhoneNumberDTO>());
		when(phoneNumberService.activatePhoneNumber("+2132090090")).thenReturn(otherPhoneNumber);
	}

	
	@Test
	public void testAllPhoneNumberNotNull(){
		List<PhoneNumberDTO> phoneNumberList =  controller.getAllPhoneNumbers();
		assertTrue(phoneNumberList != null);
	}
	
	@Test
	public void testAllPhoneNumberNonEmptyList(){
		List<PhoneNumberDTO> phoneNumberList =  controller.getAllPhoneNumbers();
		assertTrue(!phoneNumberList.isEmpty());
	}
	
	@Test
	public void testCustomerPhoneNumberNotEmpty(){
		List<PhoneNumberDTO> phoneNumberList =  controller.getCustomerPhoneNumbers(100);
		assertTrue(!phoneNumberList.isEmpty());
	}
	
	@Test
	public void testCustomerPhoneNumberIsEmpty(){
		List<PhoneNumberDTO> phoneNumberList =  controller.getCustomerPhoneNumbers(101);
		assertTrue(phoneNumberList.isEmpty());
	}
	
	@Test
	public void testActivatePhoneNumberSuccess(){
		PhoneNumberDTO phoneNumber =  controller.activatePhoneNumber("+2132090090");
		assertEquals("Active", phoneNumber.getStatus());
	}
}
