package corejava.assignment;
import java.util.Scanner;
public class SumOfCubes {
	static int Cubes(int n) {
        int sum = 0;
        while (n>0){
            int s = n%10;
            n = n/10;
            sum += s*s*s;
        }
        return sum;
    }
public static void main(String[] args) {
	System.out.println("Enter a number: ");
	Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println("sum of cubes of the digits of n is: "+Cubes(n));
}
}