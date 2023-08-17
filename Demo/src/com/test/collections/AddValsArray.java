package com.test.collections;

public class AddValsArray {

	public static void main(String[] args) {
//		String subject[] = {"java", "cobol", "perl", };

		String[] sub = new String[4]; // {null, null, null};

		double[][] x = new double[10][5];

		int[][] ax = new int[3][2];

		ax[0][0] = 51;
		ax[0][1] = 52;
		ax[1][0] = 53;
		ax[1][1] = 54;
		ax[2][0] = 55;
		ax[2][1] = 56;

		int[][] ay = { { 51, 52 }, { 53, 54 }, { 55, 56 } };

		sub[0] = "java";
		sub[1] = "ruby";
		sub[2] = "cobol";
		sub[3] = "python";

		for (int i = 0; i <= sub.length; i++) {

			if (sub[i] == "cobol") {
				sub[i] = "JavaScript";
			}

			System.out.println(sub[i]);
		}

		// how to remove value from array

		// how to add values to array

		// how to delete array

		// how to create new array

		// how to copy values from one array to another array

		// how to compare two arrays

	}

}
