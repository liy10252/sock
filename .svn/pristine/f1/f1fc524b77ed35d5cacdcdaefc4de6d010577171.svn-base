package cases.firewall.setup.limitweb;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.firewall.setup.limitweb.LimitWebPage;
import util.SeleniumTestCase;

public class ClickTest extends SeleniumTestCase {

	LimitWebPage limitWebPage;

	@Test(description = "点击操作一")
	public void clickOne(){

		limitWebPage = new LimitWebPage(driver);
		limitWebPage.clickOne();

		Assert.assertTrue(limitWebPage.getWebManage().isSelected(),"受限网址验证错误");
		Assert.assertTrue(limitWebPage.getSmart().isSelected(),"智能记录验证错误");
	}

	@Test(dependsOnMethods = "clickOne",description = "点击操作二")
	public void clickTwo(){

		limitWebPage.clickTwo();

		Assert.assertTrue(limitWebPage.getRecordAll().isSelected(),"记录所有验证错误");
	}
}
