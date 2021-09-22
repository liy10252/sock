package cases.firewall.setup.limitapp;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.firewall.setup.limitapp.LimitAppPage;
import util.SeleniumTestCase;

public class RenewTest extends SeleniumTestCase {

	LimitAppPage limitAppPage;

	@Test(description = "恢复默认")
	public void renew(){

		limitAppPage = new LimitAppPage(driver);
		limitAppPage.renew();

		Assert.assertFalse(limitAppPage.getOpenApp().isSelected(),"恢复开启程序验证错误");
//		Assert.assertFalse(limitAppPage.getOpenModule().isSelected(),"恢复启用模块验证错误");
		Assert.assertTrue(limitAppPage.getLog().isSelected(),"恢复记录拦截日志验证错误");
		Assert.assertTrue(limitAppPage.getSmart().isSelected(),"恢复智能判别验证错误");
		Assert.assertTrue(limitAppPage.getAsk().isSelected(),"恢复未知程序验证错误");
		Assert.assertTrue(limitAppPage.getWebTable().getText().isEmpty(),"恢复受限列表验证错误");
	}
}
