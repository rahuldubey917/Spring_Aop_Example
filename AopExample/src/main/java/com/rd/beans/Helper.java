package com.rd.beans;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Helper {
	@Before("execution(public void deposit())")
	public void authintication() {
		System.out.println("authintication is successfull");
	}
	
	@After("execution(public void withdraw())")
	public void approval() {
		System.out.println("approval is successfull");
	}

}
