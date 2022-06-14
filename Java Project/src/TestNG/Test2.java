package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test2 {
 
 @Test
 public void test2method1() {
  System.out.println("test2method1");
 }
 
 @Test
 public void test2method2() {
  System.out.println("test2method2");
 }

 
 @BeforeMethod
 public void test2method3() {
  System.out.println("BeforeMEthodtest2method3");
 }
 
 @AfterMethod
 public void test1method4() {
  System.out.println("AfterMethodtest1method4");
 }

}
