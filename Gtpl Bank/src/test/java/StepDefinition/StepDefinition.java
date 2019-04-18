package StepDefinition;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.GtpBankLoginWebElements;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	
	WebDriver driver;
	
	@Given("user should be on the login page of Gtpl Bank")
	public void user_should_be_on_the_login_page_of_Gtpl_Bank() {
	 
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/V1/index.php");
		

	}

	@When("user should enter the valid UserId and Password")
	public void user_should_enter_the_valid_UserId_and_Password() {
		GtpBankLoginWebElements login =new GtpBankLoginWebElements(driver);
		login.username.sendKeys("mngr190551");
		login.pass.sendKeys("YbytetY");
		
	}

	@Then("user should click to Login Button to log succesfully")
	public void user_should_click_to_Login_Button_to_log_succesfully() {
		GtpBankLoginWebElements login =new GtpBankLoginWebElements(driver);
		login.loginButon.click();
		String text = login.text.getText();
		System.out.println(text);
		driver.close();
		driver.quit();
	}
	

}
