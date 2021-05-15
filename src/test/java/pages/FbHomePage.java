package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FbHomePage {

	private WebDriver driver = null;

	By statusBox = By.xpath("//span[contains(text(),\"What's on your mind, Jude?\")]");
	By videoIcon = By.xpath("//span[contains(text(),'Live Video')]");
	By iframeCreatePostBox = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]");
	By iframePostButton = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]/span[1]");
	
	
	
	public FbHomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	//To wait until my status box element is present 
	public void waitForElement() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(statusBox));
	}
	
	public void clearIframeStatusBox() {
		driver.findElement(iframeCreatePostBox).clear();
		System.out.println("status box field Successfully Cleared");
	}
	
	public void clickStatusBox() {
		driver.findElement(statusBox).click();
		System.out.println("status box field clicked successfully");
	}
	
	public void clickIframeCreatePostBox() {
		driver.findElement(iframeCreatePostBox).click();
		System.out.println("iframe status box field clicked successfully");
	}
	
	public void verifyVideoIconIsPresent() {
		if(driver.findElement(videoIcon).isDisplayed())
		{
			System.out.println("video icon is present");
		}else {
			System.out.println("video icon is absent");
		}
	}
	
	public void enterTextIntoStatusBox(String text) {
		driver.findElement(iframeCreatePostBox).sendKeys(text);
		System.out.println("Hello World Successfully Entered");
	}
	
	public void postMessage() {
		driver.findElement(iframePostButton).clear();
		System.out.println("status is posted successfully");
	}
	
	
}
