package com.and.digital.api.telecomprovider;

import java.util.List;

import javax.validation.constraints.AssertTrue;

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
		assertTrue(phoneNumberList!=null);
	}
}
