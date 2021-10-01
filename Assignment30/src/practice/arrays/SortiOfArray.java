package practice.arrays;

public class SortiOfArray {
	public static void SortingOfArray(int[] a) {
		System.out.println("Sorting of array is:");
		for(int i = 0;i<=a.length-1;i++) {
			for(int j=i;j<a.length;j++) {
				int temp;
				if(a[i]>a[j]) {
					temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.println(a[i]+" ");
		}
	}

	public static void main(String[] args) {
		int[] a = {2,5,3,9,7}; 
		SortingOfArray(a); 

	}

}
