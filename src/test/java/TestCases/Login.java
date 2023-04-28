package TestCases;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import PageObjectModel.LoginObjectModel;
import Resources.BaseClass;
import Resources.CommonMethods;
import Resources.constant;

public class Login extends BaseClass{
	@Test
	public void loginWithValidCredentials() {
		
		LoginObjectModel LOM = new LoginObjectModel(driver);
		LOM.ClickOnmyAccount();
		LOM.ClickOnLogin();
		LOM.enteremail().sendKeys(constant.email);
		LOM.enterpassword().sendKeys(constant.password);
		LOM.ClickOnLogintoSubmit();
		}
//	@Test
	public void loginWithInvalidcredentials() throws InterruptedException {
		
		LoginObjectModel LOM = new LoginObjectModel(driver);
		CommonMethods CM = new CommonMethods(driver);

		LOM.ClickOnmyAccount();
		LOM.ClickOnLogin();
		LOM.enteremail().sendKeys(constant.Iemail);
		LOM.enterpassword().sendKeys(constant.Ipassword);
		LOM.ClickOnLogintoSubmit();
		CommonMethods.IhandleAssertions(constant.expected);
		}
//	@Test
	public void loginWithInvalidEmailValidPassword() throws InterruptedException {
		
		LoginObjectModel LOM = new LoginObjectModel(driver);
		CommonMethods CM = new CommonMethods(driver);

		LOM.ClickOnmyAccount();
		LOM.ClickOnLogin();
		LOM.enteremail().sendKeys(constant.Iemail);
		LOM.enterpassword().sendKeys(constant.password);
		LOM.ClickOnLogintoSubmit();
		CommonMethods.IhandleAssertions(constant.expected);
		}
//	@Test
	public void loginWithValidEmailInvalidPassword() throws InterruptedException {
		
		LoginObjectModel LOM = new LoginObjectModel(driver);
		CommonMethods CM = new CommonMethods(driver);

		LOM.ClickOnmyAccount();
		LOM.ClickOnLogin();
		LOM.enteremail().sendKeys(constant.email);
		LOM.enterpassword().sendKeys(constant.Ipassword);
		LOM.ClickOnLogintoSubmit();
		CommonMethods.IhandleAssertions(constant.expected);
		}
//	@Test
	public void loginWithBlankCredentials() throws InterruptedException {
		Thread.sleep(2000);
		LoginObjectModel LOM = new LoginObjectModel(driver);
		CommonMethods CM = new CommonMethods(driver);
		LOM.ClickOnmyAccount();
		LOM.ClickOnLogin();
		LOM.enteremail().sendKeys(constant.Bemail);
		LOM.enterpassword().sendKeys(constant.Bpassword);
		LOM.ClickOnLogintoSubmit();
		Thread.sleep(1000);
		CommonMethods.BhandleAssertions(constant.expectedString);
}
//	@Test
	public void VerifyForgottenPassword() throws InterruptedException {
		LoginObjectModel LOM = new LoginObjectModel(driver);
		CommonMethods CM = new CommonMethods(driver);
		LOM.ClickOnmyAccount();
		LOM.ClickOnLogin();
		LOM.ClickOnForgotten();
		CommonMethods.handleAssertionsforgotPass(constant.exp);
	}	
//	@Test
	public void loginAndBrowseBack() throws InterruptedException {
		
		LoginObjectModel LOM = new LoginObjectModel(driver);
		LOM.ClickOnmyAccount();
		LOM.ClickOnLogin();
		LOM.enteremail().sendKeys(constant.email);
		LOM.enterpassword().sendKeys(constant.password);
		LOM.ClickOnLogintoSubmit();
		Thread.sleep(1000);
		driver.navigate().back();
		driver.navigate().refresh();
		LOM.ClickOnmyAccount();
		}
//	@Test
	public void VerifyInvalidLoginAttempts() throws InterruptedException {
		LoginObjectModel LOM = new LoginObjectModel(driver);
		CommonMethods CM = new CommonMethods(driver);

		LOM.ClickOnmyAccount();
		LOM.ClickOnLogin();
		LOM.enteremail().sendKeys(constant.Iemail);
		LOM.enterpassword().sendKeys(constant.Ipassword);
		LOM.ClickOnLogintoSubmit();
		LOM.ClickOnLogintoSubmit();
		LOM.ClickOnLogintoSubmit();
		LOM.ClickOnLogintoSubmit();
		LOM.ClickOnLogintoSubmit();
		LOM.ClickOnLogintoSubmit();
		Thread.sleep(1000);
		CommonMethods.AssertionsForAttempts(constant.expectedString);	
	}
//	@Test
	public void CheckWhetherLoginAfterClosingBrowser() throws InterruptedException, IOException{
		
		LoginObjectModel LOM = new LoginObjectModel(driver);
		LOM.ClickOnmyAccount();
		LOM.ClickOnLogin();
		LOM.enteremail().sendKeys(constant.email);
		LOM.enterpassword().sendKeys(constant.password);
		LOM.ClickOnLogintoSubmit();
		Thread.sleep(1000);
		driver.close();
		LOM.launch();
		driver.get("https://naveenautomationlabs.com/opencart/");
		}	




}


	



