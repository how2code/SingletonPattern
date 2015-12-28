package com.how2code.designpattern.singleton.entity;

public class PrinterSpooler {
	
	private static PrinterSpooler spooler = new PrinterSpooler();
	
	private PrinterSpooler() {}
	
	public static PrinterSpooler getInstance() {
		return spooler;
	}
	
	public void sayHello() {
		System.out.println("Hello!");
	}

}
