package com.ptg.assignment;

import java.util.Scanner;
public class FizzBuz {
	public static String fizzbuzz(int n) {
		if(n%15==0) {
			return "FizzBuzz";
		}
		else if(n%3==0) {
			return "Fizz";
		}
		else if(n%5==0) {
			return "Buzz";
		}
		else {
			String s = Integer.toString(n);
			return s;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		System.out.println(fizzbuzz(n));
		
	}

}
