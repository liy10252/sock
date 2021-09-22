package cases.systemcenter.setupcenter;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.systemcenter.setupcenter.SetupCenterPage;
import util.SeleniumTestCase;

public class GroupRuleTest extends SeleniumTestCase {

	SetupCenterPage setupPage;

	@Test(description = "添加规则")
	public void add(){

		setupPage = new page.systemcenter.setupcenter.SetupCenterPage(driver);
		String ip = param.getString("ip");
		String sys = param.getString("sys");
		String name = param.getString("name");
		setupPage.addGroupRule(ip,sys,name);

		Assert.assertTrue(setupPage.getRuleNum().size() == 1,"添加规则验证错误");
		Assert.assertEquals(setupPage.getIpText().getAttribute("value"),
				ip,"添加IP规则验证错误");
//		Assert.assertEquals(setupPage.getSysText().getAttribute("value"),
//				sys,"添加系统规则验证错误");
//		Assert.assertEquals(setupPage.getNameText().getAttribute("value"),
//				name,"添加计算机名称规则验证错误");
	}

	@Test(dependsOnMethods = "add",description = "删除规则")
	public void delete(){

		setupPage.delGroupRule(driver);

		Assert.assertTrue(setupPage.getDelValue().getText().isEmpty(),
				"删除规则验证错误");
	}
}
