package com.saha.tdd.sample.test;

import org.junit.Assert;
import org.junit.Test;

import com.saha.tdd.sample.banking.AccountService;

public class AccountServiceTest {

	
	@Test
	public void addTest(){
		AccountService accountService = new AccountService();
		accountService.depositMoney(100);
		Assert.assertEquals(accountService.getMoney(), 100);
		
		accountService.withDrawMoney(50);
		Assert.assertEquals(accountService.getMoney(), 50);
		
	}
	
	@Test
	public void removeTest(){
		AccountService accountService = new AccountService();
		accountService.depositMoney(100);
		accountService.withDrawMoney(50);
		Assert.assertEquals(accountService.getMoney(), 50);
		
	}
	
	
	
}
