package Polymorphism;

public class AxisBank extends Banks{
	
		public void fethbalance() {
			System.out.println("My balance is 2000");
		}
		
		public void Demo() {
			System.out.println("My Demo");
		}
		
		public static void main (String[]args) {
			
			
			AxisBank obj=new AxisBank(); // Will call method from only child
			obj.fethbalance();
			
			Banks obj1= new Banks();  // Will call method from only parent
			obj1.fethbalance();
			
			
			//reference is parent and class is created from child
			Banks obj2=new AxisBank(); // will call method from parent expect overrided method
			obj2.fethbalance();
			obj2.Demo2();
			
			
			//Downcasting
			Banks obj3=new AxisBank();
			AxisBank obj4 =(AxisBank) obj3;
			obj4.fethbalance();
			obj4.Demo2();
			
			
			
			
			
			
		}
		
		

	


}
