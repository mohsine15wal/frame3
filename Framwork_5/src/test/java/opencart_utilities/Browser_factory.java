package opencart_utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class Browser_factory {
	
	public static  WebDriver driver;
	@Parameters({"browser","site"})
	@BeforeClass
	
	public static void statrtapp()
	
		{
	
		String browser= "Chrome";
		 String url = "https://www.opencart.com/";
	
		if(browser.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			   driver = new ChromeDriver();
				driver.get(url);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.manage().deleteAllCookies();
			
			  
		} else if (browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			  driver = new FirefoxDriver();
				driver.get(url);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.manage().deleteAllCookies();
			
			
		}else if (browser.equals("IE")) 
		
		{
			System.setProperty("webdriver.IE.driver", "./drivers/IEDriverServer.exe");
			   driver = new InternetExplorerDriver();
				driver.get(url);;
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.manage().deleteAllCookies();
			 
			
		}else 
		{
			System.out.println("sorry we don't support this Browser");
		}
	
		
		
	}
	//public  void appEnd(){
	//driver.close();
	
		
	//}

}
