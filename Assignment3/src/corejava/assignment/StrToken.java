package corejava.assignment;
import java.util.Scanner;
import java.util.StringTokenizer;
public class StrToken {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter integers:");
			String s = sc.nextLine();
			StringTokenizer t = new StringTokenizer(s);
			int n = 0,sum=0;
			while(t.hasMoreTokens()) {
				String str = t.nextToken();
				n=Integer.parseInt(str);
				System.out.println(n+" ");
				sum = sum+n;
			}
			System.out.println();
			System.out.println("Sum of Integers: "+sum);
		}

	}

