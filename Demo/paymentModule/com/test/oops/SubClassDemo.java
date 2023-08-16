package com.test.oops;

public class SubClassDemo extends DemoInheritance  {

	String course = "java";

	public void test() {
		System.out.println("This is test2 method.");
	}

	public static void main(String[] args) {

		SubClassDemo scd = new SubClassDemo();

				scd.test();

				
				DemoInheritance dd = new SubClassDemo();
				dd.test();
				
//				SubClassDemo ss = new DemoInheritance();
				
				
				DemoInheritance ds = new DemoInheritance();
				
				ds.test();
				
	}

}
