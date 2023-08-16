package com.Day2;

public class DemoIfelseWeekday {
	
	public static void main(String[] args) {
		
		
		String day = "Thursday";
		
		if(day == "Monday") {
			System.out.println("today is working day");
		} else if (day == "Tuesday") {
			System.out.println("today is working day");
		}else if (day == "Wednesday") {
			System.out.println("today is working day");
		}else if (day == "Thursday") {
			System.out.println("today is working day");
		}else if (day == "Friday") {
			System.out.println("today is working day");
		}else if (day == "Saturday") {
			System.out.println("today is working day");
		}else if (day == "Sunday") {
			System.out.println("today is holiday day");
		}else {
			System.out.println("Please enter valid day");
		}
		
	}

}
