package Encapsulation;

public class Demo2 extends Demo {

	 public static void main(String[] args) {
	  // TODO Auto-generated method stub
		 Demo2 myObj = new Demo2();
	  //myObj.name="Rahul";  data is not secure
	  myObj.setName("John"); // Set the value of the name variable to "John"
	  System.out.println(myObj.getName());
	  

	 }
	 
	 
	 
	 

	}
