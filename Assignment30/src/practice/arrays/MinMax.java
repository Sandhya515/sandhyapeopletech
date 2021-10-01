package practice.arrays;

import java.util.Scanner; 

public class MinMax{ 
public static void MinMaxArr(int[] a) { 
int max=a[0]; 
int min=a[0]; 
for(int i=1;i<a.length;i++) { 
if(a[i]>max) { 
max = a[i]; 
} 
else if(a[i]<min) { 
min = a[i]; 
} 
} 
System.out.println("Max is :"+max); 
System.out.println("Min is :"+min); 
} 
public static void main(String[] args) { 
int[] a = {2,5,3,9,7}; 
MinMaxArr(a); 
} 
} 