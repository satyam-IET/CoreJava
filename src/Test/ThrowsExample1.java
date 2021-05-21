package Test;

public class ThrowsExample1 {
	
	public void elegibitly( int age1) throws ArithmeticException {
		
		if(age1<18) {
			throw new ArithmeticException ("Age not valid");
			
		}else {
			System.out.println("You are Eligible for voting");
		}
	}

}
