package com.ptg.assignment;

import java.util.Scanner;
public class StringPalindrome {
	public static boolean isPalindrome(String word) {
		int i = 0;
		int n = word.length()-1;
		while(n > i) {
			if(word.charAt(i)!=word.charAt(n)) {
				System.out.println("Not a Palindrome");
				return false;
			}
			++i;
			--n;
		}
		System.out.println("Palindrome");
		return true;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String word = sc.nextLine();
		StringPalindrome.isPalindrome(word);
	}

}
