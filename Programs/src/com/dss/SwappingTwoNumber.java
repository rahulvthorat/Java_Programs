package com.dss;

public class SwappingTwoNumber {

	public static void main(String[] args) {
		int a = 10, b = 20;

		System.out.println("Before Swapping: " + a + " " + b);

		// By using third variable
		int t = a;
		a = b;
		b = t;

		// Without using third variable
		/*
		 * a=a+b; b=a-b; a=a-b;
		 */
		System.out.println("After Swapping: " + a + " " + b);
	}
}