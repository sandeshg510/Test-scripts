package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseClass {

	public WebDriver driver;

	public void BrowserInitialization() throws IOException {

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\ASUS\\eclipse-workspace\\DemoCartproject\\src\\main\\java\\Resources\\properties");

		Properties prop = new Properties();

		prop.load(fis);

		String browsername = prop.getProperty("browser");

		if (browsername.equalsIgnoreCase("chrome")) {

			ChromeOptions chromeOptions = new ChromeOptions();	
			 chromeOptions.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(chromeOptions);
		} else if (browsername.equalsIgnoreCase("firefox")) {
			// firefox driver declaration
		} else {
			System.out.println("please enter valid browser name");
		}
	}

	@BeforeMethod
	public void launch() throws IOException {

		BrowserInitialization();

		
		
		driver.get("https://naveenautomationlabs.com/opencart/");
		
		driver.manage().window().maximize();
	}

}
