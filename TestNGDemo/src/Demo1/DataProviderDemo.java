package Demo1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
	//Run same test case multiple times with different data.
	@Test(dataProvider="testdata")
	public void method1(String UserName, String Password) {
		System.out.println(UserName+" "+Password);
		
		
	}
	
	@DataProvider
	public Object[][] testdata(){
		Object[][] data=new Object[2][2];
		data[0][0]="test1";
		data[0][1]="secure@1234";
		data[1][0]="test2";
		data[1][1]="secure@4567";
		
		return data;
				
				
		}
	

}
