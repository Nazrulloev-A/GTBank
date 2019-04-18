package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.GtplBankNewCustomerWebElements;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GtplBankNewCastomerAutomation {
	


WebDriver driver;
	
	
	@BeforeTest
	public void setUp() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/V1/html/addcustomerpage.php");

}

	@Test
	public void NewCustomer() {
		GtplBankNewCustomerWebElements customer = new GtplBankNewCustomerWebElements(driver);
		customer.NewCustomerLink.click();
		customer.CustomerName.sendKeys("Smith");
		customer.male.click();
		customer.dob.sendKeys("10/10/1998");
		customer.Address.sendKeys("4040 Royer rd");
		customer.City.sendKeys("Toledo");
		customer.State.sendKeys("OH");
		customer.pin.sendKeys("123454");
		customer.Telephone.sendKeys("8006053231");
		customer.Email.sendKeys("blin.lolo@inbox.ru");
		customer.submitButton.click();
	
	
}
	
	
	@AfterTest
	public void closeUp() {
		driver.close();
		driver.quit();
		
	}
	
}

	
	