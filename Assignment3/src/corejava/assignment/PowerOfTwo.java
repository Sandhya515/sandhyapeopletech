package corejava.assignment;

public class PowerOfTwo {
	public static boolean Checknumber(int n) {
		if(n%2 != 0) {
			return false;
		}
		else {
			for(int i=0;i<=n;i++) {
				if(Math.pow(2, i)==n)
					return true;
			}
		}
		return false;
		
	}
	public static void main(String[] args) {
		System.out.print(Checknumber(8));

	}

}
