package pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver = null;

	By fblogo = By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]");
	By fbText = By.xpath("//h2[contains(text(),'Facebook helps you connect and share with the people')]");
	By emailField = By.id("email");
	By passwordField = By.id("pass");
	By forgotPassword = By.linkText("Forgotten password?");
	By createButton = By.linkText("Create New Account");
	By loginButton = By.name("login");
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void verifyfblogoIsPresent() {
		if(driver.findElement(fblogo).isDisplayed())
		{
			System.out.println("facebook logo is present");
		}else {
			System.out.println("facebook logo is absent");
		}
	}

	public void verifyfbTextIsPresent() {
		String message = driver.findElement(fbText).getText();
		if(driver.findElement(fbText).isDisplayed() && message.equals("Facebook helps you connect and share with the people in your life."))
		{
			System.out.println("facebook text is present");
		}else {
			System.out.println("facebook text is absent");
		}
		assertEquals(message, "Facebook helps you connect and share with the people in your life.");
	}
	
	public void clearEmailField() {
		driver.findElement(emailField).clear();
		System.out.println("email Text Field Successfully Cleared");
	}
	
	public void clearPasswordField() {
		driver.findElement(passwordField).clear();
		System.out.println("password Field Successfully Cleared");
	}
	
	public void enterTextInEmailField(String text) {
		driver.findElement(emailField).sendKeys(text);
		System.out.println("Email Successfully Entered");
	}
	
	public void enterTextInPasswordField(String text) {
		driver.findElement(passwordField).sendKeys(text);
		System.out.println("Password Successfully Entered");
	}
	
	public void forgotPasswordLinkIsPresent() {
		String message = driver.findElement(forgotPassword).getText();
		if(driver.findElement(forgotPassword).isDisplayed())
		{
			System.out.println("forgot password link is present");
		}else {
			System.out.println("forgot password link is absent");
		}
		assertEquals(message, "Forgotten password?");
	}
	
	public void createButtonIsPresent() {
		String message = driver.findElement(createButton).getText();
		if(driver.findElement(createButton).isDisplayed())
		{
			System.out.println("create button link is present");
		}else {
			System.out.println("create button link is absent");
		}
		assertEquals(message, "Create New Account");
	}
	
	public void clickLogInButton() {
		driver.findElement(loginButton).click();
		System.out.println("Log in button clicked successfully");
	}
	
	
}
