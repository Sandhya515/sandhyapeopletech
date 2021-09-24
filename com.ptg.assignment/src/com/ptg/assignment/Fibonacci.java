package com.ptg.assignment;

public class Fibonacci {
	public static void main(String[] args) {
		int n1=1, n2=1;
		System.out.println(n1+" ");
		while(n2<=100) {
			System.out.println(n2+" ");
			n2 = n2+n1;
			n1 = n2-n1;
		}
	}
}
