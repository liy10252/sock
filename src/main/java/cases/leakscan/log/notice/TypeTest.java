package cases.leakscan.log.notice;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.leakscan.log.notice.NoticePage;
import util.SeleniumTestCase;
import util.TestUtil;

public class TypeTest extends SeleniumTestCase {

	NoticePage noticePage;

	@Test(description = "操作系统")
	public void system(){

		noticePage = new NoticePage(driver);
		noticePage.getCustomSearch().click();
		noticePage.singleClick(noticePage.getTypeAll(),noticePage.getSystem(),2);
		Assert.assertTrue(TestUtil.getValueList(noticePage.getWebNames())
				.containsAll(TestUtil.JsonToList(expect.getJSONArray("system"),"name")),"操作系统错误");
	}

	@Test(dependsOnMethods = "system",description = "IE补丁")
	public void ie(){

		noticePage.singleClick(noticePage.getTypeAll(),noticePage.getIe());
		Assert.assertEquals(noticePage.getWebDataTr().findElement(By.xpath("./td[2]"))
				.getText().trim(),expect.getString("ie"),"IE补丁错误");
	}

	@Test(dependsOnMethods = "system",description = ".net补丁")
	public void net(){

		noticePage.singleClick(noticePage.getTypeAll(),noticePage.getNet());
		Assert.assertEquals(noticePage.getWebDataTr().findElement(By.xpath("./td[2]"))
				.getText().trim(),expect.getString("net"),".net补丁错误");
	}

	@Test(dependsOnMethods = "system",description = "office补丁")
	public void office(){

		noticePage.singleClick(noticePage.getTypeAll(),noticePage.getOffice());
		Assert.assertEquals(noticePage.getWebDataTr().findElement(By.xpath("./td[2]"))
				.getText().trim(),expect.getString("office"),"office补丁错误");
	}
}


