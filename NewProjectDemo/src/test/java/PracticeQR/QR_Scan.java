package PracticeQR;

import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;
import java.time.Duration;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

import io.github.bonigarcia.wdm.WebDriverManager;

public class QR_Scan {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40l));
		driver.get("https://demo.curlythemes.com/qr/qr-codes-demo/");
		Thread.sleep(3000);
	
		
		//Get Image path src link as URL - storing as string
		String newQR= driver.findElement(By.xpath("//h4[text()='Contact QR Code']/following-sibling::*/img[@src]")).getAttribute("src");
		
		//Create an object of URL class
		URL url = new URL(newQR);
		
		//pass URL class object to store the file as image
		BufferedImage bufferImage = ImageIO.read(url);
		
		//Process the image
		LuminanceSource luminanceSource = new BufferedImageLuminanceSource(bufferImage);
//		HybridBinarizer hybridBinarizer = new HybridBinarizer(luminanceSource);
		BinaryBitmap binaryBitMap = new BinaryBitmap(new HybridBinarizer(luminanceSource));
		
		//To Extract information from QR code
		Result result=new MultiFormatReader().decode(binaryBitMap);
//		String text= result.getText();
//		System.out.println(text);
		System.out.println(result.getText());
		
		
		Thread.sleep(2000);
		driver.quit();
		
	}
}
