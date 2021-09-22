package cases.leakscan.setup.black;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.leakscan.setup.black.BlackPage;
import util.SeleniumTestCase;

public class RenewTest extends SeleniumTestCase {

	BlackPage blackPage;

	@Test(description = "恢复默认")
	public void renew(){

		blackPage = new BlackPage(driver);

		blackPage.renew();

		Assert.assertTrue(blackPage.getWebTable().getText().isEmpty(),"恢复默认错误");
	}
}
