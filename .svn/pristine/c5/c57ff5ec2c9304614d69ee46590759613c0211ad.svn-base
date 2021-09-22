package cases.firewall.setup.tamper;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.firewall.setup.tamper.TamperPage;
import util.SeleniumTestCase;

public class TamperTest extends SeleniumTestCase {

	TamperPage tamperPage;

	@Test(description = "ip防篡改")
	public void tamperSet(){

		tamperPage = new TamperPage(driver);

		tamperPage.tamperSet();

		Assert.assertTrue(tamperPage.getOpen().isSelected(),"启用错误");
		Assert.assertTrue(tamperPage.getMac().isSelected(),"MAC防篡改错误");
		Assert.assertTrue(tamperPage.getLog().isSelected(),"记录日志错误");
	}
}
