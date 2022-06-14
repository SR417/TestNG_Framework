package Demo1;

import org.testng.annotations.Test;

public class GroupsDemo {
	
	@Test(groups= {"smokeTestCases"})
	public void amethod1() {
		
		System.out.println("method1");
	}
	
	@Test(groups= {"RegressionTestCases"})
	public void method2() {
		
		System.out.println("method2");
	}
	
	@Test
	public void method3() {
		
		System.out.println("method3");
	}

}
