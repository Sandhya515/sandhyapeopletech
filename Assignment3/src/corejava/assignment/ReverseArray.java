package corejava.assignment;
import java.util.Scanner;
import java.util.Arrays;
public class ReverseArray {
	public static int ReverseSort(int arr[]) {
		System.out.println("Reversed Array is:");
		for(int i = arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
		Arrays.sort(arr);
		System.out.println("Sorted array after reversing : ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		return 0;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter elements:");
		for(int i = 0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		ReverseArray.ReverseSort(arr);
	}

}
