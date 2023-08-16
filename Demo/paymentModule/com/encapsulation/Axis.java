package com.encapsulation;

public class Axis extends RBI {
	public static void main(String[] args) {
		try {
			Axis h = new Axis();
			h.setInterest(44);
			System.out.println(h.getInterst());
		} catch (Exception e) {
			System.out.println("error found " + e);
		}
	}
}
