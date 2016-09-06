package com.saha.tdd.sample.banking;

public class UserService {

	
	public EmailService emailService;
	
	public void register(String name, String lastname, String email){
		
		System.out.println(name + " " + lastname);
		
		emailService.sendEmail(email); 
	}
	
	
	
}
