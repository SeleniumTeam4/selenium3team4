package yahooTestCase;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import yahooMailActions.loginYahoo;
import org.testng.annotations.*;
import org.testng.asserts.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class yahooLoginTest {
	WebDriver driver = new FirefoxDriver();
	loginYahoo objLogin;
	WebElement page;
	FirefoxDriver firefox;
	
	@BeforeTest
	public void beforeMethod(){
		driver.get("http://mail.yahoo.com");
	}
	
	@Test
	public void loginWithValidCredential(){
		objLogin.enterUserName("quanleminh464@yahoo.com");
		objLogin.enterPassword("@12345678");
		objLogin.clickLoginButton();
		
		Assert.assertTrue("Login successfull", driver.getTitle().contains("quanleminh464") );
	}
}
