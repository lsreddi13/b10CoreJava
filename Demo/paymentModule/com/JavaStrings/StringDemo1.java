package com.JavaStrings;

public class StringDemo1 {

	String course = "";//

	String course2 = "Selenium Java testing automation tool";//
//	Selenium Java webapp automation tool

	String language = new String("Selenium Java");//

	public static void main(String[] args) {

		StringDemo1 sd = new StringDemo1();

//		System.out.println(sd.course.length());
//		
//		System.out.println(sd.course.charAt(12));
//		
//		
//		System.out.println("welcome " + sd.course);
//		
//		System.out.println("Welcome ".concat(sd.course));
//		System.out.println(3+4+5+6);
//		
//		System.out.println(3+4+" I am here"+3+4);//
		System.out.println(sd.course.isEmpty());
//		boolean x = sd.course.isEmpty();
//		System.out.println("is the string contains any value ? "+ x);
		String lang = "JAVA java LANGUAGE";
		String str2 = lang.replace("java", "python");
		
		String str3= lang.replace("java", "curl");
		
		System.out.println(lang.toLowerCase());
		System.out.println(str2);
		System.out.println(str3);

	}

}
