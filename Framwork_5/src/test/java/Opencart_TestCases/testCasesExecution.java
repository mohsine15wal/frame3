package Opencart_TestCases;

import org.testng.annotations.Test;

import opencart_pages.homePage;
import opencart_pages.login;
import opencart_pages.registration_page;
import opencart_utilities.Browser_factory;

public class testCasesExecution extends Browser_factory{
  @Test
 
  public void f() throws InterruptedException {
	 
	  homePage hp =new homePage(driver);
	  hp.Regester_button();
	  
	  registration_page Rp = new registration_page(driver);
	  Rp.username();
	  Rp.firstName();
	  Rp.lastName();
	  Rp.email();
	  Rp.country();
	  Rp.password();
	  Rp.submitButton();
	  Rp.login();
	  
	  login log =new login(driver);
	  log.emailogin();
	  log.passwordlogin();
	  log.loginbutton();
	  
	  
	  
  }
}
