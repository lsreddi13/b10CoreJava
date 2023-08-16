package com.Day2;

public class IfElseExample {

	public void testwithdrawamount(int balanceamount, int withdrawamount) {

		if (balanceamount >= withdrawamount) {
			System.out.println("I can withdraw amount : " + withdrawamount);
		} else {
			System.out.println("I can't withdraw amount : " + withdrawamount);
		}

	}

	public static void main(String[] args) {

		IfElseExample ref = new IfElseExample();
		ref.testwithdrawamount(8000, 900);
		ref.testwithdrawamount(10000, 9900);

	}

}
