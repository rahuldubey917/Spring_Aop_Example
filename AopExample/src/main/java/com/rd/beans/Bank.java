package com.rd.beans;

import org.springframework.stereotype.Component;

@Component
public class Bank {

	public void openAcc() {
		System.out.println("opening account");
	}
	
	public void deposit()
	{
		System.out.println("money is deposited");
			}

	public void withdraw()
	{
		System.out.println("money is widrawl");
	}
}
