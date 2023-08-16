package com.Day3;

public class DemoTestStudent {

	public static void main(String[] args) {

		DemoStudent ds = new DemoStudent();
		DemoStudent ds2 = new DemoStudent();
		ds.stuData(12, "Ramesh");
		ds2.stuData(13, "Venu");
		ds.displayStudentInformation();
		ds2.displayStudentInformation();

	}

}
