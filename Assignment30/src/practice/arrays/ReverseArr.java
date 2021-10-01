package practice.arrays;

public class ReverseArr { 
	public static void Reverse(int[] a) { 
		System.out.println("Reverse of array is:"); 
		for(int i=a.length-1;i>=0;i--) { 
			System.out.print(a[i]+" "); 
		} 
	} 
  
	public static void main(String[] args) { 
		int[] a = {2,5,3,9,7}; 
		Reverse(a); 
  
	} 
  
	} 