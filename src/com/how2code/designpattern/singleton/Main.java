package com.how2code.designpattern.singleton;

import com.how2code.designpattern.singleton.entity.PrinterSpooler;

public class Main {

	public static void main(String[] args) {
		PrinterSpooler spooler = PrinterSpooler.getInstance();
		spooler.sayHello();
	}

}
