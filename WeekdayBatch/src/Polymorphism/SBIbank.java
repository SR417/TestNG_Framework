package Polymorphism;

public class SBIbank extends Banks{
	
	public void fethbalance() {
		System.out.println("My balance is 1000");
	}
	

	
	public static void main (String[]args) {
		
		
		SBIbank obj=new SBIbank();
		obj.fethbalance();
		
	}
	
	

}
