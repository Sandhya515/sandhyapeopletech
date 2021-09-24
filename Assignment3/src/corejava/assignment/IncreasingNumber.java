package corejava.assignment;

public class IncreasingNumber {
	public static boolean isIncreasing(int n) {
		int i = 1,first,last, rem=0;
		while(n>0) {
			first = n%10;
			//System.out.println(first);
			n = n/10;
			last = n%10;
			
			//System.out.println(last);
			if(first<last)
				return false;
		}
		return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isIncreasing(134468 ));

	}

}
