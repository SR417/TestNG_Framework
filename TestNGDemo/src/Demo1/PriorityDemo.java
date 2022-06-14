package Demo1;

import org.testng.annotations.Test;

public class PriorityDemo {
	
	@Test(priority=1)
	public void amethod1() {
		
		System.out.println("method1");
	}
	
	@Test(priority=2)
	public void method2() {
		
		System.out.println("method2");
	}
	
	//If priority is not given, its default priority is O.
	@Test
	public void cmethod3() {
		
		System.out.println("method3");
	}
	
	@Test(priority=-1)
	public void bmethod4() {
		
		System.out.println("method4");
	}

}
