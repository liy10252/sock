package cases.leakscan.setup.black;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.leakscan.setup.black.BlackPage;
import util.SeleniumTestCase;

public class AddTest extends SeleniumTestCase {

	BlackPage blackPage;

	@Test(description = "添加黑名单")
	public void add(){

		blackPage = new BlackPage(driver);
		String black = param.getString("black");

		blackPage.addTest(black);

		Assert.assertEquals(blackPage.getWebText().getText(),black,"添加黑名单错误");
	}
}
