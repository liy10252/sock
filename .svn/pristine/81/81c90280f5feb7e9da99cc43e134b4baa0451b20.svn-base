package cases.firewall.setup.netprotect;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.firewall.setup.netprotect.NetProtectPage;
import util.SeleniumTestCase;

public class RenewTest extends SeleniumTestCase {

	NetProtectPage netProtectPage;

	@Test(description = "恢复默认")
	public void renew(){

		netProtectPage = new NetProtectPage(driver);
		netProtectPage.renew();

		Assert.assertTrue(netProtectPage.getNetWork().isSelected(),
				"恢复网络防护验证错误");
		Assert.assertTrue(netProtectPage.getTrojanStart().isSelected(),
				"恢复拦截恶意木马网址验证错误");
		Assert.assertTrue(netProtectPage.getTrojanLog().isSelected(),
				"恢复拦截恶意木马网址验证错误");
		Assert.assertTrue(netProtectPage.getFishStart().isSelected(),
				"恢复拦截钓鱼网址验证错误");
		Assert.assertTrue(netProtectPage.getFishLog().isSelected(),
				"恢复拦截钓鱼网址验证错误");
		Assert.assertTrue(netProtectPage.getMaliceStart().isSelected(),
				"恢复拦截恶意下载验证错误");
		Assert.assertTrue(netProtectPage.getMaliceLog().isSelected(),
				"恢复拦截恶意下载验证错误");
		Assert.assertFalse(netProtectPage.getHackerStart().isSelected(),
				"恢复防黑客攻击验证错误");
		Assert.assertTrue(netProtectPage.getHackerLog().isSelected(),
				"恢复防黑客攻击验证错误");
		Assert.assertTrue(netProtectPage.getScriptStart().isSelected(),
				"恢复拦截跨站脚本攻击验证错误");
		Assert.assertTrue(netProtectPage.getScriptLog().isSelected(),
				"恢复拦截跨站脚本攻击验证错误");
		Assert.assertTrue(netProtectPage.getSearchStart().isSelected(),
				"恢复搜索引擎结果检查验证错误");
		Assert.assertTrue(netProtectPage.getSearchLog().isSelected(),
				"恢复搜索引擎结果检查验证错误");
		Assert.assertTrue(netProtectPage.getAdvertStart().isSelected(),
				"恢复广告过滤验证错误");
		Assert.assertTrue(netProtectPage.getAdvertLog().isSelected(),
				"恢复广告过滤验证错误");
	}
}
