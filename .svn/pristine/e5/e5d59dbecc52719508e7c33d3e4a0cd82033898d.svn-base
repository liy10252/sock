package cases.firewall.setup.manage;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.firewall.setup.manage.ManagePage;
import util.SeleniumTestCase;

public class ManageTest extends SeleniumTestCase {

	ManagePage managePage;

	@Test(description = "非法外联管控")
	public void manageSet(){

		managePage = new ManagePage(driver);

		managePage.manageSet();

		Assert.assertFalse(managePage.getOpen().isSelected(),"启用错误");
		Assert.assertFalse(managePage.getPromptUser().isSelected(),"提示用户错误");
		Assert.assertTrue(managePage.getTiming().isSelected(),"检查方式错误");
	}
}
