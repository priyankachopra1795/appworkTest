package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage {
	private static WebElement element = null;
	
	public static WebElement SigninEmailField(WebDriver driver) {
		element = driver.findElement(By.name("email"));
		return element;
	}
	public static WebElement SigninPassword(WebDriver driver) {
		element = driver.findElement(By.name("password"));
		return element;
	}
	public static WebElement SigninBtn(WebDriver driver) {
		element = driver.findElement(By.xpath("//span[contains(text(),'Sign in now')]/ancestor::button"));
		return element;
	}
	public static WebElement SignUpLink(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[contains(text(),'Sign up')]")); 
		return element;
	}

}
