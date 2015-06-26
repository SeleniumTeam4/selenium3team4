package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import interfaces.yahooLoginPage;
<<<<<<< HEAD
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
=======
import interfaces.yahooMailHomePage;
import org.openqa.selenium.WebElement;
>>>>>>> origin/master


public class loginYahoo {
	WebDriver driver;
<<<<<<< HEAD
	yahooLoginPage objLogin = new yahooLoginPage(); 
	
	public loginYahoo(WebDriver driver) {
		this.driver = driver; 
	}
		
	// Enter user name
	public void enterUserName(String strUserName){
		WebElement userName = driver.findElement(By.xpath(objLogin.userNameTextBox));
		userName.sendKeys(strUserName);
=======
	yahooLoginPage objLogin; 
	yahooMailHomePage objYHMailHomePage;
	
	// Enter user name
	public void enterUserName(String strUserName){
		WebElement userName = driver.findElement(By.xpath(objLogin.userNameTextBox));
		userName.click();
		userName.sendKeys("12345");	
>>>>>>> origin/master
	}
	
	// Enter password
	public void enterPassword(String strPassword){
		WebElement password = driver.findElement(By.xpath(objLogin.passwordTextBox));
<<<<<<< HEAD
		password.sendKeys(strPassword);
=======
>>>>>>> origin/master
	}
	
	// Click login button
	public void clickLoginButton(){
		WebElement loginButton = driver.findElement(By.xpath(objLogin.signInButton));
<<<<<<< HEAD
		loginButton.submit();
=======
		loginButton.click();
>>>>>>> origin/master
	}
	
}
