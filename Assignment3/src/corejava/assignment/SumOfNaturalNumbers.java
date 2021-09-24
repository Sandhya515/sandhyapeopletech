package corejava.assignment;
public class SumOfNaturalNumbers {
	static int CalculateSum(int n) {
		int sum = 0;
		for(int i=1;i<=n;i++) {
			if((i%3==0) || (i%5==0)) {
				sum = sum + i;
				System.out.println("Numbers which are divisible by 3 and 5: "+i);
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println("Sum of 100 natural numbers which are divisible by 3or5: "+CalculateSum(10));
	}
}
