package com.saha.tdd.sample.banking;

public class UserService {

	public EmailService emailService;

	public int register(String name, String lastname, String email) {
		System.out.println("Hello " + name + " " + lastname);
		emailService.sendEmail(email);
		
		return 22;
	}

}
