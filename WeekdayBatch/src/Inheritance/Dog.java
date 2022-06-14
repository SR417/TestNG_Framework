package Inheritance;

public class Dog extends Animal{
	
	public void eat() {
		System.out.println("I am Eating");
	}
	
	public static void main (String[]args) {
		
		Dog obj = new Dog();
		obj.drinkwater();
		
		
	}

}
