package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddCredentialPage {
	private static WebElement element = null;

	public static WebElement AddCredUserNameField(WebDriver driver) {
		element = driver.findElement(By.name("username"));
		return element;
	}

	public static WebElement AddCredPortalField(WebDriver driver) {
		element = driver.findElement(By.name("portal"));
		return element;
	}

	public static WebElement AddCredProjrctIdDropdown(WebDriver driver) {
		element = driver.findElement(By.name("projectId"));
		return element;
	}

	public static WebElement AddCredPasswordField(WebDriver driver) {
		element = driver.findElement(By.name("password"));
		return element;
	}

	public static WebElement AddCredUrlField(WebDriver driver) {
		element = driver.findElement(By.name("url"));
		return element;
	}

	public static WebElement AddCredSaveBtn(WebDriver driver) {
		element = driver.findElement(By.xpath("//span[contains(text(),'Save details')]/ancestor::button"));
		return element;
	}

}
