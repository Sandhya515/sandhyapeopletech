package corejava.assignment;

import java.util.Scanner;

class PrimeNumbers
{
	public static void main(String[] args)
	{
		int n,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		n=sc.nextInt();
		for(int i=2;i<n;i++) {
			c=0;
			for(int j=2;j<i;j++) {
				if(i%j==0)
					c=1;
			}
			if(c==0)
				System.out.print(i+" ");
		}
	}
}
