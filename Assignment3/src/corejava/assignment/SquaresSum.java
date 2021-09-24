package corejava.assignment;
public class SquaresSum {
	public static int CalculateDifferance(int n) {
		int SumOfSquares=0,differance = 0,SquareOfSum=0,sum=0;
		for(int i=1;i<=n;i++) {
			int square = i*i;
            SumOfSquares = SumOfSquares+square;
            //System.out.println("Sum of Squares is: "+SumOfSquares);
            sum = sum+i;
            SquareOfSum = (sum*sum);
            //System.out.println("Square of their Sum: "+SquareOfSum);
            differance = SumOfSquares -  SquareOfSum;
		}
		return differance;
	}
	public static void main(String[] args) {
		System.out.println("Difference between Sum of Squares and Squares Sum is: "+CalculateDifferance(3));
	}

}
