package practice.arrays;

import java.util.Scanner;

import java.util.HashMap;

import java.util.Map;

public class UniqueChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=0;
		System.out.println("Enter Sentance:");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int n = str.length();
		char ch[] = str.toCharArray();
		Map<Character,Integer>map = new HashMap<>();
		for(int i=0;i<ch.length;i++) {
			c = 0;
			for(int j=0;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					c++;
				}
			}
			map.put(ch[i],c);
		}
		System.out.println(map);
	}

}
