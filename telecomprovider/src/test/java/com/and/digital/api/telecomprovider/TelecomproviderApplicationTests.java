package com.and.digital.api.telecomprovider;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.and.digital.api.telecomprovider.controller.CustomerPhoneController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TelecomproviderApplicationTests {

	@Test
	public void contextLoads() {
	}

	
	@Test
	public void testAllPhoneNumberNotNull(){
		CustomerPhoneController controller = new CustomerPhoneController();
		List<PhoneNumberDTO> phoneNumberList =  controller.getAllPhoneNumbers();
		assertTrue(phoneNumberList != null);
	}
	
	@Test
	public void testAllPhoneNumberNonEmptyList(){
		CustomerPhoneController controller = new CustomerPhoneController();
		List<PhoneNumberDTO> phoneNumberList =  controller.getAllPhoneNumbers();
		assertTrue(!phoneNumberList.isEmpty());
	}
	
	@Test
	public void testCustomerPhoneNumberNotEmpty(){
		CustomerPhoneController controller = new CustomerPhoneController();
		List<PhoneNumberDTO> phoneNumberList =  controller.getCustomerPhoneNumbers(100);
		assertTrue(!phoneNumberList.isEmpty());
	}
	
	@Test
	public void testCustomerPhoneNumberIsEmpty(){
		CustomerPhoneController controller = new CustomerPhoneController();
		List<PhoneNumberDTO> phoneNumberList =  controller.getCustomerPhoneNumbers(101);
		assertTrue(phoneNumberList.isEmpty());
	}
	
	@Test
	public void testActivatePhoneNumberSuccess(){
		CustomerPhoneController controller = new CustomerPhoneController();
		PhoneNumberDTO phoneNumber =  controller.activatePhoneNumber("+2132090090");
		assertEquals("Active", phoneNumber.getStatus());
	}
}
