package actions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FbHomePage;
import pages.LoginPage;
import pages.StartBrowser;

public class FbHomeTestSuite {
	
	static WebDriver driver = null;

	@BeforeTest
	public void startUp() throws IOException {
		StartBrowser openConnection = new StartBrowser(driver);
		driver = openConnection.initializeBrowser();
	}
	
	@Test
	public void successfulPost() throws IOException, InterruptedException {
		
		LoginTestSuite login = new LoginTestSuite(driver);
		login.successulLogin();
		
		System.out.println("successfulPost Test Starts");
		
		FbHomePage FbHomePage = new FbHomePage(driver);
		FbHomePage.waitForElement();
		FbHomePage.verifyVideoIconIsPresent();
		
		Thread.sleep(3000);
		FbHomePage.clickStatusBox();
		
		Thread.sleep(5000);
		FbHomePage.clearIframeStatusBox();
		FbHomePage.clickIframeCreatePostBox();
			
		Thread.sleep(3000);
		FbHomePage.enterTextIntoStatusBox("Hello World");
		
		Thread.sleep(2000);
		FbHomePage.postMessage();
		

	}

}
