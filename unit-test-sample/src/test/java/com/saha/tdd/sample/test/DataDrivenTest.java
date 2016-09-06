package com.saha.tdd.sample.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import com.saha.tdd.sample.banking.EmailService;
import com.saha.tdd.sample.banking.UserService;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class DataDrivenTest {

	
	UserService userService;

	@Before
	public void init(){
		this.userService = new UserService();
		userService.emailService = Mockito.mock(EmailService.class);
	}
	
	
	
	@Test
	@Parameters({"Melih, Sakarya, melih.sakarya@gmail.com", "Ahmet,Dursun,ahmet.dursun@gmail.com"})
	public void dataDrivenTest(String name, String lastname, String email){
		userService.register(name, lastname, email);
	}
	
	
	
}
