package com.Day2;

public class DemoSwitchCase {
	public static void main(String[] args) {

		// today is what day?

		String day = "Wednesday";

		switch (day) {
		case "Monday": {

			System.out.println("today is working day");
			break;
		}
		case "Tuesday": {

			System.out.println("today is working day");
			break;
		}
		case "Wednesday": {

			System.out.println("today is working day");
			break;
		}
		case "Thursday": {

			System.out.println("today is working day");
			break;
		}
		case "Friday": {

			System.out.println("today is working day");
			break;
		}
		case "Saturday": {

			System.out.println("today is working day");
			break;
		}
		case "Sunday": {

			System.out.println("today is holiday day");
			break;
		}
		default:
			System.out.println("please enter valid day name");
			break;
		}

	}
}
