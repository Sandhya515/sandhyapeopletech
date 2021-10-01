package corejava.assignment;

import java.util.Scanner;

public class FullName {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			String first = "Sandhya";
			String last = "";
			place_holder(first,last);
		}
		catch(NameException e) {
			System.out.println(e.fullNameException());
		}
	}
	static void place_holder(String first, String last) throws NameException{
		if(first.isEmpty() || last.isEmpty()) {
			throw new NameException();
		}
		else {
			System.out.println("Your full name is: "+first+""+last);
			
		}
	}

}
class NameException extends Exception{
	public String fullNameException() {
		return "Please Enter your full name";
	}
}
