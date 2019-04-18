package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GtpBankLoginWebElements {
	
public GtpBankLoginWebElements (WebDriver driver) {
	PageFactory.initElements(driver, this);
	
}

@FindBy(name="uid")
public WebElement username;

@FindBy(name="password")
public WebElement pass;


@FindBy(name="btnLogin")
public WebElement loginButon;


@FindBy(xpath="//marquee[@class='heading3']")
public WebElement text;



}

