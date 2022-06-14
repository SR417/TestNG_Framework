package TestCases;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjectModel.SignUpPageObjects;
import resources.Base;

public class SignUpPageTestCase extends Base {
	
	@Test
	public void launchURL() throws IOException, InterruptedException {
		
		//driver=driverInitialization();
		//driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		
		SignUpPageObjects obj=new SignUpPageObjects(driver);
		obj.enterFirstName().sendKeys("Sanket");
		obj.enterLastName().sendKeys("Jadhav");
		obj.enterWorkEmail().sendKeys("abc@gmail.com");
		obj.enterCompany().sendKeys("Siemens Software");
		obj.enterPhone().sendKeys("8369538291");
			
			
		Select s= new Select(obj.enterJobTitle());
		s.selectByIndex(1);
		Select r= new Select(obj.enterEmployee());
		r.selectByIndex(2);
		Select t= new Select(obj.enterCountry());
		t.selectByVisibleText("Ghana");
		
		obj.enterButton().click();
		
		WebElement a=obj.ErrormessageCapture();
		String ActualText=a.getText();
		
		String ExpectedText="Please read and agree to the Main Services Agreement";
		
		Assert.assertEquals(ActualText, ExpectedText);
		
		
		
		
		
		
		
					
		}
	
		
		
	}
	
		



