package genericUtility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomm.SupportReqResPOM;
import pomm.reqResPOM;


public class BaseClass {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://reqres.in/");
		reqResPOM req = new reqResPOM(driver);
		req.clicSupportReqRes(driver);

		SupportReqResPOM sup = new SupportReqResPOM(driver);
		sup.verifySupport(driver);
	}
}