package com.autowire;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMyAppl {
	
 public static void main(String[] args) {
	
	 ConfigurableApplicationContext cntxt = new ClassPathXmlApplicationContext("beans.xml");//syntax to start IOC Container
	 
	 Atm a= cntxt.getBean(Atm.class);
	 
	a.withdraw();
}
}
