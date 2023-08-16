package com.Day2;

public class DemoSwitch {

	public static void main(String[] args) {

		int marks = 60;

		switch (marks) {
		case 35: {
			System.out.println("I am passed");
			break;
		}
		case 60: {

			System.out.println("I am first class");
			break;
		}

		case 70: {

			System.out.println("I am Ranker");
			break;
		}
		default:
			System.out.println("I am failed.");
			break;
		}
		System.out.println(" I am continuing other steps.");

	}
}
