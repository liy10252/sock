package cases.firewall.setup.whitelist;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.firewall.setup.whitelist.WhiteListPage;
import util.SeleniumTestCase;

public class RenewTest extends SeleniumTestCase {

	WhiteListPage whiteListPage;

	@Test(description = "恢复默认")
	public void renew(){

		whiteListPage = new WhiteListPage(driver);
		whiteListPage.renew();

		Assert.assertTrue(whiteListPage.getOpen().isSelected(),
				"恢复启用白名单验证错误");
		Assert.assertTrue(whiteListPage.getWebTable().getText().isEmpty(),

				"恢复白名单列表验证错误");
	}
}
