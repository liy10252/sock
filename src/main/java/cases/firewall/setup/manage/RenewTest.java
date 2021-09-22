package cases.firewall.setup.manage;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.firewall.setup.manage.ManagePage;
import util.SeleniumTestCase;

public class RenewTest extends SeleniumTestCase {

	ManagePage managePage;

	@Test(description = "恢复默认")
	public void renew(){

		managePage = new ManagePage(driver);

		managePage.renew();

		Assert.assertTrue(managePage.getOpen().isSelected(),"恢复启用错误");
		Assert.assertTrue(managePage.getPromptUser().isSelected(),"恢复提示用户错误");
		Assert.assertTrue(managePage.getMind().isSelected(),"恢复检查方式错误");
	}
}
