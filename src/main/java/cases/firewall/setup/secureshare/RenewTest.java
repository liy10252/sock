package cases.firewall.setup.secureshare;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.firewall.setup.secureshare.SecureSharePage;
import util.SeleniumTestCase;

public class RenewTest extends SeleniumTestCase {

	SecureSharePage secureSharePage;

	@Test(description = "恢复默认")
	public void renew(){

		secureSharePage = new SecureSharePage(driver);
		secureSharePage.renew();

		Assert.assertFalse(secureSharePage.getDefaultShare().isSelected(),"恢复默认共享验证错误");
		Assert.assertFalse(secureSharePage.getRemoteMan().isSelected(),"恢复远程管理验证错误");
		Assert.assertFalse(secureSharePage.getShareFile().isSelected(),"恢复共享文件夹验证错误");
		Assert.assertFalse(secureSharePage.getAccessLog().isSelected(),"恢复访问日志验证错误");
		Assert.assertFalse(secureSharePage.getAccess().isSelected(),"恢复允许访问验证错误");
		Assert.assertFalse(secureSharePage.getNoAccess().isSelected(),"恢复禁止访问验证错误");
		Assert.assertTrue(secureSharePage.getAllowIp().isSelected(),"恢复只允许指定IP验证错误");
		Assert.assertTrue(secureSharePage.getWebTable().getText().isEmpty(),"恢复规则列表验证错误");
	}
}
