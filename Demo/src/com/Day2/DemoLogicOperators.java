package com.Day2;

public class DemoLogicOperators {

	public static void main(String[] args) {

		int totalIncome = 400000;
		int age = 59;

//		5 Lacks for early earning in your pancard and you are morethan 60 years age then you will receive 10000 govt fund every month.
		if (totalIncome <= 500000 || age >= 60) {
			System.out.println("both conditions are satisfied, i received 10k for this month.");
		} else {
			System.out.println("both conditions are not satisfied, i am not eligible.");
		}
		
//		==
		int a= 10, b = 20;
		if ( a==b ) {
			System.out.println("both are same");
		}else {
			System.out.println("both are not same.");
		}
		
//		34- 34 +1, 36 59+1 = 60
		int x= 10, y = 20;
		int marks = 34;
		
		
		if ( x!=y ) {
			System.out.println("Pass - both should not be same");
		}else {
			System.out.println("both are same.");
		}
		
	}

}
