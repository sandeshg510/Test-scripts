package TestCases;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PageObjectModel.PageObjectModel;
import Resources.BaseClass;
import Resources.CommonMethods;
import Resources.constant;

public class ComparingthePrices extends BaseClass {
	@Test
	public void method() throws InterruptedException {

		PageObjectModel POM = new PageObjectModel(driver);

		POM.ClickOnSearchBox().sendKeys(constant.firstsearchkeyword);
		Thread.sleep(2000);
		POM.ClickToSearch().click();
		CommonMethods.method(constant.firstproductname);
		POM.ClickOnSearchBox().clear();
		POM.ClickOnSearchBox().sendKeys(constant.secondsearchkeyword);
		Thread.sleep(2000);
		POM.ClickToSearch().click();
		CommonMethods.method1(constant.secondproductname);
		Thread.sleep(2000);
		POM.ClickOnOpenCart();
		CommonMethods.pricesaresame();
	}
}