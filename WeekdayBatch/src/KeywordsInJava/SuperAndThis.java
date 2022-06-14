package KeywordsInJava;


public class SuperAndThis {
	
	public static void main(String[] args) {
		
	}
		  int no=10;
	 }
	 
	 
	 class B extends SuperAndThis
	 {
	  int no=20;  
	  void show(int n)
	  {

	   System.out.println(n);      
	   System.out.println(this.no); 
	   System.out.println(super.no); 
	  }
	 }

	 class SuperAndThisKeyword
	 {
	  public static void main(String[] args)
	  {
	   B ob=new B();
	   ob.show(30);
	   
	   
	   
	  
	
	 }	

	 }

