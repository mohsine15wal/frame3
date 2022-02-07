package opencart_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {

	public static WebDriver driver;
	
	@FindBy(xpath = "(//*[text()='Register'])[2]")
	WebElement Regester_button;
	
	public void Regester_button() throws InterruptedException {
		 Thread.sleep(4000);
				Regester_button.click();
	}

	
	public   homePage (WebDriver driver){
		
		this.driver=driver;
		
	PageFactory.initElements(driver, this);
	
	}

}
