package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Resources.BaseClass;

public class RegisterObjectModel extends BaseClass {

	private By myAccount = By.linkText("My Account");
	private By Register = By.linkText("Register");

	private By firstname = By.xpath("//input[@name='firstname']");
	private By lastname = By.xpath("//input[@name='lastname']");
	private By email = By.xpath("//input[@name='email']");
	private By telephone = By.xpath("//input[@name='telephone']");
	private By password = By.xpath("//input[@name='password']");
	private By confirmpassword = By.xpath("//input[@name='confirm']");

	public RegisterObjectModel(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	this.driver=driver2;
	}
	
	public  void ClickOnmyAccount() {
		 driver.findElement(myAccount).click();
	}
	public  void ClickOnRegister() {
		 driver.findElement(Register).click();
	}
	
	public WebElement enterFirstname() {
		return driver.findElement(firstname);
	}

	public WebElement enterlastname() {
		return driver.findElement(lastname);
	}

	public WebElement enteremail() {
		return driver.findElement(email);
	}

	public WebElement entertelephone() {
		return driver.findElement(telephone);
	}

	public WebElement enterpassword() {
		return driver.findElement(password);
	}

	public WebElement confirmpassword() {
		return driver.findElement(confirmpassword);
	}
	public void subscribe() {
	List<WebElement> box = driver.findElements(By.xpath("//div//label//input[@type='radio']"));		
	for(int i=0; i<box.size(); i++) {
		box.get(1).click();
		break;
	}
	}
	public void privacypolicy() {
	driver.findElement(By.xpath("//input[@name='agree']")).click();
	}
	public void clickOnSubmit() {
	driver.findElement(By.xpath("//input[@type='submit']")).click();	
	}

}
