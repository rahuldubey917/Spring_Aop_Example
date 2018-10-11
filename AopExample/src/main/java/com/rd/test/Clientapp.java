package com.rd.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rd.beans.Bank;

public class Clientapp {

	public static void main(String[] args) {

		ApplicationContext ctx=null;
		ctx=new ClassPathXmlApplicationContext("com/rd/cfgs/applicationconfigration.xml");
		Bank b=ctx.getBean(Bank.class);
		b.openAcc();
		b.deposit();
		b.withdraw();
		
		//closing Ap[licationContext
		((AbstractApplicationContext) ctx).close();
		
	}

}
