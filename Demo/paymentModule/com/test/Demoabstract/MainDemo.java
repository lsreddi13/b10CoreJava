package com.test.Demoabstract;

public class MainDemo extends DemoAbs1  {

	
	public static void main(String[] args) {
		MainDemo md = new MainDemo();
		md.testabs1();
		
		md.testabs2();
		md.testme();
	}

	@Override
	public void testabs1() {
		// TODO Auto-generated method stub
		System.out.println("this is abs 1");
	}

	@Override
	public void testabs2() {
		// TODO Auto-generated method stub
		System.out.println("this is abs2");
	}
}
