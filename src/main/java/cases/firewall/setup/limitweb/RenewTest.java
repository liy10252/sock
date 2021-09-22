package cases.firewall.setup.limitweb;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.firewall.setup.limitweb.LimitWebPage;
import util.SeleniumTestCase;

public class RenewTest extends SeleniumTestCase {

	LimitWebPage limitWebPage;

	@Test(description = "恢复默认")
	public void renew(){

		limitWebPage = new LimitWebPage(driver);
		limitWebPage.renew();

		Assert.assertFalse(limitWebPage.getWebManage().isSelected(),"恢复受限网址验证错误");
		Assert.assertTrue(limitWebPage.getNoRecord().isSelected(),"恢复网址访问记录验证错误");
		Assert.assertTrue(limitWebPage.getWebTable().getText().isEmpty(),"恢复受限规则验证错误");
	}
}
