package corejava.assignment;
import java.util.Arrays;
public class UpperLower {
	public static void main(String[] args) {
		String str[] = {"sandhya","shiva","micky","lucky","tyson","rani","hii"};
		Arrays.sort(str);
		System.out.println("Sorted array is:");
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}
		int mid = (str.length)/2;
		System.out.println("The resultant array is:");
		for(int i = 0;i<=mid;i++) {
			System.out.print(str[i].toUpperCase()+" ");
		}
		for(int i = mid+1;i<str.length;i++) {
			System.out.print(str[i].toLowerCase()+" ");
		}
	}
}
