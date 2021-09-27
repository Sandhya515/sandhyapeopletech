package com.exception.practice;

public class BankingApplication {
	public void BankApply(int age, String name)throws AgeException{
		if(age<18)
			throw new AgeException(age, name);
		else
			System.out.println("You are eligible for bank account");
	}
	public static void main(String[] args) {
		BankingApplication apply = new BankingApplication();
		try {
			String sandhya = null;
			apply.BankApply(14, sandhya);
		}catch(AgeException e) {
			System.out.println(e);
		}
	}
}
