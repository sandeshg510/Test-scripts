package TestCases;

import org.testng.annotations.Test;

import PageObjectModel.PageObjectModel;
import Resources.BaseClass;
import Resources.CommonMethods;
import Resources.constant;

public class AccessingHeaders extends BaseClass{

	@Test
	public void VerifyAccessingHeadersfromHomePage() throws InterruptedException {
		
	
	PageObjectModel POM = new PageObjectModel(driver);
	
	CommonMethods.headers(constant.desktops);
	Thread.sleep(2000);
	
	CommonMethods.headers(constant.laptops);
	Thread.sleep(2000);

	CommonMethods.headers(constant.components);
	Thread.sleep(2000);

	CommonMethods.headers(constant.tablets);
	Thread.sleep(2000);

	CommonMethods.headers(constant.software);
	Thread.sleep(2000);

	CommonMethods.headers(constant.phones);
	Thread.sleep(2000);

	CommonMethods.headers(constant.cameras);
	Thread.sleep(2000);

	CommonMethods.headers(constant.header8);
	Thread.sleep(2000);

	}
}
