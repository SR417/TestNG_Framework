package Demo1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test2 {
	
	@Test
	public void test2method1() {
		
		System.out.println("test2method1");
	}
	
	@BeforeSuite
	public void test2method2() {
		
		System.out.println("test2method2");
	}
	
	@AfterSuite
      public void test2method3() {
		
		System.out.println("test2method3");
	}
	
	@BeforeTest 
	public void test2method8() {
		
		System.out.println("test2method8");
	}
	
	@AfterTest //
	public void test2method9() {
		
		System.out.println("test2method9");
}
	
	@BeforeClass
	public void test2method4() {
		
		System.out.println("test2method2");
	}
	
	@AfterClass
      public void test2method5() {
		
		System.out.println("test2method3");
	}
	
	
	// @BeforeMethod and @AfterMethod method will get executed before and after all the @Test methods in the class.
	@BeforeMethod
	public void test2method6() {
		
		System.out.println("test2method2");
	}
	
	@AfterMethod
      public void test2method7() {
		
		System.out.println("test2method3");
	}
	
	
	
	

}
