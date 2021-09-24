package com.assignment2;

public class Series {

	public static void main(String[] args) {
		int a = 1;
		int count =0;
		for(int i = 1;i<=10;i++) {
			System.out.println(a+" ");
			if(i%2!=0)
				count+=8;
			int next = a+count;
			a = next;
		}

	}

}
