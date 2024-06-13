package com.autowire;

public class SonyPrinter implements IPrinter {
	public SonyPrinter() {
		System.out.println("Sony default constructor...");
	}

	@Override
	public void print() {
		System.out.println("SonyPrinter is printing...");

	}

}
