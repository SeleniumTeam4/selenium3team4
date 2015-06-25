import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class commonActions {
	WebDriver driver;
	WebDriverWait wait;
	ExpectedConditions expectedWait;
	WebElement element;
	
	public void waitForElementVisible(long i, By by ){
		WebDriverWait wait = new WebDriverWait(driver, i);
		wait.until(ExpectedConditions.presenceOfElementLocated(by));
	}
}
