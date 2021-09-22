package cases.firewall.setup.rule;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.firewall.setup.rule.RulePage;
import util.SeleniumTestCase;

public class CustomTest extends SeleniumTestCase {

	RulePage rulePage;

	@Test(description = "添加自定义")
	public void customAdd(){

		rulePage = new RulePage(driver);

		String name = param.getString("name");
		String localIp = param.getString("localIp");
		String remoteIp = param.getString("remoteIp");

		rulePage.addCustom(driver,name,localIp,remoteIp);

		Assert.assertFalse(rulePage.getOpenCustom().isSelected(),"启用自定义错误");
		Assert.assertEquals(rulePage.getWebCustom().getText(),name,"添加自定义错误");
	}

	@Test(dependsOnMethods = "customAdd",description = "修改")
	public void update(){

		String name = param.getString("nameGai");
		String ip = param.getString("localGai");

		rulePage.updateCustom(name,ip);
		rulePage.getEditHouBtn().click();

		Assert.assertEquals(rulePage.getName().getAttribute("value"),name,"名称修改错误");
		Assert.assertFalse(rulePage.getCustomAlert().isSelected(),"通知用户错误");
		Assert.assertFalse(rulePage.getCusIp().isSelected(),"允许联网错误");
		Assert.assertTrue(rulePage.getOut().isSelected(),"方向错误");
		Assert.assertEquals(rulePage.getLocal().getAttribute("value"),ip,"本地错误");
	}
}
