package cases.terminal.setup.centerser;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.terminal.setup.centerser.CenterSerPage;
import util.SeleniumTestCase;

public class RenewTest extends SeleniumTestCase {

	CenterSerPage centerSerPage;

	@Test(description = "恢复默认")
	public void renew(){

		centerSerPage = new CenterSerPage(driver);
		centerSerPage.renew();
		centerSerPage.renewUtil(driver);

		Assert.assertFalse(centerSerPage.getOpen().isSelected(),"恢复中心发现代理开启验证错误");
		Assert.assertFalse(centerSerPage.getCheck().isSelected(),"恢复中心发现代理检查验证错误");
		Assert.assertEquals(centerSerPage.getWebInterval().getText(),expect.getString("interval"),"恢复间隔验证错误");
		Assert.assertEquals(centerSerPage.getWebBand().getText(),expect.getString("band"),"恢复带宽限制验证错误");
		Assert.assertEquals(centerSerPage.getWebServerRenew().getText(),"","恢复服务器列表验证错误");
		Assert.assertEquals(centerSerPage.getLimitStart().getAttribute("value")
				,"","恢复生效时间开始验证错误");
		Assert.assertEquals(centerSerPage.getLimitEnd().getAttribute("value")
				,"","恢复生效时间结束验证错误");
	}
}
