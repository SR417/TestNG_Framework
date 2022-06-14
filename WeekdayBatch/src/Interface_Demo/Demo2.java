package Interface_Demo;

//multiple inheritance is possible with interface which is not possible with class.
public class Demo2 implements Demo,Demo1 {
	
	public void method1(){ 
	
		System.out.println("Hello");
	}
	
	public void method2(){
	
		System.out.println("Hello1");
	}
	
	@Override
	public void method3() {
		// TODO Auto-generated method stub
		System.out.println("Hello2");
	}

	
	public static void main(String[]args) {
		
		Demo2 obj= new Demo2();
		obj.method1();
		obj.method2();
		obj.method3();
		
		
	}

	
}

	
		
	
	


