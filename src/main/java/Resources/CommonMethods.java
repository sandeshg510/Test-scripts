package Resources;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import PageObjectModel.LoginObjectModel;
import PageObjectModel.PageObjectModel;

public class CommonMethods extends PageObjectModel{

	public CommonMethods(WebDriver driver2) {
		super(driver2);
	}

	static String samsungprice = "";
	static String iphoneprice = "";
	static double total;

	public static void method(String productname) {

		PageObjectModel pmo = new PageObjectModel(driver);
		List<WebElement> pric = driver.findElements(By.xpath("//p[@class='price']"));

		pmo.b();

		List<WebElement> name = driver.findElements(By.xpath("//h4"));

		for (int i = 0; i < pmo.b().size(); i++) {

			String text = pmo.b().get(i).getText();

			if (text.equalsIgnoreCase(productname)) {

				samsungprice = pric.get(i).getText();

				driver.findElement(By.xpath("//div[@class=\"button-group\"]//i[@class='fa fa-shopping-cart']")).click();
				break;
			}
		}
	}

	public static void method1(String productname) {

		PageObjectModel pmo = new PageObjectModel(driver);
		List<WebElement> pric = driver.findElements(By.xpath("//p[@class='price']"));

		pmo.b();

		for (int i = 0; i < pmo.b().size(); i++) {

			String text = pmo.b().get(i).getText();

			if (text.equalsIgnoreCase(productname)) {

				iphoneprice = pric.get(i).getText();

				driver.findElement(By.xpath("//div[@class=\"button-group\"]//i[@class='fa fa-shopping-cart']")).click();
				break;
			}
		}
	}
//		System.out.println(total);

	public static void pricesaresame() {
		String actualsamsungprice = samsungprice.substring(1, 7);
		String actualiphoneprice = iphoneprice.substring(1, 7);

		double a = Double.parseDouble(actualsamsungprice);
		double b = Double.parseDouble(actualiphoneprice);
		total = a + b;
		PageObjectModel POM = new PageObjectModel(driver);
		String cartTotal = POM.totalcart.substring(1, 7);
		double CartTotal = Double.parseDouble(cartTotal);

		System.out.println(total);
		System.out.println(CartTotal);

		if (total == CartTotal) {
			System.out.println("Both prices are same");
		} else {
			System.out.println("Both prices are not same");
		}
	}

	public static void headers(String name) {

		List<WebElement> header = driver.findElements(By.xpath("//ul[@class=\"nav navbar-nav\"]//li"));

		System.out.println(header.size());

		String headertext = "";
		for (int i = 0; i < header.size(); i++) {
			headertext = header.get(i).getText();
			if (headertext.equalsIgnoreCase(name)) {

				header.get(i).click();
				break;
			}
		}
	}

	public void currency(String currencyname) throws InterruptedException {

		driver.findElement(By.xpath("//div//button//i[@class=\"fa fa-caret-down\"]")).click();
		Thread.sleep(2000);

		List<WebElement> currencies = driver.findElements(By.xpath("//ul//li//button"));
		String text = "";
		for (int i = 0; i < currencies.size(); i++) {
			text = currencies.get(i).getText();

			if (text.equalsIgnoreCase(currencyname)) {

				currencies.get(i).click();

			}
		}
	}

	public static void handleAssertions(String Expected) {
//		String expected=Expected;
		String Actual = driver.findElement(By.xpath("//div//h1")).getText();
		
		SoftAssert assertions= new SoftAssert();
		
		assertions.assertEquals(Actual, Expected);
		
		assertions.assertAll();
		
		System.out.println(Actual);
	}
	public static void BhandleAssertions(String expectedString) throws InterruptedException {
	
		String actual = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
		
		Thread.sleep(2000);
		String expected = expectedString;

		SoftAssert assertion = new SoftAssert();

		assertion.assertEquals(actual, expected);

		assertion.assertAll();
	
		System.out.println(actual);
	}
	public static void IhandleAssertions(String expected) throws InterruptedException {
		
		String actual = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
		
		Thread.sleep(2000);
		String expectedString = expected;

		SoftAssert assertion = new SoftAssert();

		assertion.assertEquals(actual, expectedString);

		assertion.assertAll();
	
		System.out.println(actual);
	}
public static void handleAssertionsforgotPass(String expected) throws InterruptedException {
		
		String actual = driver.findElement(By.xpath("//div[@class='col-sm-9']/p")).getText();
		
		Thread.sleep(2000);

		SoftAssert assertion = new SoftAssert();

		assertion.assertEquals(actual, expected);

		assertion.assertAll();
	
		System.out.println(actual);
	}
	public static void AssertionsForAttempts(String expected) throws InterruptedException {
	
	String actual = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
	
	Thread.sleep(2000);
	String expectedString = expected;

	SoftAssert assertion = new SoftAssert();

	assertion.assertEquals(actual, expectedString);

	assertion.assertAll();

	System.out.println(actual);}

	
	public void mousehover(String name) {
		List<WebElement> header = driver.findElements(By.xpath("//ul[@class=\"nav navbar-nav\"]//li"));

		System.out.println(header.size());

		String headertext = "";
		for (int i = 0; i < header.size(); i++) {
			headertext = header.get(i).getText();
			if (headertext.equalsIgnoreCase(name)) {
				Actions actions = new Actions(driver);
actions.moveToElement(header.get(i));
				
				break;
			}
		}
		
//		Actions actions = new Actions(driver);
		
//		actions.moveToElement(null)
		
	}

	
	
}
