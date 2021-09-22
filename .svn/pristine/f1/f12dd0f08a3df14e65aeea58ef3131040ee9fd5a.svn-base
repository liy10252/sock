package cases.leakscan.setup.white;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.leakscan.setup.white.WhitePage;
import util.SeleniumTestCase;

public class AddTest extends SeleniumTestCase {

	WhitePage whitePage;

	@Test(description = "添加白名单")
	public void add(){

		whitePage = new WhitePage(driver);
		String white = param.getString("white");

		whitePage.addTest(white);

		Assert.assertEquals(whitePage.getWebText().getText(),white,"添加白名单错误");
	}
}
