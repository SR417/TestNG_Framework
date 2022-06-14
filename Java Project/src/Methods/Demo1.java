package Methods;

public class Demo1 {
	
	//This is method--non static method
	 public void method1() {
	  System.out.println("hello i am method1");
	  
	 }
	 
	 public void method3() {
	  System.out.println("hello i am method3");
	  
	 }
	 
	 
	 
	 // Static method
	 public static void method2() {
	  System.out.println("hello i am method2");
	 }
	 
	 
	 
	 // Method with return type

	 public int method4() {
	  int a=5;
	  return a;
	  
	 }
	 
	 
	 // parametrized method

	                           //Rahul    //18
	 public void metho5(String name, int age, int RollNo) {
	 /* System.out.println(name);
	  System.out.println(age);
	  System.out.println(RollNo);*/
	  
	  System.out.println(name+" "+age+" "+RollNo);
	  
	 }

	 
	 
	 
	 public static void main(String[] args) {
	  
		 Demo1 obj=new  Demo1();
	  
	  obj.method1(); //For non-static method we need to create the object to call the method
	  obj.method3();
	  
	  method2(); //For static method we need not to create the object to call the method
	  
	  System.out.println(obj.method4());
	  obj.metho5("rahul", 18,56);
	  obj.metho5("ram", 19,57);
	 }

	 
	 
	}

	//1.Create the object of class --Classname obj=new Classname();
	//2.call the method1 from main method





	//Even number 
	//Prime number
	//fibonacci series


