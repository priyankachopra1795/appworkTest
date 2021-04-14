package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPage {
	private static WebElement element = null;
	
	public static WebElement SignupFirstNameField(WebDriver driver) {
		element = driver.findElement(By.name("firstName"));
		return element;
	}
	public static WebElement SignupLastNameField(WebDriver driver) {
		element = driver.findElement(By.name("lastName"));
		return element;
	}
	public static WebElement SignupEmailField(WebDriver driver) {
		element = driver.findElement(By.name("email"));
		return element;
	}
	public static WebElement SignupPasswordField(WebDriver driver) {
		element = driver.findElement(By.name("password"));
		return element;
	}
	public static WebElement SignupIAgreeCheckBox(WebDriver driver) {
		element = driver.findElement(By.name("policy"));
		return element;
	}
	public static WebElement SignupBtn(WebDriver driver) {
		element = driver.findElement(By.xpath("//span[contains(text(),'Sign up now')]/ancestor::button"));
		return element;
	}
	public static WebElement SigninLink(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")); 
		return element;
	}

}
