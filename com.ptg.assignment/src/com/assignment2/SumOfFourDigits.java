package com.assignment2;

public class SumOfFourDigits {
	public static void main(String[] args) {
		int SumDigits = 0;
		int count = 0;
		for(int i = 1; i<=100;i++) {
			if(count==4) {
				System.out.print(SumDigits+" ");
				count = 0;
				SumDigits = 0;
				i--;
			}
			else {
				System.out.print(i+" ");
				SumDigits +=i;
				count++;
			}
		}
	}

}
