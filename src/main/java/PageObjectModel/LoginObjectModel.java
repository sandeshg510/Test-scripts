package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Resources.BaseClass;

public class LoginObjectModel extends BaseClass{

	private By myAccount = By.linkText("My Account");
	private By login = By.linkText("Login");
	private By email = By.xpath("//input[@id='input-email']");
	private By password = By.xpath("//input[@id='input-password']");
	private By submit = By.xpath("//input[@type='submit']");
	private By forgotten = By.linkText("Forgotten Password");
	private By warning = By.xpath("//div[@class='alert alert-danger alert-dismissible']");
	public LoginObjectModel(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public  void ClickOnmyAccount() {
		 driver.findElement(myAccount).click();
	}
	public  void ClickOnLogin() {
		 driver.findElement(login).click();
	}
	public WebElement enteremail() {
		return driver.findElement(email);
	}
	public WebElement enterpassword() {
		return driver.findElement(password);
	}
	public  void ClickOnLogintoSubmit() {
		 driver.findElement(submit).click();
	}
	public void ClickOnForgotten() {
		driver.findElement(forgotten).click();
	}
	public String warning() {
		String expectedString = driver.findElement(warning).getText();
		 
		return expectedString;
	}
}
