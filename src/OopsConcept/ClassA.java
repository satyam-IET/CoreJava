package OopsConcept;

public class ClassA {

	 // TODO Auto-generated method stub
		public String Name;
		public int Slary;
		public String Org;
		public String Deg;
		
		public ClassA() {
			System.out.println("Inside constructor");
			
			
		}
		public ClassA(int val1, String val2 , String val3 ,String val4) {
			System.out.println("Inside param constructor");
			this.Slary = val1;
			this.Name = val2;
			this.Org = val3;
			this.Deg = val4;
			
			
		}
		
		public void Display(){
			System.out.println("Employee Name : " + Name);
		    System.out.println("Enployee Organisation : " + Org);
		    System.out.println("Employe Salary : " + Slary);
		    System.out.println("Enployee Degisnation : " + Deg);
			
		}

	}


