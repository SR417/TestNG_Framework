package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
 @Test
 public void test1method1() {
  System.out.println("test1method1");
 }
 
 
 @BeforeSuite
 public void test1method2() {
  System.out.println("BeforeSuitetest1method2");
 }
 
 @AfterSuite
 public void test1method3() {
  System.out.println("AfterSuitetest1method3");
 }
 
 @BeforeTest
 public void test1method4() {
  System.out.println("BeforeTesttest1method2");
 }
 
 @AfterTest
 public void test1method5() {
  System.out.println("AfterTesttest1method3");
 }
 
 
 
 @BeforeClass
 public void test1method6() {
  System.out.println("BeforeClasstest1method2");
 }
 
 @AfterClass
 public void test1method7() {
  System.out.println("AfterClasstest1method3");
 }
 
 
 @BeforeMethod
 public void test1method9() {
  System.out.println("BeforeMEthodtest1method3");
 }
 
 @AfterMethod
 public void test1method10() {
  System.out.println("AfterMethodtest1method3");
 }

}
