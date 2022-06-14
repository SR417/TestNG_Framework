package Polymorphism;

public class Demo1 {
	
	/*Can we override static method?
	No, a static method cannot be overridden. It can be proved by runtime polymorphism, so we will learn it later.

	Why can we not override static method?
	It is because the static method is bound with class whereas instance method is bound with an object. Static belongs to the class area, and an instance belongs to the heap area.

	Can we override java main method?
	No, because the main is a static method*/
	/*
	 * There are two ways to overload the method in java

	By changing number of arguments
	By changing the data type
	Seqeunce of tha paremter should be diffrent
	 */
	 //method overloading, multiple methods can have the same name with different parameters
	
	/*Rules for Java Method Overriding
	The method must have the same name as in the parent class
	The method must have the same parameter as in the parent class.
	There must be an IS-A relationship (inheritance).

	/*
	 * > The process of converting one object into
	another object is known as Object Typecasting
	-> Object typecasting is of 2 types :-
	1. Upcasting  -- A ob=new B()  //implict upcasting
	2. Downcasting --B ob=new A() //Error//Implict downcasting
	                  A ob=new B()//  explict down castin g
	                  B ob1=(B)ob //
	                  */

}
