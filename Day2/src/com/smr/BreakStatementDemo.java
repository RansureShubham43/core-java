package com.smr;

//Program to demonstrate  break statement


public class BreakStatementDemo{
	public static void main(String[] args) {

		for (int i = 5; i < 10; i++) {
			if (i == 7)
				break;
			System.out.println(i);
		}
System.out.println("End of the program");
	}
}
