package cases.report.custom;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.report.custom.CustomPage;
import util.SeleniumTestCase;
import util.TestUtil;

public class AddReportTest extends SeleniumTestCase {

	CustomPage customPage;
	String name;

	@Test(description = "添加基本报告")
	public void addBasic(){

		customPage = new CustomPage(driver);
		new Actions(driver).moveToElement(customPage.getCreateReport()).perform();
		name = param.getString("nameBasic");
		customPage.addBasic(name);

		Assert.assertTrue(TestUtil.getValueList(customPage.getNames())
						.contains(name), "添加基本报告验证错误");
	}

	@Test(dependsOnMethods = "addBasic",description = "添加定时报告")
	public void addRegular(){

		new Actions(driver).moveToElement(customPage.getCreateReport()).perform();
		name = param.getString("nameRegular");
		String ip = param.getString("ip");
		customPage.addRegular(name,ip);

		Assert.assertTrue(TestUtil.getValueList(customPage.getNames())
				.contains(name), "添加定时报告验证错误");
	}

	@Test(dependsOnMethods = "addBasic",description = "添加综合报告")
	public void addCompre(){

		new Actions(driver).moveToElement(customPage.getCreateReport()).perform();
		name = param.getString("nameCompre");
		String version = param.getString("version");
		String mail = param.getString("mail");
		customPage.addCompre(driver,name,version,mail);

		Assert.assertTrue(TestUtil.getValueList(customPage.getNames())
				.contains(name), "添加综合报告验证错误");
	}

}
