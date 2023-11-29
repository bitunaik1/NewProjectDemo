package pomm;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class reqResPOM {
	WebDriver driver;
	public reqResPOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Support ReqRes']")
	private WebElement login;
	
	public WebElement getLogin() {
		return login;
	}
	
	public void clicSupportReqRes(WebDriver driver) {
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Support ReqRes']")));
		getLogin().click();
	}

}
