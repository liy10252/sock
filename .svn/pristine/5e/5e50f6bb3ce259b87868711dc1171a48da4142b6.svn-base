package cases.leakscan.log.patch;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.leakscan.log.patch.PatchPage;
import util.SeleniumTestCase;
import util.TestUtil;

public class TypeTest extends SeleniumTestCase {

	PatchPage patchPage;

	@Test(description = "操作系统")
	public void system(){

		patchPage = new PatchPage(driver);
		patchPage.getCustomSearch().click();
		patchPage.singleClick(patchPage.getTypeAll(),patchPage.getSystem(),2);
		Assert.assertTrue(TestUtil.getValueList(patchPage.getWebNames())
				.containsAll(TestUtil.JsonToList(expect.getJSONArray("system"),"name")),"操作系统错误");
	}

	@Test(dependsOnMethods = "system",description = "IE补丁")
	public void ie(){

		patchPage.singleClick(patchPage.getTypeAll(),patchPage.getIe());
		Assert.assertEquals(patchPage.getWebDataTr().findElement(By.xpath("./td[2]"))
				.getText().trim(),expect.getString("ie"),"IE补丁错误");
	}

	@Test(dependsOnMethods = "system",description = ".net补丁")
	public void net(){

		patchPage.singleClick(patchPage.getTypeAll(),patchPage.getNet());
		Assert.assertEquals(patchPage.getWebDataTr().findElement(By.xpath("./td[2]"))
				.getText().trim(),expect.getString("net"),".net补丁错误");
	}

	@Test(dependsOnMethods = "system",description = "office补丁")
	public void office(){

		patchPage.singleClick(patchPage.getTypeAll(),patchPage.getOffice());
		Assert.assertEquals(patchPage.getWebDataTr().findElement(By.xpath("./td[2]"))
				.getText().trim(),expect.getString("office"),"office补丁错误");
	}
}

