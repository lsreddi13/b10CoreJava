package com.test.Exception;
import java.lang.Exception;


public class TryDemo {

	public static void main(String[] args) {

//		String[] ast = {"s0", "s1"};
//		System.out.println(ast[2]);

		try {

			String[] ast = { "s0", "s1" };
			System.out.println(ast[2]);

			System.out.println(1 / 0);

		} catch (ArithmeticException e) {
			System.out.println("Error found in the Arithmetic  " + e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error found in the Array size  " + e);
		} catch (Exception e) {
			System.out.println("Something went wrong...");
		}

	}

}
