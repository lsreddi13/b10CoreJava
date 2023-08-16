package com.test.oops;

public class DemoPoly2 {


	public void game(String g, int a) {
		System.out.println("My Game name is : " + g +" : "+ a);
	}

	public void game(int g, String a) {
		System.out.println("players count : " + g+ " : " + a);

	}

	

	public static void main(String[] args) {
		DemoPoly2 dp = new DemoPoly2();

		dp.game("kabaddi", 6);
		
		dp.game(4, "football");
		

	}
}
