package pomm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SupportReqResPOM {
	WebDriver driver;
public SupportReqResPOM(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}

@FindBy(xpath="//h2[@id='support-heading']")
private WebElement support;

public WebElement getSupport() {
	return support;
}

public void verifySupport(WebDriver driver) {
	if(getSupport().isDisplayed()) {
		System.out.println("Support page is displayed");
//		driver.quit();
	}
}
}
