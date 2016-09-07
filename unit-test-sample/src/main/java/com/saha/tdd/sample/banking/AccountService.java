package com.saha.tdd.sample.banking;

public class AccountService {

	public String name; 
	
	private int money = 0;
	
	public void depositMoney(Integer amount) {
		if (amount < 0)
			return;
		money += amount;
	}

	public void withDrawMoney(Integer amount) {
		if(amount < 0)
			return;
		if(amount >  money)
			return;
		money -= amount;

	}

	
	public int getMoney() {
		return money;
	}
}
