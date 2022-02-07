package opencart_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {
	WebDriver driver;
	
	public login(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
				
	}
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement emailogin;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement passwordlogin;
	
	@FindBy(xpath="//button[text()=\"Login\"]")
	WebElement loginbutton;
	
	public void emailogin() {
		emailogin.sendKeys("test359@gmail.com");
		
	}
	
	public void passwordlogin() {
		passwordlogin.sendKeys("test359");
		
	}
	public void loginbutton() {
		loginbutton.click();
		
	}
	
	
	
	
	
}
