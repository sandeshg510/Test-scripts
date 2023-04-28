package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Resources.BaseClass;

public class PageObjectModel extends BaseClass {

	public static WebDriver driver;

	private By searchbox = By.xpath("//input[@name='search']");

	private By searchbutton = By.xpath("//button[@class='btn btn-default btn-lg']");

	public static By samsungproducts = By.xpath("//h4");

	private By addtocartforiphone = By.xpath("//button[@onclick=\"cart.add('40', '1');\"]");

	private static By opencart = By.xpath("//button[@class=\'btn btn-inverse btn-block btn-lg dropdown-toggle\']");

	public static String totalcart = "";

	public List<WebElement> b() {

		return driver.findElements(By.xpath("//h4"));
	}

	public WebElement ClickOnSearchBox() {
		return driver.findElement(searchbox);

	}

	public WebElement ClickToSearch() {
		return driver.findElement(searchbutton);

	}

	public WebElement ClickOnAddtoCart() {
		return driver.findElement(addtocartforiphone);
	}

	public static String ClickOnOpenCart() {
		driver.findElement(opencart).click();
		return totalcart = driver.findElement(By.xpath("(//tbody//td[@class=\"text-right\"])[12]")).getText();
	}

	public PageObjectModel(WebDriver driver2) {
		this.driver = driver2;
	}
}
