package Demo1;

import org.testng.annotations.Test;

public class ParallelTesting {
	
	@Test
		public void method1() {
		
		System.out.println("hello");
		System.out.println("Thread ID for method 1 is"+" "+Thread.currentThread().getId());
	}
	
	@Test
	public void method2() {
		
		System.out.println("hi");
		System.out.println("Thread ID for method 2 is"+" "+Thread.currentThread().getId());
	}

}
