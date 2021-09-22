package cases.viruskill.setup.whitelist;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.viruskill.setup.whitelist.WhiteListPage;
import util.SeleniumTestCase;

public class RenewTest extends SeleniumTestCase {

	WhiteListPage whiteListPage;

	@Test(description = "恢复默认")
	public void renew(){

		whiteListPage = new WhiteListPage(driver);
		whiteListPage.renew();

		Assert.assertFalse(whiteListPage.getIgnore().isSelected(),"恢复忽略本地验证错误");
		Assert.assertTrue(whiteListPage.checkItems(whiteListPage.getWebTr(),""),"恢复白名单验证错误");
		Assert.assertEquals(whiteListPage.getExtend().
				getAttribute("value"),"","恢复扩展名验证错误");
	}
}
