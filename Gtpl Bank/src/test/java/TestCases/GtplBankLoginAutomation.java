package TestCases;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import PageObjects.GtpBankLoginWebElements;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GtplBankLoginAutomation {
	
	WebDriver driver;
	
	
	@BeforeTest
	public void setUp() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/V1/index.php");
	}
	

	@Test
	public void login() {
		GtpBankLoginWebElements login =new GtpBankLoginWebElements(driver);
		login.username.sendKeys("mngr190551");
		login.pass.sendKeys("YbytetY");
		login.loginButon.click();
		String text = login.text.getText();
		System.out.println(text);
		
		
	}
	
	
	@AfterTest
	public void closeUp() {
		driver.close();
		driver.quit();
		
	}
	
	
}
