package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pomm.reqResPOM;

public class ReqRes {
	
	public static WebDriver driver;
	
	
	@Given("Go to ReqRes")
	public void go_to_req_res() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://reqres.in/");
		
		reqResPOM res = new reqResPOM(driver);
		res.clicSupportReqRes(driver);
//		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Support ReqRes']")));
//		driver.findElement(By.xpath("//a[text()='Support ReqRes']")).click();
		
	}
	
	@Then("Close the Browser")
	public void close_the_browser() {
		System.out.println("PERFECT");
	    driver.quit();
	}


}
