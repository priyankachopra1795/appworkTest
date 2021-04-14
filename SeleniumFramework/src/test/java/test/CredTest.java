package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import pages.*;

public class CredTest {
	private static WebDriver driver = null;

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		String projectpath = System.getProperty("user.dir");
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", projectpath + "/Driver/ChromeDriver/chromedriver.exe");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//Go To Credential Manager Sign in URL
		driver.get("https://creds.appwrk.com/sign-in");
		// click on sign up link
		SignInPage.SignUpLink(driver).click();
		
		// fill sign up details
		SignUpPage.SignupFirstNameField(driver).sendKeys("priyanka");
		SignUpPage.SignupLastNameField(driver).sendKeys("Chopra");
		SignUpPage.SignupEmailField(driver).sendKeys("pc@gmail.com");
		SignUpPage.SignupPasswordField(driver).sendKeys("password");
		SignUpPage.SignupIAgreeCheckBox(driver).click();
		
		//click on sign in link
		SignUpPage.SigninLink(driver).click();
		
		// fill sign in details
		SignInPage.SigninEmailField(driver).sendKeys("rajeshpanwar1717@gmail.com");
		SignInPage.SigninPassword(driver).sendKeys("password");
		SignInPage.SigninBtn(driver).click();
		Thread.sleep(10000);
		
		// left panel menu links click
		CredManagerPage.UsersLink(driver).click();
		CredManagerPage.GroupsLink(driver).click();
		CredManagerPage.ProjectsLink(driver).click();
		CredManagerPage.CredentialsLink(driver).click();
		
		// Click on add credential button
		CredManagerPage.AddCredentialBtn(driver).click();
		
		// Fill add credentials fields
		AddCredentialPage.AddCredUserNameField(driver).sendKeys("priyanka18");
		AddCredentialPage.AddCredPasswordField(driver).sendKeys("password");
		AddCredentialPage.AddCredPortalField(driver).sendKeys("TestPc");
		AddCredentialPage.AddCredUrlField(driver).sendKeys("pc.com");
		Select ProjectIdDropdown = new Select(AddCredentialPage.AddCredProjrctIdDropdown(driver));
		ProjectIdDropdown.selectByVisibleText("Trinity");
		AddCredentialPage.AddCredSaveBtn(driver).click();
		
		//search created credentials 
		CredManagerPage.SearchField(driver).sendKeys("priyanka18");
		driver.findElement(By.xpath("//tr[@class='MuiTableRow-root MuiTableRow-hover']")).click();
		Thread.sleep(5000);
		driver.close();
		driver.quit();
	}
}