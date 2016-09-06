package com.saha.tdd.sample.test;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import com.saha.tdd.sample.banking.EmailService;
import com.saha.tdd.sample.banking.UserService;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {

	@InjectMocks
	UserService userService;
	@Spy
	EmailService mailService;

	
	@Test
	public void userRegisterTest(){
		userService.register("Melih", "Sakarya", "melih.sakarya@gmail.com");
		verify(mailService, times(1)).sendEmail(anyString());
	}
	
	
	
}
