package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CredManagerPage {
	private static WebElement element = null;

	public static WebElement UsersLink(WebDriver driver) {
		element = driver.findElement(By.xpath("//p[contains(text(),'Users')]"));
		return element;
	}

	public static WebElement ProjectsLink(WebDriver driver) {
		element = driver.findElement(By.xpath("//p[contains(text(),'Projects')]"));
		return element;
	}

	public static WebElement GroupsLink(WebDriver driver) {
		element = driver.findElement(By.xpath("//p[contains(text(),'Groups')]"));
		return element;
	}

	public static WebElement CredentialsLink(WebDriver driver) {
		element = driver.findElement(By.xpath("//p[contains(text(),'Credentials')]"));
		return element;
	}

	public static WebElement AddCredentialBtn(WebDriver driver) {
		element = driver.findElement(By.xpath("//span[contains(text(),'Add Credential')]/ancestor::button"));
		return element;
	}

	public static WebElement SearchField(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@placeholder='Search credential']"));
		return element;
	}

}
