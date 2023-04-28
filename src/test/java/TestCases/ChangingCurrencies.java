package TestCases;

import org.testng.annotations.Test;

import PageObjectModel.PageObjectModel;
import Resources.BaseClass;
import Resources.CommonMethods;
import Resources.constant;

public class ChangingCurrencies extends BaseClass {

	@Test
	public void VerifyChangingCurrencies() throws InterruptedException {

		PageObjectModel POM = new PageObjectModel(driver);
		CommonMethods CM = new CommonMethods(driver);

		CM.currency(constant.currency1);
		Thread.sleep(2000);

	}
}
