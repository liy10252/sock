package cases.report.custom;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.report.custom.CustomPage;
import util.SeleniumTestCase;

public class OperateTest extends SeleniumTestCase {

	CustomPage customPage;

	@Test(description = "立即生成报告")
	public void atOnce(){

		customPage = new CustomPage(driver);
		customPage.atOnce();

		Assert.assertTrue(customPage.getOnceAlert().isDisplayed(),"立即生成报告验证错误");
	}

	@Test(dependsOnMethods = "atOnce",description = "修改报告")
	public void revise(){

		String size = param.getString("size");
		customPage.revise(driver,size);

		Assert.assertTrue(customPage.getReAlert().isDisplayed(),"修改报告验证错误");
	}

	@Test(dependsOnMethods = "atOnce",description = "开启报告")
	public void onOff(){

		customPage.open();

		Assert.assertEquals(customPage.getOnOff().getAttribute("class").trim(),
				expect.getString("on").trim(),"开启报告验证错误");
	}

}
