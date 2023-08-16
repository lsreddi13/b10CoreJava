package com.test.oops;

public class DemoPoly1 {

	public void game() {
		System.out.println("Ths is just game");
	}

	public void game(String g) {
		System.out.println("My Game name is : " + g);
	}

	public void game(int g) {
		System.out.println("players count : " + g);

	}

	public void game(double g) {
		System.out.println("Game prize money : " + g);

	}

	public static void main(String[] args) {
		DemoPoly1 dp = new DemoPoly1();

		dp.game();
		dp.game(200);
		dp.game("cricket");
		dp.game(11);

	}
}
