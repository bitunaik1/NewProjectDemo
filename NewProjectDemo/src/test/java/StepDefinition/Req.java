package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pomm.ReqPOM;

public class Req {
	public static WebDriver driver= ReqRes.driver;
	@When("Click REQRES")
	public void click_reqres() {
	    ReqPOM re = new ReqPOM(driver);
	    re.ClickSupReq(driver);
	}
	
	@Then("VERIFY Checkout")
	public void verify_checkout() {
		new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Powered by ']")));
		if( driver.getCurrentUrl().contains("checkout")) {
			System.out.println("PASS");
		}
	  
	}
}
