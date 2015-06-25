package tests;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import actions.loginYahoo;
import org.testng.annotations.*;
import org.testng.asserts.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import actions.commonActions;
import interfaces.yahooLoginPage;

public class yahooLoginTest {
	WebDriver driver = new FirefoxDriver();
	loginYahoo objLogin;
	WebElement page;
	FirefoxDriver firefox;
	commonActions common;
	yahooLoginPage loginPage;
	
	@BeforeTest
	public void beforeMethod(){
		driver.get("http://mail.yahoo.com");
	}
	
	@Test
	public void loginWithValidCredential(){
		//common.waitForElementVisible(20, (loginPage.userNameTextBox));
		try {
			Thread.sleep(40);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		objLogin.enterUserName("quanleminh464@yahoo.com");
		objLogin.enterPassword("@12345678");
		objLogin.clickLoginButton();
		Assert.assertTrue("Login successfull", driver.getTitle().contains("quanleminh464") );
	}
}
