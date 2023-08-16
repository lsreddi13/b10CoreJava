package com.Day3;

import com.Day4.Parent;
import com.Day4.DemoMethods;


public class OldModuleT1 extends Parent{
	public static void main(String[] args) {
		Parent p1 = new Parent();
		p1.testlogin();
//		p1.testLogin2();

		DemoMethods dm = new DemoMethods();
		dm.testLogin("fdasdf", "fasdf");
	}

}
