package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import pomm.SupportReqResPOM;

public class Support {
	
	public static WebDriver driver= ReqRes.driver;
	
	@Then("Verify Support")
	public void verify_support() {
//		if(driver.findElement(By.xpath("//h2[@id='support-heading']")).isDisplayed()) {
//			System.out.println("Support Displayed.");
//			driver.close();
//		}
	SupportReqResPOM sup = new SupportReqResPOM(driver);
	sup.verifySupport(driver);
	}
}
