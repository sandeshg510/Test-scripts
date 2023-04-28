package TestCases;

import org.testng.annotations.Test;

import PageObjectModel.PageObjectModel;
import Resources.BaseClass;
import Resources.CommonMethods;
import Resources.constant;

public class mouseHovering extends BaseClass{
	@Test
	public void method() throws InterruptedException {
		PageObjectModel POM = new PageObjectModel(driver);
		
		CommonMethods.headers(constant.desktops);
		Thread.sleep(2000);
		
		CommonMethods.headers(constant.laptops);
		Thread.sleep(2000);

		CommonMethods.headers(constant.components);
		Thread.sleep(2000);

	}
}

