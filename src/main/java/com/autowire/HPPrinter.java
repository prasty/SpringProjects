package com.autowire;

public class HPPrinter implements IPrinter {
	public HPPrinter() {
		System.out.println("HPprinter default constructor...");
	}

	@Override
	public void print() {
		System.out.println("HPprinter is printing...");
	}

}
