package Constuctors;

public class parameterizedDemo {
	
			 // class vars:
		 String sirname;
		 int oldage;
		                                     //tom    25
		 public parameterizedDemo(String Newname, int Newage) {
		  
		               //tom
		  sirname = Newname;// 
		  
		             //25
		  oldage = Newage;
		  
		  
		 
		  
		  System.out.println(sirname);   //tom
		  System.out.println(oldage);    //25

		 }

		 public static void main(String[] args) {

		  parameterizedDemo obj3 = new parameterizedDemo("tom", 25);


		 }

		

		
		/*=> Constructors :-
		   -> WHAT IS CONSTRUCTOR : Constructors 
		   are the special methods having same name as that 
		   of class name and does not have any return type
		   -> EXAMPLE :-
		   class Animal
		   {
		   Animal()
		   {
		   }
		   }
		   -> USE OF CONSTRUCTOR :- Constructors are 
		   used to initialize an object but not for object creation
		   
		   2
		   -> WHEN CONSTRUCTORS ARE EXECUTED 
		   :- Constructors are executed exactly at the time of 
		   object creation, not before or after object creation
		   -> HOW CONSTRUCTORS ARE EXECUTED :-
		   Constructors are executed automatically when we 
		   create an object
		   -> SYNTAX :-
		   access-modifiers ClassName(list of parameters) 
		   throws Exception1, Exception2, --
		   {
		   //initialization code
		   }
		   -> We can use any access-modifier for the 
		   constructor i.e. public, private, protected or default. 
		   This is done to control the object creation
		   
		   3
		   -> We cannot use abstract, final, static, 
		   synchronized etc keywords with constructors
		   -> TYPES OF CONSTRUCTORS :- There are 3 
		   types of constructors :-
		   1. Default Constructors (compiler)
		   2. 0-Argument Constructors (programmer)
		   3. Parametrized Constructors (programmer)
		   1. Default Constructors :-
		   -> Whenever we dont create any constructor in 
		   class, then compiler will always create a constructor 
		   which is known as default constructor
		   -> Default constructors are used to provide the 
		   default values to the objects like 0, null etc 
		   depending on the type.
		   
		   4
		   -> Note : If programmer creates any one 
		   constructor then compiler will not generate default 
		   constructor
		   -> Prototype of default constructor :-
		   1. Access-modifier of default constructor will 
		   be same at that of class access-modifier
		   2. Access-modifier of default constructor 
		   cannot be private or protected because outer class 
		   canot be private or protected
		   3. Default constructor has only one line of 
		   code i.e. super();
		   
		   5
		   2. 0-Argument Constructors :-
		   -> These constructors are created by the 
		   programmer
		   class Test
		   {
		   Test()
		   {
		   }
		   }
		  
		   6
		   3. Parametrized Constructors :-
		   -> These constructors are created by the 
		   programmer
		   class Test
		   {
		   Test(int a, int b)
		   {
		   }
		   }
		   
		   7
		   => What is difference between Methods & 
		   Constructors :-
		   1. Methods always have return type
		    Constructors does not have any return type 
		   even void
		   2. Methods can have any valid name
		    Constructors always have same name as that 
		   of class name
		   3. Methods are used to perform any particular 
		   task
		    Constructors are always used to initialize an 
		   object
		   4. We have to call the methods explicitly by 
		   using object name or class name
		    Constructors are called automatically when we 
		   create an object
		   5. If we dont create any method then compiler 
		   will not generate any method
		   6.Constuctor cannot be ovveride
		   
		   8
		    
		   If we don't create any constructor then compiler 
		   will generate default constructor*/

}

