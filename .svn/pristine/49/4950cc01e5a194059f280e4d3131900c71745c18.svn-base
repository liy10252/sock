package cases.firewall.overview;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.firewall.overview.OverViewPage;
import util.SeleniumTestCase;

public class HackerTest extends SeleniumTestCase {

	OverViewPage overViewPage;

	@Test(description = "已开启")
	public void open(){

		overViewPage = new OverViewPage(driver);
		overViewPage.getCustomSearch().click();
		overViewPage.singleClick(overViewPage.getHackerAll(),overViewPage.getHackerOpen(),4);
		Assert.assertTrue(overViewPage.checkItems(overViewPage.getWebHackers(),
				expect.getString("openState")),"已开启验证失败");

	}

	@Test(dependsOnMethods = "open",description = "已关闭")
	public void close(){

		overViewPage.singleClick(overViewPage.getHackerAll(),overViewPage.getHackerClose(),5);
		Assert.assertTrue(overViewPage.checkItems(overViewPage.getWebHackers(),
				expect.getString("closeState")),"已关闭验证失败");
	}
}
