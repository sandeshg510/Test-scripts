package TestCases;

import org.testng.annotations.Test;

import PageObjectModel.RegisterObjectModel;
import Resources.BaseClass;
import Resources.CommonMethods;
import Resources.constant;

public class Register extends BaseClass{
	@Test
	public void register() {
		
		RegisterObjectModel ROM = new RegisterObjectModel(driver);
		CommonMethods CM = new CommonMethods(driver);

		ROM.ClickOnmyAccount();
		ROM.ClickOnRegister();
		ROM.enterFirstname().sendKeys(constant.firstname);
		ROM.enterlastname().sendKeys(constant.lastname);
		ROM.enteremail().sendKeys(constant.newEmail);
		ROM.entertelephone().sendKeys(constant.Telephone);
		ROM.enterpassword().sendKeys(constant.password);
		ROM.confirmpassword().sendKeys(constant.confirmpassword);
		ROM.subscribe();
		ROM.privacypolicy();
		ROM.clickOnSubmit();
		CommonMethods.handleAssertions(constant.Expected);
	}
}
