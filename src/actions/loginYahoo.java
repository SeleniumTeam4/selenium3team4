package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import interfaces.yahooLoginPage;
import interfaces.yahooMailHomePage;
import org.openqa.selenium.WebElement;


public class loginYahoo {
	WebDriver driver;
	yahooLoginPage objLogin; 
	yahooMailHomePage objYHMailHomePage;
	
	// Enter user name
	public void enterUserName(String strUserName){
		WebElement userName = driver.findElement(By.xpath(objLogin.userNameTextBox));
		userName.click();
		userName.sendKeys("12345");	
	}
	
	// Enter password
	public void enterPassword(String strPassword){
		WebElement password = driver.findElement(By.xpath(objLogin.passwordTextBox));
	}
	
	// Click login button
	public void clickLoginButton(){
		WebElement loginButton = driver.findElement(By.xpath(objLogin.signInButton));
		loginButton.click();
	}
	
}
