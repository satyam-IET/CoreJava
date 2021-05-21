package Test;

import java.util.Scanner;

public class ThrowsExample {

	public static void main(String[] args) {
		ThrowsExample1 play = new ThrowsExample1();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your age :");
		
		int age2 = scanner.nextInt();
		try {
		play.elegibitly(age2);
		}catch(ArithmeticException e)
		{
			System.out.println("Exception handeled Invalid age");
		}
}}
