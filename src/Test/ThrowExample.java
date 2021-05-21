package Test;

import java.util.Scanner;

public class ThrowExample {

	public static void main(String[] args) {
		// example of throw
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter your age");
			int age = scanner.nextInt();
		
		if(age < 18) {
			
			throw new ArithmeticException("Not a valid age");
		}
		else {
			System.out.println("you are ellibglble for voting");
		}

	}catch(ArithmeticException e) {
		
		System.out.println("Exception Handeled Invalid age");
	}
		
	}

}
