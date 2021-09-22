package cases.firewall.setup.secureshare;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.firewall.setup.secureshare.SecureSharePage;
import util.SeleniumTestCase;

public class ClickTest extends SeleniumTestCase {

	SecureSharePage secureSharePage;

	@Test(description = "点击操作")
	public void click(){

		secureSharePage = new SecureSharePage(driver);
		secureSharePage.clickUtil();

		Assert.assertTrue(secureSharePage.getDefaultShare().isSelected(),"默认共享验证错误");
		Assert.assertTrue(secureSharePage.getRemoteMan().isSelected(),"远程管理验证错误");
		Assert.assertTrue(secureSharePage.getShareFile().isSelected(),"共享文件夹验证错误");
		Assert.assertTrue(secureSharePage.getAccessLog().isSelected(),"访问日志验证错误");
		Assert.assertTrue(secureSharePage.getAccess().isSelected(),"允许访问验证错误");
		Assert.assertTrue(secureSharePage.getNoAccess().isSelected(),"禁止访问验证错误");
		Assert.assertTrue(secureSharePage.getForbidIp().isSelected(),"禁止IP访问验证错误");
	}
}
