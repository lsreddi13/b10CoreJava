package com.encapsulation;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TestM {
	
	public void testException() throws IOException, FileNotFoundException, ArithmeticException{
		
		System.out.println("fasdf");
	}
	
	public static void checkNum(int num) {
		if (num < 1) {
			throw new ArithmeticException("\n please enter valid value ");
			
		} else {
			System.out.println("Square of " + num + " is " + (num * num));
		}
	}

	// main method
	public static void main(String[] args) {
		TestM obj = new TestM();
		obj.checkNum(0);
		System.out.println("Rest of the code..");
	}
}
