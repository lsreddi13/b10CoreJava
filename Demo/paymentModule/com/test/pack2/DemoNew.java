package com.test.pack2;

import com.test.pack1.DemoDefault;

public class DemoNew {
	public static void main(String[] args) {

		DemoDefault dc = new DemoDefault();

		String str1 = dc.name;
		System.out.println("string avlue : " + str1);

		dc.test1();

		dc.test2();

		dc.test3();
		
	

	}
}
