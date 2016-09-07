package com.saha.tdd.sample.test;

import org.junit.Assert;
import org.junit.Test;
import static org.mockito.Mockito.*;

import com.saha.tdd.sample.banking.EmailService;
import com.saha.tdd.sample.banking.UserService;

public class UserService2Test {

	
	@Test
	public void registerTest(){
		UserService userService = new UserService();
		userService.emailService = mock(EmailService.class);
		
		int id = userService.register("Melih", "Sakarya", "melih.sakarya@sahabt.com");
		Assert.assertNotEquals(id, 0);
		verify(userService.emailService, times(1)).sendEmail(anyString());
	}
	
}
