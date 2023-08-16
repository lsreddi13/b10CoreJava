package com.encapsulation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DemoFileIO {
	public static void main(String[] args) throws IOException {
		try {

			File file = new File("D:/images/javafx.jpg"); // run time exception - unchcked exception
			// Creating a FileInputStream object
			FileInputStream inputStream = null;

			inputStream = new FileInputStream(file);

			// Creating a byte array
			byte bytes[] = new byte[(int) file.length()];
			// Reading data into the byte array

			int numOfBytes = inputStream.read(bytes);

			System.out.println("Data copied successfully...");
		} catch (FileNotFoundException e) {
			System.out.println("This is file not found exception : "+e);
		}catch (Exception e) {
			System.out.println("Type of exception."+e);
		}
	}
}
