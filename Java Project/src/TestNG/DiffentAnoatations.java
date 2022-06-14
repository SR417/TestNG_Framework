package TestNG;

import org.testng.annotations.Test;

public class DiffentAnoatations {
 
 
 
 @Test(timeOut=500)
 public void test1method1() {
  System.out.println("test1method1");
 }

 @Test(invocationCount = 10)
 public void test1method2() {
  System.out.println("test1method1");
 }


}
