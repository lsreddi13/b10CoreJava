package com.test.Demoabstract;

public class Honda4 extends Bike{

	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("this is honda bike");
	}

	
	public static void main(String[] args) {
		Bike obj = new Honda4();  
		 obj.run(); 
	}
}
