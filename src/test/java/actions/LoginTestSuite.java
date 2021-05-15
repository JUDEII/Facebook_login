package actions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.StartBrowser;

public class LoginTestSuite {

	static WebDriver driver = null;
	public LoginTestSuite(WebDriver driver){
		this.driver = driver;
	}

	@BeforeTest
	public void startUp() throws IOException {
		StartBrowser openConnection = new StartBrowser(driver);
		driver = openConnection.initializeBrowser();
	}
	
	@Test
	public void successulLogin() throws IOException, InterruptedException {
		System.out.println("successfulLogin Test Starts");
		
		StartBrowser system = new StartBrowser(driver);
		system.launchBaseUrl();
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.verifyfblogoIsPresent();
		loginPage.verifyfbTextIsPresent();
		Thread.sleep(2000);
		loginPage.clearEmailField();
		loginPage.clearPasswordField();
		Thread.sleep(2000);
		loginPage.enterTextInEmailField("chijuiii@yahoo.com");
		loginPage.enterTextInPasswordField("PEAKYDExt@r01.");
		Thread.sleep(2000);
		loginPage.forgotPasswordLinkIsPresent();
		Thread.sleep(2000);
		loginPage.createButtonIsPresent();
		Thread.sleep(2000);
		loginPage.clickLogInButton();
		Thread.sleep(5000);
		
		System.out.println("Login Successful. Test Passed");	

	}
	
}
