package pomm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReqPOM {
	WebDriver driver;
	public ReqPOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

//	FindBy(xpath="")
//	private WebElement supReq;
	
	@FindBy(xpath="//button[text()='Support ReqRes']")
	private WebElement supReq;

	public WebElement getSupReq() {
		return supReq;
	}
	
	public void ClickSupReq(WebDriver driver) {
		getSupReq().click();
//		driver.close();
	}

}
