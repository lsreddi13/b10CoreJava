package com.test.pack2;

import com.test.pack1.DemoChild1;
import com.test.pack1.DemoDefault;

public class DemoChild2 extends DemoDefault{
	public static void main(String[] args) {

		DemoChild2 dc = new DemoChild2();

		String str1 = dc.name;
		System.out.println("string avlue : " + str1);

		dc.test1();

		dc.test2();

		dc.test3();

	}
}
