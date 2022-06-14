package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPageObjects {
	
	public WebDriver driver;
	
	By firstName = By.xpath("//input[@name='UserFirstName']");
	By lastName = By.xpath("//input[@name='UserLastName']");
	By workEmail = By.xpath("//input[@name='UserEmail']"); 
	By jobTitle = By.xpath("//select[@name='UserTitle']"); 
	By Company= By.xpath("//input[@name='CompanyName']"); 
	By Employee = By.xpath("//select[@name='CompanyEmployees']");
	By Phone= By.xpath("//input[@name='UserPhone']"); 
	By Country = By.xpath("//select[@name='CompanyCountry']");
	By Button= By.xpath("//button[@name='start my free trial']");
	By Errormessage=By.xpath("//span[@class='error-msg-block']");
		
	
	public SignUpPageObjects(WebDriver driver2) {
		this.driver=driver2;
	}
	public WebElement enterFirstName() {
		return driver.findElement(firstName);
	}
	public WebElement enterLastName() {
		return driver.findElement(lastName);
	}
	public WebElement enterWorkEmail() {
		return driver.findElement(workEmail);
	}
	public WebElement enterJobTitle() {
		return driver.findElement(jobTitle);
	}
	public WebElement enterCompany() {
		return driver.findElement(Company);
	}
	public WebElement enterEmployee() {
		return driver.findElement(Employee);
	}
	public WebElement enterPhone() {
		return driver.findElement(Phone);
	}
	public WebElement enterCountry() {
		return driver.findElement(Country);
	}
	public WebElement enterButton() {
		return driver.findElement(Button);
	}
	public WebElement ErrormessageCapture() {
		return driver.findElement(Errormessage);
	}

}
