package com.bridgelabz.BasicCoreProgram;
import java.util.Scanner;

public class ComputeQuotientRemainder {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of the divisor:: ");
		int divisor = sc.nextInt();
		System.out.println("Enter the value of the Dividend:: ");

		int divident = sc.nextInt();

		int quotient = divident / divisor;
		int remainder = divident % divisor;

		System.out.println("Quotient value:" + quotient);
		System.out.println("Remainder value:" + remainder);
	}
}
