package Demo1;

import org.testng.annotations.Test;

public class DifferentAnnotations {
	
	@Test(timeOut=500)
	public void method1() {
	System.out.println("hello");
	}

   @Test(enabled=false)
    public void method2() {
	System.out.println("hi");
   }
	
   
   //to run testcase multiple times
	@Test(invocationCount=10)
    public void method3() {
	System.out.println("method3");
}

}
