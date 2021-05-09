package Test;

import java.util.Scanner;

public class EvenNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the No");
		int n =scanner.nextInt();
		if(n % 2 == 0){
			System.out.println("This is even no");
			
		}
		else {
		
			System.out.println("Not a Even no");
		}
				
;
	}

}
