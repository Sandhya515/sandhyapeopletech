package com.assignment2;

public class PascalsTriangle {

	 public static void main(String[] args) {
		    int n=5; int c=1,s ;
		    for(int i=0;i<n;i++)
		    {
		        for( s=1;s<=n-i;s++)
		            System.out.print(" ");
		        for(int j=0;j<=i;j++)
		        {
		            if(j==0||i==0)
		                c=1;
		            else
		                c=c*(i-j+1)/j;
		        
		            System.out.print(" "+c);
		        }
		    System.out.println();
		    }
		}
}
