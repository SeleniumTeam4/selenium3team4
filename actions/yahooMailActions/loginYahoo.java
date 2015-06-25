package yahooMailActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import yahooMail.loginPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;


public class loginYahoo {
	WebDriver driver;
	loginPage objLogin; 
	
	// Enter user name
	public void enterUserName(String strUserName){
		WebElement userName = driver.findElement(By.xpath(objLogin.userNameTextBox));
		
		userName.sendKeys(strUserName);	
	}
	
	// Enter password
	public void enterPassword(String strPassword){
		WebElement password = driver.findElement(By.xpath(objLogin.passwordTextBox));
	}
}
