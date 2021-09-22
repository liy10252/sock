package cases.firewall.setup.tamper;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.firewall.setup.tamper.TamperPage;
import util.SeleniumTestCase;

public class RenewTest extends SeleniumTestCase {

	TamperPage tamperPage;

	@Test(description = "恢复默认")
	public void renew(){

		tamperPage = new TamperPage(driver);

		tamperPage.renew();

		Assert.assertFalse(tamperPage.getOpen().isSelected(),"恢复启用错误");
		Assert.assertFalse(tamperPage.getMac().isSelected(),"恢复MAC防篡改错误");
		Assert.assertFalse(tamperPage.getLog().isSelected(),"恢复记录日志错误");
	}
}
