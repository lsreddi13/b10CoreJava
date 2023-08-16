package com.test.Exception;

public class Temp {

	public int x = 10;

	public static void main(String[] args) {
		try {
//			
			//cehck the dashboard page
			
			//click admin -- 
			
			//do actions  -- 
			
			
			Temp t = initT();

			int i = t.x;
		}
		catch (ArithmeticException e) {
			System.out.println("Error found in the Arithmetic  " + e);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error found in the Array size  " + e);
			
		}catch (NullPointerException e) {
			System.out.println("Null values "+e);
			
		} catch (Exception e) {
			System.out.println("Something went wrong..."+e);
		} finally {
			//go to dashbaord
		}
		
		//abstraction
		//encapsulation 
		//regEx
		//try catch finally
		//final
		//string 
		
		//exception and intercafes
		
		
		
		
		
		
		
		
		
		
		
	}

	private static Temp initT() {
		return null;
	}

}
