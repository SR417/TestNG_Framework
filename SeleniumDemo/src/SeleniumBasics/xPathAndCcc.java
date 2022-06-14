package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPathAndCcc {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\y8rurw\\Desktop\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");

		// syntax of xpath: //tagname[@attribute='value'] it is also called relative
		// xpath.
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("test");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("test1");
		driver.findElement(By.xpath("//input[@name='Login']")).click();
		driver.findElement(By.xpath("//a[@class='fl small']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@href='javascript:void(0).;']")).click();

		// syntax of css: tagname[attribute='value']

		// a[class='fl small']

		// Parent child reaversal- if attributes values are dymanic and changing always.
		// It is called as Absolute xpath.

		// syntax of parent child xpath: (xpath of parent/tag name of child)[result
		// number]

		driver.findElement(By.xpath("(//div[@id='username_container']/input)[1]")).sendKeys("test1");
		
		

		// We will always prefer relative xpath as developer might add something new
		// which might change the result number.
		
		// syntax of parent child css:
		//  div[id='username_container'] child tag name:nth-child(2)
		
		// syntax of child parent xpath: this can be used if what we want to traverse has child.
		//xpath of child/parent::tagname of parent
		
		//child parent css selector: not possible.
		
		
		

	}

}
