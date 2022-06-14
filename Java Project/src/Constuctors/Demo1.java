package Constuctors;

public class Demo1 {
	
	  int x;

	  // Create a class attribute

	  // Create a class constructor for the Main class
	  public Demo1() {
	      x = 5; // Set the initial value for the class attribute x
	      System.out.println(x); // Print the value of x
	  }

	  public static void main(String[] args) {
		  Demo1 myObj = new Demo1(); // Create an object of class Main (This will call the constructor)
	   
	  }

	  
	  
	  
	  

	  
	  
	  
	  /*
	   * 
	   * A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created. It can be used to set initial values for object attributes:
	   * Note that the constructor name must match the class name, and it cannot have
	   * a return type (like void).
	   * 
	   * Also note that the constructor is called when the object is created.
	   * 
	   * All classes have constructors by default: if you do not create a class
	   * constructor yourself, Java creates one for you. However, then you are not
	   * able to set initial values for object attributes.
	   * 
	   * 
	   */

}
