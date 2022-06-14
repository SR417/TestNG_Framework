package Encapsulation;

public class Demo1 extends Demo {
	
	public static void main (String[]args) {
		
		
		Demo1 obj= new Demo1();
		
		//obj.name="Rahul";
		obj.setName("Rahul");
		
		
		System.out.println(obj.getName());
	}

}
