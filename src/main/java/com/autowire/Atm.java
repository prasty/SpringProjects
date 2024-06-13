package com.autowire;

public class Atm {
	
	private IPrinter printer;
	
	public Atm() {
		System.out.println("Atm default constructor...");
	}
	


	public void setPrinter(IPrinter printer) {
		System.out.println("Setter method call i.e. setter injection working....");
		this.printer = printer;
	}



	public void withdraw() {
		System.out.println("withdraw completed...");
		
		printer.print();
	}
	
	
	

}
