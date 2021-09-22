package cases.leakscan.overview;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.leakscan.overview.OverViewPage;
import util.SeleniumTestCase;
import util.TestUtil;

public class TypeTest extends SeleniumTestCase {

	OverViewPage overViewPage;

	@Test(description = "操作系统")
	public void system(){

		overViewPage = new OverViewPage(driver);
		overViewPage.getCustomSearch().click();
		overViewPage.singleClick(overViewPage.getTypeAll(),overViewPage.getSystem(),2);
		Assert.assertTrue(TestUtil.getValueList(overViewPage.getWebNames())
				.containsAll(TestUtil.JsonToList(expect.getJSONArray("system"),"name")),"操作系统错误");
	}

	@Test(dependsOnMethods = "system",description = "IE补丁")
	public void ie(){

		overViewPage.singleClick(overViewPage.getTypeAll(),overViewPage.getIe());
		Assert.assertEquals(overViewPage.getWebDataTr().findElement(By.xpath("./td[2]"))
				.getText().trim(),expect.getString("ie"),"IE补丁错误");
	}

	@Test(dependsOnMethods = "system",description = ".net补丁")
	public void net(){

		overViewPage.singleClick(overViewPage.getTypeAll(),overViewPage.getNet());
		Assert.assertEquals(overViewPage.getWebDataTr().findElement(By.xpath("./td[2]"))
				.getText().trim(),expect.getString("net"),".net补丁错误");
	}

	@Test(dependsOnMethods = "system",description = "office补丁")
	public void office(){

		overViewPage.singleClick(overViewPage.getTypeAll(),overViewPage.getOffice());
		Assert.assertEquals(overViewPage.getWebDataTr().findElement(By.xpath("./td[2]"))
				.getText().trim(),expect.getString("office"),"office补丁错误");
	}
}
