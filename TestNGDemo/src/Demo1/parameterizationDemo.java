package Demo1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterizationDemo {
	

	@Test
	@Parameters("StudentName")
	public void method1(String name) {
		
		System.out.println(name);
	}

}
