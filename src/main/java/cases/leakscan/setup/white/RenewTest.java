package cases.leakscan.setup.white;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.leakscan.setup.white.WhitePage;
import util.SeleniumTestCase;

public class RenewTest extends SeleniumTestCase {

	WhitePage whitePage;

	@Test(description = "恢复默认")
	public void renew(){

		whitePage = new WhitePage(driver);

		whitePage.renew();

		Assert.assertTrue(whitePage.getWebTable().getText().isEmpty(),"恢复默认错误");
	}
}
