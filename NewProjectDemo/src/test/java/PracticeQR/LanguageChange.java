package PracticeQR;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LanguageChange {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--lang=en-GB");
		WebDriver driver=null;
//		URL url = new URL("https://www.televisa.com/");
		URL url = new URL("https://www.bbc.com/mundo");
//		 driver = new RemoteWebDriver(url, options);
		
//		Thread.sleep(2000);
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.navigate().to(url);
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40l));
//		driver.get("https://www.televisa.com/");
		
//		driver.get("https://www.bbc.com/mundo");
//		driver.get("https://manytools.org/http-html-text/browser-language/");
		Thread.sleep(3000);

		
//		ChromeOptions options1 = new ChromeOptions();
//		options1.addArguments("--lang=es");
//		Thread.sleep(2000);
//		WebDriver driver1 = new ChromeDriver(options1);
//		driver1.manage().window().maximize();
//		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(40l));
////		driver.get("https://www.bbc.com/mundo");
//		driver1.get("https://manytools.org/http-html-text/browser-language/");
//		Thread.sleep(3000);
	}
}
