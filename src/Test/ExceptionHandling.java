package Test;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =10;
		int b = 0;
		try {
			int result =a/b;
			System.out.println("after error");
			
		}catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception Handeled");
		}
		
		catch(Exception e) {
			System.out.println("Exception handeled ");
		}finally {
	        System.out.println("try catch executed successfully");
			
		}
		
		int myaraay[] = {1,2,3,4};
		System.out.println(myaraay[6]);
		try {
			System.out.println(myaraay[6]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array Exception Handeled");

			
			
		}
		
		System.out.println("Hellio");

	}

}
