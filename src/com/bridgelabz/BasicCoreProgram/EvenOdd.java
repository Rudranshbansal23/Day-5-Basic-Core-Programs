package com.bridgelabz.BasicCoreProgram;
import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ::");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("Entered number is an even number");
		} else {
			System.out.println("Entered number is an odd number");
		}
	}
}