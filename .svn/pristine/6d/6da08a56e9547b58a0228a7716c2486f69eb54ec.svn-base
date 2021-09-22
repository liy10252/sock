package cases.firewall.setup.netprotect;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.firewall.setup.netprotect.NetProtectPage;
import util.SeleniumTestCase;

public class ClickTest extends SeleniumTestCase {

	NetProtectPage netProtectPage;

	@Test(description = "点击操作")
	public void click(){

		netProtectPage = new NetProtectPage(driver);
		netProtectPage.clickUtil();

		Assert.assertFalse(netProtectPage.getNetWork().isSelected(),
				"网络防护验证错误");
		Assert.assertFalse(netProtectPage.getTrojanStart().isSelected(),
				"拦截恶意木马网址验证错误");
		Assert.assertFalse(netProtectPage.getTrojanLog().isSelected(),
				"拦截恶意木马网址验证错误");
		Assert.assertFalse(netProtectPage.getFishStart().isSelected(),
				"拦截钓鱼网址验证错误");
		Assert.assertFalse(netProtectPage.getFishLog().isSelected(),
				"拦截钓鱼网址验证错误");
		Assert.assertFalse(netProtectPage.getMaliceStart().isSelected(),
				"拦截恶意下载验证错误");
		Assert.assertFalse(netProtectPage.getMaliceLog().isSelected(),
				"拦截恶意下载验证错误");
		Assert.assertTrue(netProtectPage.getHackerStart().isSelected(),
				"防黑客攻击验证错误");
		Assert.assertFalse(netProtectPage.getHackerLog().isSelected(),
				"防黑客攻击验证错误");
		Assert.assertFalse(netProtectPage.getScriptStart().isSelected(),
				"拦截跨站脚本攻击验证错误");
		Assert.assertFalse(netProtectPage.getScriptLog().isSelected(),
				"拦截跨站脚本攻击验证错误");
		Assert.assertFalse(netProtectPage.getSearchStart().isSelected(),
				"搜索引擎结果检查验证错误");
		Assert.assertFalse(netProtectPage.getSearchLog().isSelected(),
				"搜索引擎结果检查验证错误");
		Assert.assertFalse(netProtectPage.getAdvertStart().isSelected(),
				"广告过滤验证错误");
		Assert.assertFalse(netProtectPage.getAdvertLog().isSelected(),
				"广告过滤验证错误");
	}
}
