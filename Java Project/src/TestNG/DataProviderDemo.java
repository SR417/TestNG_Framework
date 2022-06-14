package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class DataProviderDemo {
 ///run same test multiple times with different data

 @Test(dataProvider="testData")
 public void method1(String username, String password) {
  
  System.out.println(username+" "+password);
 }
 
 
 
 
 @DataProvider
 public Object[][] testData() {
  Object[][] data=new Object[2][2];
  data[0][0]="test1";
  data[0][1]="secure@1234";
  data[1][0]="test2";
  data[1][1]="secure@345";
  
  
  return data;

}
}
