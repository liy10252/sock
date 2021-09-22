package cases.viruskill.setup.blacklist;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.viruskill.setup.blacklist.BlackListPage;
import util.SeleniumTestCase;

public class RenewTest extends SeleniumTestCase {

	BlackListPage blackListPage;

	@Test(description = "恢复默认")
	public void renew(){


		blackListPage = new BlackListPage(driver);
		blackListPage.renew();

		Assert.assertTrue(blackListPage.checkItems
				(blackListPage.getWebTr(),""),"恢复黑名单验证错误");
	}
}
