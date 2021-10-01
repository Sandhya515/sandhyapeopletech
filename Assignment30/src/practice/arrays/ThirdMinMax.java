package practice.arrays;

public class ThirdMinMax {
	public static void Third(int[] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++)
			{
				int temp;
				if(a[i]>a[j]) 
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Third smallest: "+a[2]);
		int l=a.length-3;
		System.out.println("3rd largest: "+a[l]);
		
	}

	public static void main(String[] args) {
			int a[]= {10,23,56,78,34,67,90,15,47};
			Third(a);

			}
	}


