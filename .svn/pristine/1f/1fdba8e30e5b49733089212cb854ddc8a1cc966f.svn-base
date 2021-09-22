package cases.viruskill.setup.whitelist;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.viruskill.setup.whitelist.WhiteListPage;
import util.SeleniumTestCase;
import util.TestUtil;

public class WhiteListTest extends SeleniumTestCase {

	WhiteListPage whiteListPage;

	@Test(description = "添加白名单")
	public void add(){

		whiteListPage = new WhiteListPage(driver);
		whiteListPage.addWhite(TestUtil.JsonToList(param.getJSONArray("addName"),"name"));

		Assert.assertTrue(TestUtil.getValueList(whiteListPage.getWebTr()).
				containsAll(TestUtil.JsonToList(expect.getJSONArray("addValue"),"name")),"添加白名单验证错误");

	}

	@Test(dependsOnMethods ="add", description = "删除白名单")
	public void delete(){

		whiteListPage.deleteUtil();

		Assert.assertTrue(whiteListPage.getWebTr().size()
				==expect.getIntValue("delete"),"删除白名单验证错误");
	}

}
