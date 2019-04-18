package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GtplBankNewCustomerWebElements {

public GtplBankNewCustomerWebElements(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

@FindBy(linkText="New Customer")
public WebElement NewCustomerLink;

@FindBy(name="name")
public WebElement CustomerName;

@FindBy(name="rad1")
public WebElement male;

@FindBy(id="dob")
public WebElement dob;

@FindBy(name="addr")
public WebElement Address;

@FindBy(name="city")
public WebElement City;

@FindBy(name="state")
public WebElement State;

@FindBy(name="pinno")
public WebElement pin;

@FindBy(name="telephoneno")
public WebElement Telephone;

@FindBy(name="emailid")
public WebElement Email;

@FindBy(name="sub")
public WebElement submitButton;




}
