package cases.viruskill.setup.whitelist;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.viruskill.setup.whitelist.WhiteListPage;
import util.SeleniumTestCase;

public class OtherTest extends SeleniumTestCase {

	WhiteListPage whiteListPage;

	@Test(description = "扩展名和忽略本地")
	public void other(){

		whiteListPage = new WhiteListPage(driver);
		String name = param.getString("name");
		whiteListPage.otherUtil(name);

		Assert.assertTrue(whiteListPage.getIgnore().isSelected(),"忽略本地验证错误");
		Assert.assertEquals(whiteListPage.getExtend().
				getAttribute("value"),name,"扩展名验证错误");
	}
}
