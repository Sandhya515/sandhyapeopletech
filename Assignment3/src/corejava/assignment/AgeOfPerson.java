package corejava.assignment;

import java.util.Scanner;

public class AgeOfPerson {
	public void Age(int age) throws AgeException{
		if(age>15) {
			System.out.println("Age is valid");
		}
		else{
			throw new AgeException();
		}
	}
	class AgeException extends Exception{
		public String Validate() {
			return "Your age must be more than 15";
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter age:");
		AgeOfPerson a = new AgeOfPerson();
		try {
			Scanner sc = new Scanner(System.in);
			int age = sc.nextInt();
			a.Age(age);
		}
		catch(AgeException e) {
			System.out.println(e.Validate());
		}

	}

}
