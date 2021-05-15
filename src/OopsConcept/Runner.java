package OopsConcept;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ClassA Emp1 = new ClassA(1000, "Vivek", "Tcs" ,"System Engineer");
		
		ClassA Emp2 = new ClassA(2000,"Varun","Tcs","Sr System Engineer");
		
		Emp1.Display();
		Emp2.Display();
		
		// -----------Class B---------------
		ClassB Emp3 = new ClassB();
		Emp3.Name = "rahul";
		Emp3.Deg = "Software engineer 1";
		Emp3.Org = "Tcs";
		Emp3.Slary = 3000;
		
		Emp3.Display();
		
		// -----------Class C---------------
		
		ClassC Emp4 = new ClassC();
		Emp4.run(); 
		
	   // -----------Fibonci class----------
		finonaci fab =  new finonaci();
		fab.fib(); */
		
		methodOverloading method = new methodOverloading();
		
		method.add(1, 7);
		method.add(2.67, 5.89);
		
		methodOverideChild child = new methodOverideChild();
		
		child.dis();
		child.dis1();
		
		abstractionChild Obj3 = new abstractionChild();
		Obj3.method2();
		
		 Encapsulation obj4 = new  Encapsulation();
		 obj4.setSalary(1000);
		 System.out.println(obj4.getSalary());
		
		

	}

}
