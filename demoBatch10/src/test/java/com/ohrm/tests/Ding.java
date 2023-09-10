package com.ohrm.tests;

import org.testng.annotations.DataProvider;

public class Ding {

	@DataProvider
	public static Object[][] test() {

		Object[][] obj = { { "Admin", "admin123" }, // first row
				{ "Annette", "password123" }, // second row
//				{ "Ramesh", "ramesh123" }, // third row
//				{ "Santhosh", "santhosh123" }, // third row
		};
		return obj;
	}
}
