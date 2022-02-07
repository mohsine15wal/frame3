package opencart_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;

public class registration_page 
{
	
	WebDriver driver;
	
	public registration_page (WebDriver driver) 
	{
		
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy( xpath="//input[@id='input-username']")
		WebElement username;

	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement firstName;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement lastName;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement email;
	
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement password;

	@FindBy(xpath="(//button[text()='Register'])[1]")
	
	WebElement submitButton;
	
	@FindBy(xpath = "(//*[text()=\"Login\"])[2]")
	WebElement login;
	

public void username() {
	username.sendKeys("test");
	
}

public void firstName() {
	firstName.sendKeys("Smith");
	
}

public void lastName() {
	lastName.sendKeys("jon");
	
}

public void email() {
	email.sendKeys("test@gmail.com");
	
}

public void country() {
	String text="France";
	WebElement element = driver.findElement(By.xpath("//select[@id='input-country']"));
	Select select = new Select(element);
	select.selectByVisibleText(text);
}

public void password() {
	password.sendKeys("test");
	
}

public void submitButton() {
	submitButton.click();
	
}
public void login() {
	login.click();
	
}








}
