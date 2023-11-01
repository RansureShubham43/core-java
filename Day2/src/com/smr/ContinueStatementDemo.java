//Program to demonstrate  continue statement

package com.smr;

public class ContinueStatementDemo {
	public static void main(String[] args) {
		for (int k = 1; k < 15; k++)
		{
		// Odd numbers are skipped
		if (k%2 != 0)
		continue;
		// Even numbers are printed
		System.out.print(k + " ");
		}
	}
}


